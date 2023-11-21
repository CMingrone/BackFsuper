package com.FSuper.model

import jakarta.persistence.*

@Entity
data class GondolaProductoRepositor (

        @Id
        @ManyToOne
        @JoinColumn(name = "id_producto", nullable = true)
        val gondolaProducto: GondolaProducto,

        @Id
        @ManyToOne
        @JoinColumn(name = "id_repositor", nullable = true)
        val repositor: Repositor)