package com.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mall.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Extra queries can be added later
}
