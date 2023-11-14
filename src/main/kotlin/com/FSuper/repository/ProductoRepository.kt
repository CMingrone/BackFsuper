package com.FSuper.repository

import com.FSuper.model.Producto
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductoRepository : CrudRepository<Producto, Long>