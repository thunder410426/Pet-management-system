package com.atzzuli.traning.controller;

import com.atzzuli.traning.DAO.CustomerDao;
import com.atzzuli.traning.entity.Customer;
import com.atzzuli.traning.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerservice;
    @Autowired
    CustomerDao customerDao;

    /**
     * 返回添加页面
     * @return
     */

    @GetMapping("/add-customer1")
    public String newsale1() {
        return "customer/add-customer";
    }

    /**
     * 添加并返回历史页面
     */
    @GetMapping("/add-customer")
    public String newcustomer(Customer customer){
        customerDao.insertCustomer(customer);
        return "redirect:msg-customer";
    }

    /**
     * 修改数据
     */


    /**
     *查找数据
     * @param model
     * @return
     */
    @RequestMapping("msg-customer")
    public String msgcustomer(Model model){
        List<Customer> customerList = customerservice.getCustomer();
        model.addAttribute("customerList",customerList);
        StringBuilder builder=new StringBuilder();
        for(Customer customer:customerList){
            if(customer!=null){
                builder.append(customer.toString()).append("<br>");
            }
        }
        return "customer/msg-customer";
    }
}
