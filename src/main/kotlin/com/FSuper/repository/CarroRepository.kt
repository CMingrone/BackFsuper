package com.FSuper.repository

import com.FSuper.model.CarroProducto
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CarroRepository : CrudRepository<CarroProducto, Long>
