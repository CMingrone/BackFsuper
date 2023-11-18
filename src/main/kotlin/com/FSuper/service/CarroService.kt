package com.FSuper.service

import GenericServiceImpl
import com.FSuper.model.CarroProducto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service
import com.FSuper.repository.CarroRepository
import com.FSuper.repository.ProductoRepository
import org.springframework.data.repository.findByIdOrNull

@Service
class CarroService : GenericServiceImpl<CarroProducto, Long>() {

    @Autowired
    lateinit var carroRepository: CarroRepository

    override val dao : CrudRepository<CarroProducto, Long>
        get() = carroRepository

        fun getCarroProductoById(id: Long) = carroRepository.findByIdOrNull(id)
        override fun save(producto: CarroProducto): CarroProducto {
            return carroRepository.save(producto)
        }

}