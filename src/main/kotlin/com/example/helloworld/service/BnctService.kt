package com.example.helloworld.service

import com.example.helloworld.model.BnctData
import com.example.helloworld.repository.BnctRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class BnctService() {

    @Autowired
    var bnctRepository: BnctRepository? = null

    fun create(bnctData: BnctData) {
        println(bnctData.Polnaia_data)
        println(bnctData.H_Konus_mA)
        println(bnctData.H_Linza_Voblova_Sliv_C)
        bnctRepository?.save(bnctData)
    }
}