package br.com.dfd.userservice.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dfd.userservice.model.User;
import br.com.dfd.userservice.services.UserManagement;
import br.com.pedroloureiro.controller.GenericRestController;

@RestController
@RequestMapping("/users")
public class UserRestController extends GenericRestController<UserManagement,User> {

}
