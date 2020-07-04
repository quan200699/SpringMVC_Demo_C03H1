package com.codegym.demo.service.user;

import com.codegym.demo.model.User;
import com.codegym.demo.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.delete(id);
    }
}
