package me.example.demo.domain.entity

import javax.persistence.*

@Entity
@Table(name = "roles")
data class Role(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Int, val name: String)
