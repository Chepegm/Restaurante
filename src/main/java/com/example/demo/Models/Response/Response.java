package com.example.demo.Models.Response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    @JsonProperty("CantidadMesasDisponibles")
    private Integer cantidadMesasDisponibles;
    @JsonProperty("clienteReservaciones")
    private ClienteReservaciones clienteReservaciones;

    public Integer getCantidadMesasDisponibles() {
        return cantidadMesasDisponibles;
    }

    public void setCantidadMesasDisponibles(Integer cantidadMesasDisponibles) {
        this.cantidadMesasDisponibles = cantidadMesasDisponibles;
    }

    public ClienteReservaciones getClienteReservaciones() {
        return clienteReservaciones;
    }

    public void setClienteReservaciones(ClienteReservaciones clienteReservaciones) {
        this.clienteReservaciones = clienteReservaciones;
    }
}
