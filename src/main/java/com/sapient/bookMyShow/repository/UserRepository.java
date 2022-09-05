package com.sapient.bookMyShow.repository;

import com.sapient.bookMyShow.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, String> {
}
