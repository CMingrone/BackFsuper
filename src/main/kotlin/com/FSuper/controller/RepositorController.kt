package com.FSuper.controller

import com.FSuper.model.Repositor
import com.FSuper.service.RepositorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/repositor")
class RepositorController {

    @Autowired
    lateinit var repositorService: RepositorService

    @GetMapping("/getAll")
    fun getAll(): MutableList<Repositor>? {
        return repositorService.getAll()
    }
}