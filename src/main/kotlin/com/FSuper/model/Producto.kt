package com.FSuper.model

import jakarta.persistence.*

@Entity
data class Producto (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id_producto: Long = 0,

        @Column
        val id_flia: Long = 0,

        @Column
        val id_producto_reemplazo: Long = 0,

        @Column
        val nombre: String = "",

        @Column
        val descripcion: String = "")