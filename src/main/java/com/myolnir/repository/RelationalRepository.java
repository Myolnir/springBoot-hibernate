package com.myolnir.repository;

import com.myolnir.model.User;
import org.springframework.data.repository.CrudRepository;

public interface RelationalRepository extends CrudRepository<User, Long> {
}
