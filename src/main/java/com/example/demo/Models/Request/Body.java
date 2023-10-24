package com.example.demo.Models.Request;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Body {
    @JsonProperty("area_fumador")
    private Boolean areaFumador;
    @JsonProperty("cant_acompa\u00f1antes")
    private Integer cantAcompaAntes;
    @JsonProperty("cliente")
    private Cliente cliente;

    public Boolean getAreaFumador() {
        return areaFumador;
    }

    public void setAreaFumador(Boolean areaFumador) {
        this.areaFumador = areaFumador;
    }

    public Integer getCantAcompaAntes() {
        return cantAcompaAntes;
    }

    public void setCantAcompaAntes(Integer cantAcompaAntes) {
        this.cantAcompaAntes = cantAcompaAntes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
