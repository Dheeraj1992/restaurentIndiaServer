/**
 * 
 */
package com.india.rest.module.cart;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	int cartId;
	Date dateCreated;
	
	@OneToOne(mappedBy = "cart")
	private User user;
	
	public int getCartId() {
		return cartId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

}
