/**
 * 
 */
package com.upkart.model;

/**
 * @author AshishKumar
 *
 */
public enum Category {
	
	NULL("No Vales"),ELECTRONICS("Electronics"), GROCERY("Grocery"), FASHION("Fashion");

	public String category;

	private Category(String category) {
		this.category = category;
	}

}
