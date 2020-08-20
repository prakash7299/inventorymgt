package com.dxctraining.inventorymgt.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dxctraining.inventorymgt.item.entities.Computer;
import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.item.service.IItemService;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;

@Controller
public class ComputerController {
	@Autowired
	private IItemService service;
	
	@GetMapping("/listallcmp")
    public ModelAndView all(){
		System.out.println("inside one");
    	 List<Computer>computer=service.allComputer();
        ModelAndView modelAndView=new ModelAndView("clist","computer",computer);
        return modelAndView;
    }


}
