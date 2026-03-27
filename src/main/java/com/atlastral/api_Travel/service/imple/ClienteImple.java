package com.atlastral.api_Travel.service.imple;

import com.atlastral.api_Travel.models.dao.ClienteDao;
import com.atlastral.api_Travel.models.entity.Cliente;
import com.atlastral.api_Travel.service.Icliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ClienteImple  implements Icliente {

    @Autowired
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
