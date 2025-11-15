package AnimalCareCentre.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import AnimalCareCentre.server.service.UserService;

@RestController
@RequestMapping("/users/")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

}
