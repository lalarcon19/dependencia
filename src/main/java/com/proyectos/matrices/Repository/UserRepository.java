package com.proyectos.matrices.Repository;

import com.proyectos.matrices.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository {
    @Query("Select user_id from users where user_id = :id ")
    User getUserById(long id);
}
