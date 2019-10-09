package com.ecommerce;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ecommerce.spring.model.Item;
import com.ecommerce.spring.model.ItemCategory;
import com.ecommerce.spring.model.User;
import com.ecommerce.spring.model.UserPermission;
import com.ecommerce.spring.repository.AdminRepository;
import com.ecommerce.spring.repository.ItemCategoryRepository;
import com.ecommerce.spring.repository.ItemRepository;
import com.ecommerce.spring.repository.UserPermissionRepository;
import com.ecommerce.spring.repository.UserRepository;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository, AdminRepository adminRepository,
                           UserPermissionRepository permissionRepository, ItemRepository itemRepository,
                           ItemCategoryRepository itemCategoryRepository) {
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

            ItemCategory furniture = new ItemCategory(1l,"Furniture", "Мягкая мебель",
                    null);
            ItemCategory cabinetFurniture = new ItemCategory(2l,"Сabinet furniture", "Корпусная мебель",
                    null);
            itemCategoryRepository.save(furniture);
            itemCategoryRepository.save(cabinetFurniture);


            //save image into database
            byte[] sofaImg = getClass().getResourceAsStream("sofa.jpg").readAllBytes();
            byte[] livingRoomImg = getClass().getResourceAsStream("cabinetFurniture.jpg").readAllBytes();

            Item couch = new Item(1L, "Couch",200F,sofaImg, Collections.singletonList(furniture));
            Item livingRoomFurniture = new Item(1L, "Living room furniture",500F,livingRoomImg,
                    Collections.singletonList(cabinetFurniture));

            itemRepository.save(couch);
            itemRepository.save(livingRoomFurniture);
        };
    }
}
