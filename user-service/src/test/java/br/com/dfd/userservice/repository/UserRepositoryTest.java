/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dfd.userservice.repository;

import br.com.dfd.userservice.model.User;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author pedro
 */
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class UserRepositoryTest{
    
    @Autowired
    private TestEntityManager entityManager;
    
    @Autowired
    private UserRepository userRepository;
    
    @Test
    public void whenFindByName_thenReturnUser(){
        
        //Arrange
        User user = new User();
        user.setName("Pedro");
        user.setEmail("pedroloureiro2@gmail.com");
        user.setPassword("xxxxx");
        user.setUsername("pedroloureiro");
        
        this.entityManager.persist(user);
        this.entityManager.flush();
        //Act
        
        User foundedUser = this.userRepository.findByName("Pedro");
        
        //Assert
        Assertions.assertThat(foundedUser.getEmail()).isEqualTo("pedroloureiro2@gmail.com");
        
    }
    
}
