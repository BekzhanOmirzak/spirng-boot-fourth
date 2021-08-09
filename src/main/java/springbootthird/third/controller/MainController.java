package springbootthird.third.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootthird.third.models.User;
import springbootthird.third.repository.UserRepo;

@RestController
public class MainController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping()
    private Iterable<User> getUserList() {
        return userRepo.findAll();
    }



}
