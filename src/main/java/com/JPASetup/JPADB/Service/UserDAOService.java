package com.JPASetup.JPADB.Service;
//need to import classes that are in different packages!!!
import com.JPASetup.JPADB.Entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional //each method will be involved in a transaction
public class UserDAOService {

    @PersistenceContext
private EntityManager entityManager;

    public long insert(User user){
        entityManager.persist(user);
        return user.getId();
    }
}

