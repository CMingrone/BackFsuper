package com.FSuper.controller

import com.FSuper.model.CarroProducto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import com.FSuper.service.CarroService


@RestController
@RequestMapping("/carro")
class CarroController {

    @Autowired
    lateinit var carroService: CarroService

    @GetMapping("/getAll")
    fun getAll(): MutableList<CarroProducto> {
        return carroService.getAll()!!.filter { it.cantidad > 0 }.toMutableList()

    }
}


