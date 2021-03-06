package com.codegym.demo.service;

public interface IGeneralService<T> {
    Iterable<T> findAll();

    void save(T t);

    T findById(Long id);

    void deleteById(Long id);
}
