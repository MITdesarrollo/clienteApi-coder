package com.clienteApi.clienteApi.services;

import com.clienteApi.clienteApi.ClienteDTO.ClienteDTO;
import com.clienteApi.clienteApi.entitys.Cliente;
import com.clienteApi.clienteApi.repository.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@Service
public class SerCliente {
    @Autowired
    private ClienteRepo clienteRepo;

    public Cliente creaCliente(Cliente cliente) {
        return clienteRepo.save(cliente);
    }




    public ClienteDTO getClienteDTO(Long id) {

        ClienteDTO clienteDto = new ClienteDTO();

        Cliente clienteObtener = clienteRepo.getReferenceById(id);
        clienteDto.setNombre(clienteObtener.getNombre());
        clienteDto.setApellido(clienteObtener.getApellido());
        LocalDate fechanacimiento = clienteObtener.getFechanacimiento();
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between( fechanacimiento, hoy);
        int años = periodo.getYears();
        clienteDto.setAños(años);

       return clienteDto;
    }

}

