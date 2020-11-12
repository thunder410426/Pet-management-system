package com.atzzuli.traning.service;

import com.atzzuli.traning.DAO.LoginDao;
import com.atzzuli.traning.entity.Identity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginDao loginDao;
    //注入DAO层
    public Identity login(Identity identity){
        return loginDao.login(identity);
    }
}
