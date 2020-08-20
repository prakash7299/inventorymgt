package com.dxctraining.inventorymgt.item.entities;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;
@Entity
@Table(name ="computers_information")
public class Computer {
	@Id
	@GeneratedValue
	private int id;
	private int deskSpace;
	private String itemName;
	@ManyToOne
	private Supplier supplier;
	public Computer() {
		
	}
	public Computer(String itemName,int deskSpace) {
		this.itemName=itemName;
		this.deskSpace=deskSpace;
	}
	
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public String getItemname() {
		return itemName;
	}
	public void setItemname(String itemName) {
		this.itemName = itemName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDeskSpace() {
		return deskSpace;
	}
	public void setDeskSpace(int deskSpace) {
		this.deskSpace = deskSpace;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Computer that = (Computer) o;
        return this.id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
	
	

}
