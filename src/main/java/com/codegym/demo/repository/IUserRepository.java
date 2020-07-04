package com.codegym.demo.repository;

import com.codegym.demo.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IUserRepository extends PagingAndSortingRepository<User, Long> {
    User findByUsername(String username);
}
