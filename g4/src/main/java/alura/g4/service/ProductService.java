/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.g4.service;

import alura.g4.model.Product;
import alura.g4.repository.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

/**
 *
 * @author PC
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    
    public List<Product> getAll(){
     return productRepository.getAll();
    }
    public Optional<Product> getOne(int id){
        return productRepository.getProduct(id);
    }
    
    public Product save(Product product){
        if(product.getId()==null){
            return productRepository.save(product);
        }else{
            Optional<Product> evtProduct = productRepository.getProduct(product.getId());
            if(evtProduct.isPresent()){
                return productRepository.save(product);
            }else{
                return product;
            }
        }
    }
}
