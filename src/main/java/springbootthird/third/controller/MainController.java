package springbootthird.third.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootthird.third.repository.UserRepo;

@RestController
public class MainController {


    @Autowired
    private UserRepo userRepo;

    @GetMapping("/users")
    public String getUserString() {
        return "users";
    }

    @GetMapping("/posts")
    public String getPosts() {
        return "These are the posts provided by me";
    }



}
