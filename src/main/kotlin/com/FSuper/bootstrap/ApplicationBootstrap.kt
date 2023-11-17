package com.FSuper.bootstrap

import com.FSuper.model.Producto
import com.FSuper.service.ProductoService
import org.springframework.beans.factory.InitializingBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ApplicationBootstrap : InitializingBean {

    @Autowired
    lateinit var productoService: ProductoService

    lateinit var manzana: Producto
    lateinit var pera: Producto
    lateinit var banana: Producto

    fun crearFlia(){

    }

    fun crearProductos(){
        manzana = Producto(1, 1,1,"manzana","---")
        pera = Producto(2, 1,2,"pera","---")
        banana = Producto(3, 1,3,"banana","---")

        productoService.save(manzana)
        productoService.save(pera)
        productoService.save(banana)

    }

    override fun afterPropertiesSet() {
        //crearProductos()
    }
}
