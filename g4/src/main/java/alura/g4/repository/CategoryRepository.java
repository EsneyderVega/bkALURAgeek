/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.g4.repository;

import alura.g4.model.Category;
import alura.g4.repositorycrud.CategoryCRUDRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PC
 */
@Repository
public class CategoryRepository {
    @Autowired
    private CategoryCRUDRepository categoryCRUDrepository;
    public List<Category> getAll(){
        return (List<Category>) categoryCRUDrepository.findAll();
    }
    public Optional<Category> getCategory(int id){
        return categoryCRUDrepository.findById(id);
    }
    public Category save(Category category){
        return  categoryCRUDrepository.save(category);
    }
    
}
