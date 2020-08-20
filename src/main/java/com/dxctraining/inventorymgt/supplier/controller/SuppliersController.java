package com.dxctraining.inventorymgt.supplier.controller;

import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dxctraining.inventorymgt.item.entities.Computer;
import com.dxctraining.inventorymgt.supplier.dto.CreateSupplierRequest;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import com.dxctraining.inventorymgt.supplier.service.ISupplierService;

@Controller
public class SuppliersController {
	@Autowired
	private ISupplierService service1;
	
	@PostConstruct
	public void init() {
		Supplier supplier1=new Supplier("praveen");
		service1.add(supplier1);
		Supplier supplier2=new Supplier("prakash");
		service1.add(supplier2);
	}
	
	@GetMapping("/supplierprofile")
    public ModelAndView employeeDetails(@RequestParam("id")int id){
       Supplier supplier=service1.findSupplierById(id);
       ModelAndView modelAndView=new ModelAndView("details","supplier",supplier);
       return modelAndView;
    }

    @GetMapping("/listallsupplier")
    public ModelAndView allSupplier(){
    	List<Supplier>supplierValues=service1.allSuppliers();
        ModelAndView modelAndView=new ModelAndView("list","supplier",supplierValues);
        return modelAndView;
    }
    @GetMapping("/addsupplier")
    public ModelAndView supplierPage(){
        ModelAndView modelView=new ModelAndView("addsupplier");
        return modelView;
    }
    @GetMapping("/processaddsupplier")
    public ModelAndView processRegister(@RequestParam("suppliername") String name){
        Supplier supplier=new Supplier(name);
        supplier=service1.add(supplier);
        ModelAndView modelView=new ModelAndView("details","supplier",supplier);
        return modelView;
    }
    @GetMapping("/postaddsupplier")
    public ModelAndView postRegisterPage(){
        CreateSupplierRequest supplierData=new CreateSupplierRequest();
        ModelAndView modelView=new ModelAndView("postaddsupplier","supplier",supplierData);
        return modelView;
    }
    @PostMapping("/processpostadd")
    public ModelAndView processRegister(@ModelAttribute("supplier") CreateSupplierRequest supplierData){
        System.out.println("name="+supplierData.getName());
        Supplier supplier=new Supplier(supplierData.getName());
        supplier=service1.add(supplier);
        ModelAndView mv=new ModelAndView("details","supplier",supplier);
        return mv;
    }


}
