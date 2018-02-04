/*
 * Created on Jan 2, 2018
 *
 * com.india.rest.module.category.CategoryService.java}
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

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    CategoryGroupRepository categoryGroupRepository;
    
    @Autowired
    CategoryRepository categoryRepository;
    
    @Autowired
    SubcategoryRepository subcategoryRepository;
    
    public List<Category> getAllCategories()
    {
        List<Category> categories = new ArrayList<Category>();
        categoryRepository.findAll().forEach(categories::add);
        return categories;
    }
    
    public List<CategoryGroup> getAllCategoryGroups()
    {
        List<CategoryGroup> categorygroups = new ArrayList<CategoryGroup>();
        categoryGroupRepository.findAll().forEach(categorygroups::add);
        return categorygroups;
    }
    
    public List<Subcategory> getAllSubcategories()
    {
        List<Subcategory> subcategories = new ArrayList<Subcategory>();
        subcategoryRepository.findAll().forEach(subcategories::add);
        return subcategories;
    }

    public CategoryGroup getCategoryGroup(int groupId) {
        CategoryGroup categorygroup = new CategoryGroup();
        categorygroup=categoryGroupRepository.findOne(groupId);
        return categorygroup;
    }
}
