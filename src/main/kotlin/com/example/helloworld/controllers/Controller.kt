package com.example.helloworld.controllers

import com.example.helloworld.ResponseCreator
import com.example.helloworld.model.BnctData
import com.example.helloworld.service.BnctService
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import org.json.simple.JSONObject
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader

@RestController
@RequestMapping("bnct/")
class Controller(private val bnctService: BnctService) {
    val responseCreator = ResponseCreator()


    fun magic(path: String) {
        val reader = BufferedReader(InputStreamReader(FileInputStream(path), "Windows-1251"))

        val csvParser = CSVParser(
            reader, CSVFormat.DEFAULT
                .withFirstRecordAsHeader()
                .withDelimiter('	')
        )

        for (csvRecord in csvParser) {

            val data = BnctData(
                csvRecord.get("Полная дата"),
                csvRecord.get("H-/Конус (мА)"),
                csvRecord.get("H-/Линза Воблова/Слив (°C)")
            )

            bnctService.create(data)
        }
    }

    @GetMapping("start")
    fun main(): ResponseEntity<JSONObject> {
        val pathName = "D:\\BNCT_DATA"

        File(pathName).walk().forEach {
            if (it.isFile) {
                magic(it.path)
                println(it.name + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
            }
        }

        return responseCreator.ok(
            responseCreator.makeJson(
                mapOf(
                    "status" to HttpStatus.OK
                )
            )
        )
    }
}