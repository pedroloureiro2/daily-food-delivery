package br.com.dfd.userservice.services;

import org.springframework.stereotype.Service;

import br.com.dfd.userservice.model.User;
import br.com.dfd.userservice.repository.UserRepository;
import br.com.pedroloureiro.services.GenericCrudService;

@Service
public class UserManagement extends GenericCrudService<UserRepository,User> {

}
