package com.Test.Test.controller;

import com.Test.Test.DAO.DAO;
import com.Test.Test.Entity.DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class control {

    @Autowired
    DAO dao;

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping(value ="/employee",params = "save")
    public String save(DTO dto) {
        dao.save(dto);
        return "welcome";
    }

    @RequestMapping(value ="/employee",params = "update")
    public String update(@RequestParam String empname,@RequestParam String empphone,@RequestParam String empemail,@RequestParam int empid){
        dao.updateByempId(empname,empphone,empemail,empid);
        return "welcome";
    }

    @RequestMapping(value ="/employee",params = "delete")
    public String delete(@RequestParam int empid){
        dao.deleteById(empid);
        return "welcome";
    }

    @RequestMapping(value ="/employee",params = "open")
    public String open(@RequestParam int empid,Model model){
        model.addAttribute("emp",dao.findById(empid).get());
        return "welcome";
    }
}
