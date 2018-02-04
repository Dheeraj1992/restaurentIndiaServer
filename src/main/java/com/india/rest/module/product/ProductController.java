/*
 * Created on Jan 2, 2018
 *
 * com.india.rest.module.product.ProductController.java}
 * 
 * Copyright (c) 
 *
 * 
 */
package com.india.rest.module.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    
    @Autowired
    ProductService productService;
    
    @RequestMapping(method = RequestMethod.GET, value = "/getAllProducts")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/saveProduct")
    public Product saveProduct(@RequestBody Product pro)
    {
        return productService.saveProduct(pro);
    }

}
