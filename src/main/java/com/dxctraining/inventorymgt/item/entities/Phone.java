package com.dxctraining.inventorymgt.item.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

@Entity
public class Phone extends Item{
	@Id
	@GeneratedValue
	private int id;
	private int storageSpace;
	public Phone() {
		
	}
	public Phone(String name,Supplier supplier,int storageSpace) {
		super(name,supplier);
		this.storageSpace=storageSpace;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStorageSpace() {
		return storageSpace;
	}
	public void setStorageSpace(int storageSpace) {
		this.storageSpace = storageSpace;
	}
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Phone that = (Phone) o;
        return this.id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

}
