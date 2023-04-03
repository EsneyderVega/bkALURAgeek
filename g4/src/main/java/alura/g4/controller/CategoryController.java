/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.g4.controller;

import alura.g4.model.Category;
import alura.g4.model.Product;
import alura.g4.service.CategoryService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC
 */
@RestController
@RequestMapping("/")
@CrossOrigin(origins = "/", methods= {RequestMethod.GET,RequestMethod.POST})
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("api/categoria/all")
    public List<Category> getAll(){
        return categoryService.getAll();
    }
    @GetMapping("api/categoria/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category category){
        return categoryService.save(category);
    }
    
   @GetMapping("api/categoria/id/")
    public Optional<Category> getOne(@RequestParam int id){
        return categoryService.getOne(id);
    }
}
