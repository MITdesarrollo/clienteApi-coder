package com.clienteApi.clienteApi.services;

import com.clienteApi.clienteApi.ClienteDTO.ClienteDTO;
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

//    public Cliente obtenerClientePorID(Long id){
//
//        public ClienteDTO getClienteDto(Long id){
//
//            ClienteDTO clienteDto = new ClienteDTO();
//
//            Cliente clienteObtener = clienteRepo.getReferenceById(id);
//
//            clienteDto.setNombre(clienteObtener.getNombre());
//
//            clienteDto.setApellido(clienteObtener.getApellido());
//
//            clienteDto.setAños(clienteObtener.getFechanacimiento());
//
//            return clienteDto;
//
//        };
//
//
//
//
//     return clienteRepo.save(clienteRepo.getReferenceById(id));
//    }
}
