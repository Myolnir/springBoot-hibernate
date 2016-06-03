package com.myolnir.repository;

import com.myolnir.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelationalRepository extends CrudRepository<User, Long> {
}
