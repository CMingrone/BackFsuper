package com.FSuper.model

import jakarta.persistence.*

@Entity
data class Presentacion (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id_presentacion : Long,

        @Column
        val desc_presentacion : String)