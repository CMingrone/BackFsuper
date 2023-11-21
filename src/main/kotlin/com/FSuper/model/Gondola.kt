package com.FSuper.model

import jakarta.persistence.*

@Entity
data class Gondola (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id_gondola: Long,

        @ManyToOne
        @JoinColumn(name = "id_sector", nullable = true)
        val sector: Sector,

        @Column
        val nombre: String)