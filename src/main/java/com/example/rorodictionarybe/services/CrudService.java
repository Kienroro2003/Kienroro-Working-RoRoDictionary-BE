package com.example.rorodictionarybe.services;

public interface CrudService <T, ID>{
    T add(T entity);
    T remove(ID id);
    T update(ID id, T patch);
}
