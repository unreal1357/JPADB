package com.JPASetup.JPADB.Service;

import com.JPASetup.JPADB.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
