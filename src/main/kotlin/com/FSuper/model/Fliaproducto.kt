package com.FSuper.model

import jakarta.persistence.*

@Entity
data class Fliaproducto (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id_flia: Long = 0,

        @Column
        val desc_flia: String = "")