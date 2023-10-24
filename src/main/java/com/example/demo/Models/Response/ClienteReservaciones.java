package com.example.demo.Models.Response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClienteReservaciones {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("edad")
    private String edad;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("sexo")
    private String sexo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
