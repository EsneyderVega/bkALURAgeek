/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.g4.repository;

import alura.g4.model.Product;
import alura.g4.repositorycrud.ProductCRUDRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PC
 */
@Repository
public class ProductRepository {
    @Autowired
    private ProductCRUDRepository productCRUDrepository;
    
    public List<Product> getAll(){
        return (List<Product>) productCRUDrepository.findAll();
    }
    public Optional<Product> getProduct(int id){
        return productCRUDrepository.findById(id);
    }
    public Product save(Product producto){
        return productCRUDrepository.save(producto);
    }
}
