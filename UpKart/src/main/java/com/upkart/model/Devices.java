/**
 * 
 */
package com.upkart.model;

/**
 * @author AshishKumar
 *
 */
public enum Devices {
	
	NULL("No Vales"),LAPTOP("Laptop"), MOBILE("Mobile");
	
	public String productName;

	private Devices(String productName) {
		this.productName = productName;
	}
	
}
