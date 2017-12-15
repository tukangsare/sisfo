package com.icangdev.learn.sisfo.controllers;

import com.icangdev.learn.sisfo.repositories.MatkulRepository;
import com.icangdev.learn.sisfo.services.MatkulService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MatkulController {
    private MatkulRepository matkulRepository;
    @RequestMapping(value = "/admin/matkul",method = RequestMethod.GET)
    public ModelAndView matkul() {
        ModelAndView  modelAndView = new ModelAndView();
        modelAndView.addObject("matkul",matkulRepository.findAll());
        modelAndView.setViewName("admin/matkul/view");
        return modelAndView;
    }
}
