package com.clienteApi.clienteApi.controllers;

import com.clienteApi.clienteApi.ClienteDTO.ClienteDTO;
import com.clienteApi.clienteApi.entitys.Cliente;
import com.clienteApi.clienteApi.services.SerCliente;
import org.springframework.beans.factory.annotation.Autowired;
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
        System.out.println(cliente);
        Cliente clienteAGuardar = new Cliente(
                cliente.getNombre(),
                cliente.getDni(),
                cliente.getApellido(),
                cliente.getFechanacimiento()
        );
        System.out.println(clienteAGuardar);
        return  ResponseEntity.ok( clienteService.creaCliente(clienteAGuardar));
    };


//    @GetMapping(value = "leer/{id}")
//    public ResponseEntity<?> obtenerClientePorID(@PathVariable(name = "id") final Long id) {
//        return ResponseEntity.ok(clienteService.obtenerClientePorID(id));
//    }
}
