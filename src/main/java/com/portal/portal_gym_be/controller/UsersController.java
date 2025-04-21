package com.portal.portal_gym_be.controller;

import com.portal.portal_gym_be.dtos.RUser;
import com.portal.portal_gym_be.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {

    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Page<RUser> getUsers(Pageable pageable) {
        return userService.findAll(pageable)
                .map(user -> new RUser(
                        user.getId(),
                        user.getName(),
                        user.getSurname(),
                        user.getEmail(),
                        user.getPayToDate()
                ));
    }
}
