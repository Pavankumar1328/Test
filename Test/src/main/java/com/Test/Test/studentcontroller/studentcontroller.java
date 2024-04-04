package com.Test.Test.studentcontroller;

import com.Test.Test.studentDTO.StudentDTO;
import com.Test.Test.studentRepository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class studentcontroller {

    @Autowired
    StudentRepo studentRepo;

    @GetMapping("/Student")
    public String get(){
        return "student";
    }

    @RequestMapping(value ="/Student",params = "save")
    public String save(StudentDTO studentDTO){
        System.out.println(studentDTO);
        studentRepo.save(studentDTO);
        return "student";
    }

    @RequestMapping(value = "/Student",params = "openbyname")
    public String openByname(String stuname, Model model){
        model.addAttribute("stu",studentRepo.findBystuname(stuname));
        studentRepo.findBystuname(stuname);
        return "student";
    }

    @RequestMapping(value = "/Student",params = "openall")
    public String openall(Model model){
        model.addAttribute("opens",studentRepo.findAll());
       return "open";
    }

    @RequestMapping(value = "/Student",params = "delete")
    public String deletByname(String stuname){
        studentRepo.deleteBystuname(stuname);
        return "student";
    }

    @RequestMapping(value = "/Student",params = "update")
    public String UpdateByname(@RequestParam int stuid,@RequestParam String stuname,@RequestParam String stuphone,@RequestParam String stuemail){
        studentRepo.updateBystuname(stuid,stuphone,stuemail,stuname);
        return "student";
    }

    @RequestMapping(value = "/Student",params = "openbycontaing")
    public String UpdateByname(String stuname,Model model){
        model.addAttribute("opens",studentRepo.findBystunameEndingWith(stuname));
        return "open";
    }

}
