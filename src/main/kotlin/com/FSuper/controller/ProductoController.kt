package com.FSuper.controller

import com.FSuper.model.Producto
import com.FSuper.service.ProductoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/producto")
class ProductoController {

    @Autowired
    lateinit var productoService: ProductoService

    @GetMapping("/getAll")
    fun getAll(): MutableList<Producto>? {
        return productoService.getAll()
    }
    @GetMapping("/getAll/{palabraFiltro}")
    fun getAll(@PathVariable palabraFiltro : String): MutableList<Producto>? {
        return productoService.getAll()
    }
    @PostMapping("/save")
    fun save(@RequestBody producto: Producto): ResponseEntity<Producto> {
        productoService.save(producto)
        return ResponseEntity<Producto>(producto, HttpStatus.OK)
    }

    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Producto> {
        val producto = productoService.get(id)
        if (producto != null) {
            productoService.delete(id)
        } else {
            return ResponseEntity<Producto>(HttpStatus.NO_CONTENT)
        }
        return ResponseEntity<Producto>(producto, HttpStatus.OK)
    }
}