package com.atzzuli.traning.service;

import com.atzzuli.traning.DAO.CustomerDao;
import com.atzzuli.traning.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    //注入Dao层
    @Autowired
    CustomerDao customerDao;
    /**
     * @return
     */
    public List<Customer> getCustomer(){
        return customerDao.getCustomer();
    }
    /**
     * @param
     */
    public void insertCustomer(Customer customer){
        this.customerDao=customerDao;
    }
}
