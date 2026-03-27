package com.atlastral.api_Travel.service.imple;

import com.atlastral.api_Travel.models.dao.ClienteDao;
import com.atlastral.api_Travel.models.entity.Cliente;
import com.atlastral.api_Travel.service.Icliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class ClienteImple  implements Icliente {

    @Autowired
    private ClienteDao clienteDao;

    @Transactional
    @Override
    public Cliente save(Cliente cliente) {

        return clienteDao.save(cliente);
    }

    @Transactional (readOnly = true) //solo realizara una consulta
    @Override
    public Cliente findById(Integer id) {

        return clienteDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }
}
