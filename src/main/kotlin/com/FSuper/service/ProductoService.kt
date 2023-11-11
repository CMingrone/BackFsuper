package com.baseDeDatos.service

import GenericServiceImpl
import com.baseDeDatos.model.Producto
import com.baseDeDatos.repository.ProductoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service

@Service
class ProductoService : GenericServiceImpl<Producto, Long>() {

    @Autowired
    lateinit var productoRepository: ProductoRepository

    override val dao : CrudRepository<Producto, Long>
        get() = productoRepository
}
