package com.khairul82.SpringCrudSQL.repository;

import com.khairul82.SpringCrudSQL.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long > {
}
