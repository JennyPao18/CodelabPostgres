package com.example.CodelabPostgres;

import org.springframework.data.jpa.repository.JpaRepository;

//Interfaz del repositorio que permite acceder a la entidad de usuario
public interface UserRepository extends JpaRepository<User, Long> { }
