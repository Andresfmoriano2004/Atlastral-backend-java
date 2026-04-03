package com.atlastral.api_Travel.controller;

import com.atlastral.api_Travel.models.entity.Cliente;
import com.atlastral.api_Travel.service.Icliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping ("/api/v1") //nomenclatura y version de la api

public class ClienteController {

    @Autowired
    private Icliente clienteService;

    @PostMapping ("cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente create(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @PutMapping("cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente update(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @DeleteMapping("cliente/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        Map<String, Object> response = new HashMap<>();
        try {
            // ✅ primero valida si existe
            Cliente clienteDelete = clienteService.findById(id);

            if (clienteDelete == null) {
                response.put("mensaje", "El cliente con ID " + id + " no existe");
                return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
            }

            clienteService.delete(clienteDelete);

            // ✅ 200 OK con mensaje de confirmación
            response.put("mensaje", "Cliente eliminado correctamente");
            response.put("cliente", clienteDelete);
            return new ResponseEntity<>(response, HttpStatus.OK);

        } catch (DataAccessException exDt) {
            response.put("mensaje", "Error al eliminar el cliente");
            response.put("error", exDt.getMessage());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping ("cliente/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente showById (@PathVariable Integer id){
        return clienteService.findById(id);
    }



}
