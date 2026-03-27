package com.atlastral.api_Travel.models.dao;

import com.atlastral.api_Travel.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {

}
