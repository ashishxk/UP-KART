/**
 * 
 */
package com.upkart.model;

/**
 * @author AshishKumar
 *
 */
public enum ElectronicsBrand {
	
	NULL("No Vales"),APPLE("Apple"), ASUS("Asus"), ALIENWARE("Alienware"), MSI("MSI"), HP("Hp"), LEGION("Legion");
	
	public String brand;

	private ElectronicsBrand(String brand) {
		this.brand = brand;
	}
	
	
}
