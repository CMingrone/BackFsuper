package com.FSuper.controller

import com.FSuper.model.Sector
import com.FSuper.service.SectorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/sector")
class SectorController {

    @Autowired
    lateinit var sectorService: SectorService

    @GetMapping("/getAll")
    fun getAll(): MutableList<Sector>? {
        return sectorService.getAll()
    }
}