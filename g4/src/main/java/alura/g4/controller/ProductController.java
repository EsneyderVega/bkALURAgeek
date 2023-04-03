package alura.g4.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import alura.g4.service.ProductService;
import alura.g4.model.Product;
import java.util.Optional;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
@RestController
@RequestMapping("/")
@CrossOrigin(origins = "/", methods= {RequestMethod.GET,RequestMethod.POST})
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("api/producto/holaMundo")
    public String saluda(){
    return "<h1>Hola Mundo!</h1>";
    }
    
    @GetMapping("api/producto/all")
    public List<Product> getAll(){
        return productService.getAll();
    }
    
    @PostMapping("api/producto/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Product save(@RequestBody Product product){
        
        return productService.save(product);
    }
    
     @GetMapping("api/producto/id/")
    public Optional<Product> getOne(@RequestParam int id){
        return productService.getOne(id);
    }
}
