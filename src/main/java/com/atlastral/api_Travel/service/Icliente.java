package com.atlastral.api_Travel.service;

import com.atlastral.api_Travel.models.entity.Cliente;

public interface Icliente {

    Cliente save(Cliente cliente);

    Cliente findById (Integer id);

    void delete (Cliente cliente);


}
