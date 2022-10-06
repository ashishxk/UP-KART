/**
 * 
 */
package com.upkart.dao;

import java.util.List;

import com.upkart.model.User;
import com.upkart.model.UserLogin;

/**
 * @author AshishKumar
 *
 */
public interface IUserDao {
	/**
	 * @param userLogin
	 * @return
	 */
	String registerUser(UserLogin userLogin);

	/**
	 * @param userName
	 * @param password
	 * @return
	 */
	UserLogin login(String userName, String password);

	/**
	 * @param userName
	 * @param oldPassword
	 * @param newPassword
	 * @return
	 */
	String changePassword(String userName, String oldPassword, String newPassword);
	
	
	/**
	 * @param userName
	 * @return
	 */
	String deleteAccount(String userName);
	
	/**
	 * @param userCart
	 */
	void addToCart(User userCart);
	
	/**
	 * @param category
	 */
	void emptyCart(String category, String productName);
	
	/**
	 * @return
	 */
	List<User> viewCartItems(String userName);
	
	/**
	 * @param brand
	 * @return
	 */
	List<User> viewByBrand(String brand);
	
	/**
	 * @param productName
	 * @return
	 */
	List<User> viewByProductName(String productName);
	
	/**
	 * @param category
	 * @param productName
	 * @param brand
	 * @return
	 */
	List<User> viewByCategory(String category, String productName, String brand);

}
