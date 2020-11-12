package com.atzzuli.traning.service;

import com.atzzuli.traning.DAO.RegistryDao;
import com.atzzuli.traning.entity.Registry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistryService {
    @Autowired
    RegistryDao registryDao;

    public List<Registry> adduser(Registry registry){
        return registryDao.registry(registry);
    }

}
