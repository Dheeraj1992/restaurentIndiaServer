/**
 * 
 */
package com.india.rest.module.cart;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.india.rest.module.user.User;

/**
 * @author Dheeraj
 *
 */

@Entity
@Table
public class Cart {
	
	@Id
	int productCartId;
	int cartId;
	int productId;
	int quantity;
	Date dateAdded;
	
	public int getProductCartId() {
		return productCartId;
	}
	public void setProductCartId(int productCartId) {
		this.productCartId = productCartId;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

}
