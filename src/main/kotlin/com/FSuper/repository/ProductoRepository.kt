package com.FSuper.repository

import com.FSuper.dto.ProductoDto
import com.FSuper.model.Producto
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductoRepository : CrudRepository<Producto, Long> {

    @Query(value = "" +
            "SELECT new com.FSuper.dto.ProductoDto(p.id_producto, p.nombre, pr.desc_presentacion, g.nombre) " +
            "FROM Producto p " +
            "JOIN Fliaproducto fp on fp.id_flia = p.id_flia " +
            "LEFT JOIN GondolaProducto gp on gp.producto.id_producto = p.id_producto " +
            "LEFT JOIN Gondola g on g.id_gondola = gp.gondola.id_gondola " +
            "INNER JOIN Presentacion pr on gp.presetacion.id_presentacion = pr.id_presentacion " +
            "WHERE fp.desc_flia LIKE ?1")
    fun getByDescFlia(descripcionFlia : String) : MutableList<Producto>?

    @Query(value = "" +
            "SELECT new com.FSuper.dto.ProductoDto(p.id_producto, p.nombre, pr.desc_presentacion, g.nombre) " +
            "FROM Producto p " +
            "LEFT JOIN GondolaProducto gp on gp.producto.id_producto = p.id_producto " +
            "LEFT JOIN Gondola g on g.id_gondola = gp.gondola.id_gondola " +
            "LEFT JOIN Sector s on s.id_sector = g.sector.id_sector " +
            "INNER JOIN Presentacion pr on gp.presetacion.id_presentacion = pr.id_presentacion " +
            "WHERE s.desc_sector LIKE ?1")
    fun getByDescSector(descripcionSector: String) : MutableList<ProductoDto>?

    @Query(value = "" +
            "SELECT new com.FSuper.dto.ProductoDto(p.id_producto, p.nombre, pr.desc_presentacion, g.nombre) " +
            "FROM Producto p " +
            "JOIN GondolaProducto gp on p.id_producto = gp.producto.id_producto " +
            "JOIN Gondola g on gp.gondola.id_gondola =  g.id_gondola " +
            "INNER JOIN Presentacion pr on gp.presetacion.id_presentacion = pr.id_presentacion " +
            "WHERE g.nombre LIKE ?1")
    fun getByDescGondola(descripcionSector: String) : MutableList<ProductoDto>?

    @Query(value = "" +
            "SELECT new com.FSuper.dto.ProductoDto(p.id_producto, p.nombre, pr.desc_presentacion, g.nombre) " +
            "FROM Producto p " +
            "LEFT JOIN GondolaProducto gp on p.id_producto = gp.producto.id_producto " +
            "LEFT JOIN Gondola g on g.id_gondola = gp.gondola.id_gondola  " +
            "LEFT JOIN GondolaProductoRepositor gpr on gp.producto.id_producto = gpr.gondolaProducto.producto.id_producto " +
            "LEFT JOIN Repositor r on r.id_repositor = gpr.repositor.id_repositor " +
            "LEFT JOIN Presentacion pr on pr.id_presentacion = gp.presetacion.id_presentacion  " +
            "WHERE r.nombre LIKE ?1")
    fun getByNombreRepositor(nombreRepositor: String): MutableList<ProductoDto>?
}


