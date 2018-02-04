/*
 * Created on Jan 2, 2018
 *
 * com.india.rest.module.category.CategoryController.java}
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
package com.india.rest.module.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.india.rest.module.product.Product;
import com.india.rest.module.product.ProductService;
import com.india.rest.module.user.User;
import com.india.rest.module.user.UserService;


@RestController
public class CategoryController {

    @Autowired //inject service DI
    CategoryService categoryService;
    
    @Autowired
    ProductService productService;
    
    
    @RequestMapping(value = "/getAllCategoryGroups")
    public List<CategoryGroup> getAllCategoryGroups()
    {
        return categoryService.getAllCategoryGroups();
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/getCategoryGroupByGroupId")
    public CategoryGroup getCategoryGroup(@RequestParam(value="groupId") int groupId)
    {
        System.out.println("##groupId Received: "+groupId);
        return categoryService.getCategoryGroup(groupId);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/getAllCategories")
    public List<Category> getAllCategories()
    {
        return categoryService.getAllCategories();
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/getAllSubCategories")
    public List<Subcategory> getAllSubCategories()
    {
        return categoryService.getAllSubcategories();
    }
    
    @RequestMapping("/getProductByName")
    public List<Product> getProductByName(@RequestParam(value="productName") String productName)
    {
    	return productService.getProductByName(productName);
    }
    
}
