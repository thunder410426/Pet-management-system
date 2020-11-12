package com.atzzuli.traning.controller;

import com.atzzuli.traning.DAO.PetDao;
import com.atzzuli.traning.entity.Pet;
import com.atzzuli.traning.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PetController {
    @Autowired
    PetDao petDao;
    @Autowired
    PetService petService;

    @RequestMapping("purchase-personnel")
    public String purchasepersonnel(){
        return "personnel/purchase-personnel";
    }


    //用于跳转页面
    @RequestMapping("pet1")
    public String pet1(Model model){
        //查询
        List<Pet> petList=petService.getPet();
        model.addAttribute("petList",petList);
        StringBuilder builder=new StringBuilder();
        for (Pet pet: petList){
            if (pet!=null){
                builder.append(pet.toString()).append("<br>");
            }
        }
        return "pet/peta";
    }

    /**
     * 宠物的新增与查询
     * @return
     */
    @RequestMapping("pet")
    public String pet(Model model, Pet pet1) {
        //查询
        List<Pet> petList=petService.getPet();
        model.addAttribute("petList",petList);
        StringBuilder builder=new StringBuilder();
        for (Pet pet: petList){
            if (pet!=null){
                builder.append(pet.toString()).append("<br>");
            }
        }
        petDao.insertpet(pet1);
        return "pet/peta";
    }
}
