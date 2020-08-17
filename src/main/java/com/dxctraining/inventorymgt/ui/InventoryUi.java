package com.dxctraining.inventorymgt.ui;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctraining.inventorymgt.item.entities.Computer;
import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.item.entities.Phone;
import com.dxctraining.inventorymgt.item.exceptions.ItemNotFoundException;
import com.dxctraining.inventorymgt.item.service.IItemService;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import com.dxctraining.inventorymgt.supplier.exceptions.InvalidArgumentException;
import com.dxctraining.inventorymgt.supplier.exceptions.SupplierNotFoundException;
import com.dxctraining.inventorymgt.supplier.service.ISupplierService;

@Component
public class InventoryUi {
	
	@Autowired
	private ISupplierService service1;
	
	@Autowired
	private IItemService service2;
	
	@PostConstruct
	private void runapp() {
		try {
			Supplier supplier1=new Supplier("praveen");
			supplier1=service1.add(supplier1);
			Supplier supplier2=new Supplier("prakash");
			supplier2=service1.add(supplier2);
			Item item1=new Item("ggadget",supplier1);
			Item item2=new Item("ECEproduct",supplier1);
			Item item3=new Item("Mechproduct",supplier1);
			Computer item4=new Computer("Dell",supplier2,200);
			Phone item5=new Phone("micromax",supplier2,500);
			service2.add(item2);
			service2.add(item1);
			service2.add(item3);
			service2.add(item4);
			service2.add(item5);
			service2.remove(3);
			int id2=item5.getId();
			int id1 = supplier1.getId();
			Supplier fetched = service1.findSupplierById(id1);
			System.out.println("Supplier :"+fetched.getId()+"name :"+fetched.getName());
			Item fetchedItem=service2.findItemById(id2);
			Supplier supplierinfo=fetchedItem.getSupplier();
			System.out.println("Item id"+fetchedItem.getId()+"Item name"+fetchedItem.getName()+"Supplier name :"+supplierinfo.getName());
		}catch (InvalidArgumentException e) {
			e.printStackTrace();
		}

		catch (ItemNotFoundException e) {
			e.printStackTrace();
		}

}
}
