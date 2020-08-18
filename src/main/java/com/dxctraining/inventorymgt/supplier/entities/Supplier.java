package com.dxctraining.inventorymgt.supplier.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="supplier_det")
public class Supplier {
	@Id
	@GeneratedValue
	private int id;
	private String sname;
	
     public Supplier() {
	
         }
	public Supplier(String sname) {
		this.sname=sname;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return sname;
	}
	public void setName(String sname) {
		this.sname = sname;
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Supplier that = (Supplier) o;
        return id == that.id;
		
	}
	
}
