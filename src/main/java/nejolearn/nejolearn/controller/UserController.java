package nejolearn.nejolearn.controller;

import nejolearn.nejolearn.models.user.TblUser;
import nejolearn.nejolearn.models.user.UserRequest;
import nejolearn.nejolearn.services.UserService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<TblUser> getAllUsers(){
        return userService.getAll();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public TblUser createNewUser(@RequestBody UserRequest newUser){
        return userService.createUser(
                newUser.getName(),
                newUser.getEmail(),
                newUser.getPassword());
    }

}