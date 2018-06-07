package br.com.dfd.userservice.repository;

import br.com.dfd.userservice.model.User;
import br.com.pedroloureiro.repository.GenericCrudRepository;

public interface UserRepository extends GenericCrudRepository<User, Long> {

    public User findByName(String name);

}
