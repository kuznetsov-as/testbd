package com.example.helloworld

import com.example.helloworld.model.BnctData
import com.example.helloworld.service.BnctService
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}