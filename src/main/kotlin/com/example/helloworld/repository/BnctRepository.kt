package com.example.helloworld.repository

import com.example.helloworld.model.BnctData
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BnctRepository : CrudRepository<BnctData, String> {

}