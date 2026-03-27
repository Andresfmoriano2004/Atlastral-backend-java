package com.atlastral.api_Travel.service.imple;

import com.atlastral.api_Travel.models.dao.ClienteDao;
import com.atlastral.api_Travel.models.entity.Cliente;
import com.atlastral.api_Travel.service.Icliente;

public class ClienteImple  implements Icliente {


    private ClienteDao ClienteDao;

    @Override
    public Cliente save(Cliente cliente) {
        return null;
    }

    @Override
    public Cliente findById(Integer id) {
        return null;
    }

    @Override
    public void delete(Cliente cliente) {

    }
}
