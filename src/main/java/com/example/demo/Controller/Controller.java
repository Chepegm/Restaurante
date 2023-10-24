package com.example.demo.Controller;

import com.example.demo.Models.Request.Body;
import com.example.demo.Models.Response.ClienteReservaciones;
import com.example.demo.Models.Response.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RequestMapping("/api/v1")
@RestController
public class Controller {
    List<Integer> tableSmoking = new ArrayList<>(1);
    List<Integer> table = new ArrayList<>(10);
    List<String> clientes = new ArrayList<>(10);
    int cont;
    int cont2;
    int cont_m = 10;

    @PostMapping("/llenar")
    public ResponseEntity llenarDatos(@RequestBody Body body, @RequestHeader HttpHeaders Headers) {
        if (body.getAreaFumador().toString().equals("true")) {
            if (cont < 2) {
                tableSmoking.add(cont);
                cont++;
                return ResponseEntity.ok("Limite de Mesas Ocupadas" + tableSmoking);
            }
        } else
            table.add(cont_m);
        cont_m--;
        ClienteReservaciones custumer = new ClienteReservaciones();
        Response resp = new Response();

        resp.setCantidadMesasDisponibles(cont_m);
        resp.setClienteReservaciones(custumer);
        custumer.setId(cont2);
        custumer.setNombre(body.getCliente().getNombre());
        custumer.setEdad(body.getCliente().getEdad());
        custumer.setSexo(body.getCliente().getSexo());
        clientes.add(custumer.getId() + body.getCliente().getNombre());
        cont2++;
        try {
            if (cont_m < 0) ;
            return ResponseEntity.ok(resp);
        } catch (RuntimeException exception) {
            System.out.println(exception + "Mesa no disponibles");
            return ResponseEntity.ok(exception);
        }
    }


    @GetMapping("/consultar")
    public ResponseEntity consultarDatos() {
        return ResponseEntity.ok("clientes" + clientes.toString());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity eliminarDatos(@PathVariable Integer id) {

        clientes.remove((id - 1));

        return ResponseEntity.ok("clientes" + clientes.toString());
    }
}



