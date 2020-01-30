package com.JPASetup.JPADB;

import com.JPASetup.JPADB.Entity.User;
import com.JPASetup.JPADB.Service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log =
            LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);

    @Autowired
    private UserDAOService userDAOService;

    //creating a user and logging it
    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jack", "Admin");
        Long insert = userDAOService.insert(user);
        log.info("New user is created" + user);
    }
}
