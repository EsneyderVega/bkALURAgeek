/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.g4.service;

import alura.g4.model.Category;
import alura.g4.repository.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryrepository;
    public List<Category> getAll(){
        return categoryrepository.getAll();
    }
    public Optional<Category> getOne(int id){
        return categoryrepository.getCategory(id);
    }
    public Category save(Category category){
        if(category.getId()==null){
            return categoryrepository.save(category);
        }else{
            Optional<Category> evtProduct = categoryrepository.getCategory(category.getId());
            if(evtProduct.isPresent()){
                return categoryrepository.save(category);
            }else{
                return category;
            }
        }
    }
    
    
}


