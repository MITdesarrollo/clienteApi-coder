package com.clienteApi.clienteApi.services;

import com.clienteApi.clienteApi.entitys.Cliente;
import com.clienteApi.clienteApi.repository.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerCliente {
    @Autowired
    private ClienteRepo clienteRepo;

   public Cliente creaCliente(Cliente cliente){
        return clienteRepo.save(cliente);
    }

    public Cliente obtenerClientePorID(Long id){
     return clienteRepo.save(clienteRepo.getReferenceById(id));
    }
}
