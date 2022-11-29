package com.openbootcamp.modulo4.Model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Laptop {

    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String marca;

    @Column
    private String modelo;

    //constructor
    public Laptop(){};

    public Laptop(Long id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }
}
