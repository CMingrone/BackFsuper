package com.FSuper.repository

import com.FSuper.model.Producto
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductoRepository : CrudRepository<Producto, Long> {

    @Query(value = "" +
            "SELECT p " +
            "FROM Producto p " +
            "JOIN Fliaproducto fp on fp.id_flia = p.id_flia " +
            "WHERE fp.desc_flia LIKE ?1")
    fun getByDescFlia(descripcionFlia : String) : MutableList<Producto>?

    @Query(value = "" +
            "SELECT p " +
            "FROM Producto p " +
            "LEFT JOIN GondolaProducto gp on gp.producto.id_producto = p.id_producto " +
            "LEFT JOIN Gondola g on g.id_gondola = gp.gondola.id_gondola " +
            "LEFT JOIN Sector s on s.id_sector = g.sector.id_sector " +
            "WHERE s.desc_sector LIKE ?1")
    fun getByDescSector(descripcionSector: String) : MutableList<Producto>?

    @Query(value = "" +
            "SELECT p " +
            "FROM Producto p " +
            "JOIN GondolaProducto gp on p.id_producto = gp.producto.id_producto " +
            "JOIN Gondola g on gp.gondola.id_gondola =  g.id_gondola " +
            "WHERE g.nombre LIKE 'A8%'") //Hardcodeado para pruebas
    fun getByDescGondola(descripcionSector: String) : MutableList<Producto>?

    @Query(value = "" +
            "SELECT p " +
            "FROM Producto p " +
            "LEFT JOIN GondolaProducto gp on gp.producto.id_producto = p.id_producto " +
            "LEFT JOIN GondolaProductoRepositor gpr on gpr.gondolaProducto.producto.id_producto = gp.producto.id_producto " +
            "LEFT JOIN Repositor r on r = gpr.repositor " +
            "WHERE r.nombre LIKE ?1")
    fun getByNombreRepositor(nombreRepositor: String): MutableList<Producto>?
}


