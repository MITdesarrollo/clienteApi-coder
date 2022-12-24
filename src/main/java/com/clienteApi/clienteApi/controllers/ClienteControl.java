package com.clienteApi.clienteApi.controllers;

import com.clienteApi.clienteApi.ClienteDTO.ClienteDTO;
import com.clienteApi.clienteApi.entitys.Cliente;
import com.clienteApi.clienteApi.services.SerCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cliente")
public class ClienteControl {
@Autowired
private SerCliente clienteService;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> crearCliente(@RequestBody Cliente cliente) {
        return  ResponseEntity.ok( clienteService.creaCliente(cliente));
    };

    @GetMapping(value = "leer/{id}")
    public ResponseEntity<?> obtenerClientePorID(@PathVariable(name = "id") final Long id) {
        ClienteDTO cliente = clienteService.getClienteDTO(id);
        return new  ResponseEntity(cliente, HttpStatus.OK);
    }

}
