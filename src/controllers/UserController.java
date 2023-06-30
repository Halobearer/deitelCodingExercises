package controllers;

import africa.semicolon.myEmailApp.dtos.requests.RegisterUserRequest;
import org.springframework.web.bind.annotation.*;
import services.UserService;
import services.UserServiceImpl;

@RestController
@RequestMapping("")
public class UserController {

    private UserService userService = new UserServiceImpl();


    @PostMapping("/user/register")
    public Object registerUser(RegisterUserRequest registerUserRequest) {
        try {
            return userService.register(registerUserRequest);
        } catch (IllegalArgumentException ex) {
            return ex.getMessage();
        }
    }

    @GetMapping("/user/userId{userId}")
    public Object findUserById(int id, @PathVariable String userId) {
        return userService.findUser(id);
    }

    @GetMapping("/user/findByUsername{username}")
    public Object findUserByUsername(String userName, @PathVariable String username) {
        return userService.findByUsername(userName);
    }
}
