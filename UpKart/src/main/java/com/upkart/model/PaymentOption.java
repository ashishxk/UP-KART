/**
 * 
 */
package com.upkart.model;

/**
 * @author AshishKumar
 *
 */
public enum PaymentOption {
	
	NULL("No Vales"),CREDIT("Credit Card"), DEBIT("Debit Card"), COD("Cash On Delivery"), NETBANKING("Net Banking");
	
	public String paymentOption;

	private PaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}
	
}
