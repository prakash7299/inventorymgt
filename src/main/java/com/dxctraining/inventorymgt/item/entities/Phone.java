package com.dxctraining.inventorymgt.item.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

@Entity
@Table(name="Phones_information")
public class Phone{
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int storageMemory;
	@ManyToOne
	private Supplier supplier;
	public Phone() {
		
	}
	public Phone(String name,int storageMemory) {
		this.name=name;
		this.storageMemory=storageMemory;
	}
	
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStorageMemory() {
		return storageMemory;
	}
	public void setStorageSpace(int storageMemory) {
		this.storageMemory = storageMemory;
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
