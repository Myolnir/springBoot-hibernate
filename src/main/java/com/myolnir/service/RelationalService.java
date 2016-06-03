package com.myolnir.service;

import com.myolnir.model.User;
import com.myolnir.repository.RelationalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RelationalService {

    @Autowired
    private RelationalRepository repository;

    public void save (User object) {
        repository.save(object);
    }

    public Optional<List<User>> findAll() {
        Iterable<User> users = repository.findAll();
        List<User> target = null;
        if (users != null) {
            target = new ArrayList<>();
            users.forEach(target::add);
        }
        return Optional.of(target);
    }
}
