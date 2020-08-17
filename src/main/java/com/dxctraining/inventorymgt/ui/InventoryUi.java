package com.dxctraining.inventorymgt.ui;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import com.dxctraining.inventorymgt.supplier.exceptions.InvalidArgumentException;
import com.dxctraining.inventorymgt.supplier.exceptions.SupplierNotFoundException;
import com.dxctraining.inventorymgt.supplier.service.ISupplierService;

@Component
public class InventoryUi {
	
	@Autowired
	private ISupplierService service;

	@PostConstruct
	private void runapp() {
		try {
			Supplier supplier1=new Supplier("praveen");
			service.add(supplier1);
			int id1 = supplier1.getId();
			Supplier fetched = service.findSupplierById(id1);
			System.out.println("details"+fetched.getId()+"name"+fetched.getName());

		}catch (InvalidArgumentException e) {
			e.printStackTrace();
		}

		catch (SupplierNotFoundException e) {
			e.printStackTrace();
		}

}
}
