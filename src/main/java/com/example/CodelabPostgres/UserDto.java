package com.example.CodelabPostgres;

public class UserDto {
    //Variable nombre
    public String name;
    //Variable email
    public String email;

    //Constructor con parametros
    public UserDto(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Getter's y Setter's
    //Getter de name
    public String getName() {
        return name;
    }

    //Setter de name
    public void setName(String name) {
        this.name = name;
    }

    //Getter de email
    public String getEmail() {
        return email;
    }

    //Setter de email
    public void setEmail(String email) {
        this.email = email;
    }
}
