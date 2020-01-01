package com.wjt.handler;

import com.wjt.dao.StudentDao;
import com.wjt.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 30239
 * @create 2020-01-01-14:42
 */
@Controller
public class TestHandler {
    @Autowired
    StudentDao sd;

    @RequestMapping("/")
    public String test(Model model) {
        model.addAttribute("list", sd.findAll());
        return "index";
    }

}
