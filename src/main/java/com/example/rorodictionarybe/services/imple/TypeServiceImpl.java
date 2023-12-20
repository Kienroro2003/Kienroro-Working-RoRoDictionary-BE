package com.example.rorodictionarybe.services.imple;

import com.example.rorodictionarybe.entities.Type;
import com.example.rorodictionarybe.repositories.TypeRepository;
import com.example.rorodictionarybe.services.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeRepository repoType;
    @Override
    public Type add(Type entity) {
        return repoType.save(entity);
    }

    @Override
    public Type remove(Long aLong) {
        return null;
    }

    @Override
    public Type update(Long aLong, Type patch) {
        return null;
    }

    @Override
    public List<Type> getAll() {
        return repoType.findAll();
    }
}
