package com.dxctraining.inventorymgt.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dxctraining.inventorymgt.item.entities.Computer;
import com.dxctraining.inventorymgt.item.entities.Phone;
import com.dxctraining.inventorymgt.item.service.IItemService;

@Controller
public class PhoneController {
	@Autowired
	private IItemService service;
	@GetMapping("/listallphone")
    public ModelAndView all(){
		System.out.println("inside one");
    	 List<Phone>phone=service.allPhone();
        ModelAndView modelAndView=new ModelAndView("plist","phone",phone);
        return modelAndView;
    }

}
