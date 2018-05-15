package site.jackwang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.jackwang.entity.People;
import site.jackwang.service.UserService;

/**
 * @author wangjie<http://www.jackwang.site/>
 * @date 2018/5/15
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/add")
    public String addPeople(People people){
        userService.addPeople(people);
        return "add ok";
    }

}
