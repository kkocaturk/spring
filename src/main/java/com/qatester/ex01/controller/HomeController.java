package com.qatester.ex01.controller;


import com.qatester.ex01.beans.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/") // ilk dinlenecek yer
    public String homePage() {
        return "index.html";
    }

    @GetMapping("/teacherForm")
    public String teacherForm() {
        return "teacherForm.html";
    }




    @PostMapping("/teacherPost")
    public String teacherPost(@RequestParam String adi,
                              @RequestParam String soyadi,
                              @RequestParam String brans,
                              @RequestParam int tecrube) {
        Teacher teacher1 = new Teacher();


        teacher1.setAdi(adi);
        teacher1.setSoyadi(soyadi);
        teacher1.setBrans(brans);
        teacher1.setTecrube(tecrube);


        System.out.println(teacher1);

        return  "teacherForm.html";


    }


}
