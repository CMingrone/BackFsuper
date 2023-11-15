package com.FSuper.model

import jakarta.persistence.*

@Entity
data class Repositor (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id_repositor: Long = 0,

    @Column
    val id_empresa: Long = 0,

    @Column
    val nombre: String = "")