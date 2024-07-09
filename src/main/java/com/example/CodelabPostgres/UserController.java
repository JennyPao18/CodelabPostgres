package com.example.CodelabPostgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    User createUser(@RequestBody UserDto userDto) {
        //Crear un nuevo usuario
        User user = new User(userDto);
        //Guardar los datos del nuevo usuario
        return userRepository.save(user);
    }

    //Especificar ID del usuario que se desea ver
    @GetMapping("/{id}")
    User findById(@PathVariable Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        //Verificar si el usuario existe
        if (optionalUser.isPresent())
            //Mostrar los datos del usuario solicitado
            return optionalUser.get();
        //Sino existe, se devolverá un mensaje de error
        else throw new UserNotFoundException();
    }

}
