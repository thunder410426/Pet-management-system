package com.atzzuli.traning.service;

import com.atzzuli.traning.DAO.VeterinaryDao;
import com.atzzuli.traning.entity.Veterinary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinaryService {
    @Autowired
    VeterinaryDao veterinaryDao;

    public List<Veterinary> getVeterinary() {
        return veterinaryDao.getveterinary();
    }
    public void insertVeterinaryDao(VeterinaryDao veterinaryDao) {
        this.veterinaryDao = veterinaryDao;
    }
}
