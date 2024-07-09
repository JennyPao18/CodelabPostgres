package com.example.CodelabPostgres;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Creación de columnas para la tabla usuarios
    //Columna id
    @Column(name="id", nullable = false, updatable = false)
    public Long id;
    //Columna nombre
    @Column(name = "name")
    public String name;
    //Columna email
    @Column(name = "email")
    public String email;

    //Constructos con parametros
    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //Constructor vacio
    public User() {
    }

    //Solicitar nombre e email a cada usuario
    public User(UserDto userDto) {
        this.name = userDto.getName();
        this.email = userDto.getEmail();
    }

    //Getters de la variables
    //Getter de Id
    public Long getId() {
        return id;
    }

    //Getter de name
    public String getName() {
        return name;
    }

    //Getter de email
    public String getEmail() {
        return email;
    }
}
