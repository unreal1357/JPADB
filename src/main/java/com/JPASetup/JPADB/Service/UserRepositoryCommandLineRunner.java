package com.JPASetup.JPADB.Service;

import com.JPASetup.JPADB.Entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log =
            LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    //creating a user and logging it
    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jon", "Admin");
        userRepository.save(user);
        userRepository.findById(1L);
        log.info("New user is created" + user);

        Optional<User> userWithIdOne = userRepository.findById(1L);
        log.info("user is Retrieved" + userWithIdOne);

        List<User> users= userRepository.findAll();
        log.info("All Users: " + users);
    }
}
