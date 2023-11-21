package com.FSuper.model

import jakarta.persistence.*

@Entity
data class GondolaProducto (

        @Id
        @ManyToOne
        @JoinColumn(name = "id_producto", nullable = true)
        val producto: Producto,

        @ManyToOne
        @JoinColumn(name = "id_gondola", nullable = true)
        val gondola: Gondola,

        @ManyToOne
        @JoinColumn(name = "id_presentacion", nullable = true)
        val presetacion : Presentacion)