package com.example.rorodictionarybe.services;

import java.util.List;

public interface CrudService <T, ID>{
    T add(T entity);
    T remove(ID id);
    T update(ID id, T patch);
    List<T> getAll();

    T getDetailEntity(ID id);
}
