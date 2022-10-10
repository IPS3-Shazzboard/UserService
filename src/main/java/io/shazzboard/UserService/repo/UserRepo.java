package io.shazzboard.userservice.repo;

import io.shazzboard.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
