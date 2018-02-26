/*
 * Created on Jan 2, 2018
 *
 * com.india.rest.module.category.CategoryService.java}
 * 
 
 */
package com.india.rest.module.category;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.india.rest.module.product.Product;

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
    
    public List<Product> getProductsByCategoryGroup(int groupId) {
        List<Product> products= new ArrayList<Product>();
        categoryGroupRepository.findOne(groupId).getCategories().forEach(categories->{
            categories.getSubcategories().forEach((subCategories)->{
                subCategories.getProducts().forEach(products::add);
            });
        });
        return products;
    }
    
    public List<Product> getProductsByCategoryGroupAndCategory(int groupId, int categoryId) {
        List<Product> products= new ArrayList<Product>();
        categoryGroupRepository.findOne(groupId).getCategories().forEach(categories->{
            if(categories.getCategoryId()==categoryId)
            {
                categories.getSubcategories().forEach((subCategories)->{
                    subCategories.getProducts().forEach(products::add);
                });
            }
        });
        return products;
    }
    
}
