package com.FSuper.service

import GenericServiceImpl
import com.FSuper.model.Producto
import com.FSuper.repository.ProductoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service

@Service
class ProductoService : GenericServiceImpl<Producto, Long>() {

    @Autowired
    lateinit var productoRepository: ProductoRepository

    override val dao : CrudRepository<Producto, Long>
        get() = productoRepository

    fun getByDescFlia(descripcionFlia : String): MutableList<Producto>? {
        return productoRepository.getByDescFlia(descripcionFlia)
    }

    fun getByDescSector(descripcionSector : String): MutableList<Producto>? {
        return productoRepository.getByDescSector(descripcionSector)
    }

    fun getByNombreRepositor(nombreRepositor: String): MutableList<Producto>? {
        return productoRepository.getByNombreRepositor(nombreRepositor)
    }
}
