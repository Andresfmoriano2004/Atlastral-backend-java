package com.atlastral.api_Travel.controller;

import com.atlastral.api_Travel.models.entity.Cliente;
import com.atlastral.api_Travel.service.Icliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/v1") //nomenclatura y version de la api

public class ClienteController {

    @Autowired
    private Icliente clienteService;

    @PostMapping ("cliente")
    public Cliente create(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @PutMapping("cliente")
    public Cliente update(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @DeleteMapping ("cliente/{id}")
    public void delete(@PathVariable Integer id){
        Cliente clienteDelete = clienteService.findById(id);
        clienteService.delete(clienteDelete);
    }

    @GetMapping ("cliente/{id}")
    public Cliente showById (@PathVariable Integer id){
        return clienteService.findById(id);
    }



}
