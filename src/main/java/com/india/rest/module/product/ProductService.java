/*
 * Created on Jan 2, 2018
 *
 * com.india.rest.module.product.ProductService.java}
 * 
 * Copyright (c) 2005 NCR Corporation
 * All rights reserved. 
 *
 * This software is the confidential and proprietary information of 
 * NCR Corporation. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with NCR Corporation. 
 */
package com.india.rest.module.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    ProductRepository productRepository;
    
    public List<Product> getAllProducts()
    {
        List<Product> products = new ArrayList<Product>();
        productRepository.findAll().forEach(products::add);
        return products;
    }
    
    public List<Product> getProductByName(String productName)
    {
    	List<Product> products = new ArrayList<Product>();
    	productRepository.findByProductNameContaining(productName).forEach(products::add);
    	return products;
    }
    
    public Product saveProduct(Product product)
    {
    	return productRepository.save(product);
    }

}
