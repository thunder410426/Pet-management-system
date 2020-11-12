package com.atzzuli.traning.service;

import com.atzzuli.traning.DAO.PetDao;
import com.atzzuli.traning.entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 刘京毫
 */
@Service
public class PetService {
    @Autowired
    PetDao petDao;

    //查询
    public List<Pet> getPet(){
        return petDao.getpet();
    }

    //插入
    public void insertPet(PetDao petDao){
        this.petDao=petDao;
    }

    public void insertotherpet(String pname){
        this.petDao=petDao;
    };
}
