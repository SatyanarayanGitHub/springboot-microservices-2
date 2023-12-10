package com.srysoft.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srysoft.user.entity.User;
import com.srysoft.user.service.UserService;
import com.srysoft.user.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	

	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		log.info("Inside saveUser method of UserController");
		return userService.saveUser(user);
	}

	@GetMapping("/{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
		log.info("Inside getUserWithDepartment method of UserController");
		return userService.getUserWithDepartment(userId);
	}
}
