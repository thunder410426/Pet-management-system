package com.atzzuli.traning.controller;

import com.atzzuli.traning.DAO.VeterinaryDao;
import com.atzzuli.traning.entity.Veterinary;
import com.atzzuli.traning.service.VeterinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class VeterinaryController {

    @Autowired
    VeterinaryDao veterinaryDao;
    @Autowired
    VeterinaryService veterinaryService;

    /**
    *用于返回插入页面
    */
    @GetMapping("add-veterinary1")
    public String addveterinary(){
        return "veterinary/add-veterinary";
    }

    /**
     * 用于插入数据
     */
    @GetMapping("add-veterinary")
    public String addveterinary(Veterinary veterinary){
            veterinaryDao.insertVeterinary(veterinary);
            return "redirect:msgveterinary";
    }

    /**
    *查询
     */
    @GetMapping("msgveterinary")
    public String msgveterinary(Model model){
        List<Veterinary> veterinaryList = veterinaryService.getVeterinary();
        model.addAttribute("veterinaryList",veterinaryList);
        StringBuilder builder = new StringBuilder();
        for(Veterinary veterinary : veterinaryList){
            if(veterinary!= null){
                builder.append(veterinary.toString()).append("<br>");
            }
        }
        String context = builder.toString();
        return "veterinary/msgveterinary";
    }
}
