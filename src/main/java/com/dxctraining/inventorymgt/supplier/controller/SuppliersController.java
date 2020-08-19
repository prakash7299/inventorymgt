package com.dxctraining.inventorymgt.supplier.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import com.dxctraining.inventorymgt.supplier.service.ISupplierService;

@Controller
public class SuppliersController {
	@Autowired
	private ISupplierService service1;
	
	@GetMapping("/profile")
    public ModelAndView employeeDetails(@RequestParam("id")int id){
       Supplier supplier=service1.findSupplierById(id);
       ModelAndView modelAndView=new ModelAndView("details","supplier",supplier);
       return modelAndView;
    }

    @GetMapping("/listall")
    public ModelAndView all(){
    	 List<Supplier>supplierValues=service1.allSuppliers();
        ModelAndView modelAndView=new ModelAndView("list","supplier",supplierValues);
        return modelAndView;
    }


}
