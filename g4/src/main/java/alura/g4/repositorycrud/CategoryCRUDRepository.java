/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.g4.repositorycrud;

import alura.g4.model.Category;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC
 */
public interface CategoryCRUDRepository extends CrudRepository<Category,Integer>{
    
}
