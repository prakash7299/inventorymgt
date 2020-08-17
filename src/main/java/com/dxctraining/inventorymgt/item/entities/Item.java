package com.dxctraining.inventorymgt.item.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

@Entity
@Table(name="items")
public class Item {
	@Id
	@GeneratedValue
	int id;
	String name;
	Supplier supplier;
	public Item(String name,Supplier supplier) {
		this.name=name;
		this.supplier=supplier;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
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
        Item that = (Item) o;
        return id == that.id;
		
	}

}