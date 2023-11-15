package com.FSuper.model

import jakarta.persistence.*

@Entity
data class Sector (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id_sector: Long = 0,

    @Column
    val desc_sector: String = "")