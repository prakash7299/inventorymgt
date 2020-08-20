package com.dxctraining.inventorymgt.item.dto;

public class CreateComputerRequest {
	private String itemname;
	private int deskSpace;
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getDeskSpace() {
		return deskSpace;
	}
	public void setDeskSpace(int deskSpace) {
		this.deskSpace = deskSpace;
	}
	

}
