package com.FSuper.repository

import com.FSuper.model.Producto
import com.FSuper.model.Sector
import com.FSuper.model.Repositor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductoRepository : CrudRepository<Producto, Long>

@Repository
interface RepositorRepository : CrudRepository<Repositor, Long>

@Repository
interface SectorRepository : CrudRepository<Sector, Long>