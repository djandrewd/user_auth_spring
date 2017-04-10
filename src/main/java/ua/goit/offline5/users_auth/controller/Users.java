package ua.goit.offline5.users_auth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import ua.goit.offline5.users_auth.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Users controller.
 * <p>
 * Created by andreymi on 4/10/2017.
 */
@Controller
@RequestMapping("/user")
public class Users {

    /*@GetMapping("/hello")
    public ResponseEntity<String> sayHello(@RequestParam("name") String name) {
        return ResponseEntity.status(HttpStatus.OK)
                .body("Hello from " + name);

    }*/

    @GetMapping("/hello")
    public ModelAndView sayHello(@RequestParam("name") String name) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User u = new User();
            u.setName(name);
            u.setType(Integer.toString(i));
            users.add(u);
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("users", users);
        modelAndView.setViewName("users");
        return modelAndView;
    }
}
