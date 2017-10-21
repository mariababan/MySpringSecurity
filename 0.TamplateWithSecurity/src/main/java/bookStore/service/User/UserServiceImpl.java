package bookStore.service.User;


import bookStore.dto.UserDto;
import bookStore.entity.Role;
import bookStore.entity.User;
import bookStore.repository.RoleRepository;
import bookStore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mariababan on 15/04/2017.
 */
@Service
public class UserServiceImpl  implements UserService{

    private UserRepository userRepository;
    private RoleRepository roleRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository){
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;

    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User create(UserDto userDto) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        User user = new User(userDto.username, passwordEncoder.encode(userDto.password));
        return userRepository.save(user);

    }

    @Override
    public void delete(String username) {
        userRepository.delete(username);
    }

    @Override
    public void update(UserDto userDto, String password) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        userRepository.updateUser(userDto.username, passwordEncoder.encode(userDto.password));
    }


    @Override
    public void createRole(UserDto userDto) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        User user = new User(userDto.username, passwordEncoder.encode(userDto.password));
        userRepository.save(user);
        Role role = new Role(user.getUsername(), "USER");
        roleRepository.save(role);
    }


}
