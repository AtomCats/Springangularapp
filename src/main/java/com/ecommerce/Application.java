package com.ecommerce;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ecommerce.spring.model.User;
import com.ecommerce.spring.model.UserPermission;
import com.ecommerce.spring.repository.AdminRepository;
import com.ecommerce.spring.repository.UserPermissionRepository;
import com.ecommerce.spring.repository.UserRepository;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository, AdminRepository adminRepository, UserPermissionRepository permissionRepository) {
        return args -> {
            UserPermission adminPermission = new UserPermission(1, "Admin", null);
            UserPermission userPermission = new UserPermission(2, "User", null);
/*            UserPermission adminPermission = new UserPermission(1, "Admin");
            UserPermission userPermission = new UserPermission(2, "User");*/
            permissionRepository.save(adminPermission);
            permissionRepository.save(userPermission);

            userRepository.save(new User(1l,"Anton1", "Anton", "Eremin", Arrays.asList(adminPermission)));
            userRepository.save(new User(2l,"Bonifacy", "Bon", "Eremin", Arrays.asList(userPermission)));
/*            userRepository.save(new User(1l,"Anton1", "Anton", "Eremin"));
            userRepository.save(new User(2l,"Bonifacy", "Bon", "Eremin"));*/

        };
    }
}
