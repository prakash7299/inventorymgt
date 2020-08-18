package com.dxctraining.inventorymgt.supplier.dao;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;

public interface ISupplierDao {//interface
	
	Supplier findSupplierById(int id);

    Supplier add(Supplier supplier);

    void remove(int id);
 
}
