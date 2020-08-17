package com.dxctraining.inventorymgt.item.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;
@Entity
public class Computer extends Item {
	@Id
	@GeneratedValue
	private int id;
	private int deskSize;
	public Computer(String name,Supplier supplier,int deskSize) {
		super(name,supplier);
		this.deskSize=deskSize;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDeskSize() {
		return deskSize;
	}
	public void setDeskSize(int deskSize) {
		this.deskSize = deskSize;
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
