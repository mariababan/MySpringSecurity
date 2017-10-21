package bookStore.service.User;

import bookStore.dto.UserDto;
import bookStore.entity.User;

import java.util.List;

/**
 * Created by mariababan on 15/04/2017.
 */
public interface UserService {

    List<User> getAll();

    User findByUsername(String username);

    User create(UserDto user);

    void delete(String username);

    void update(UserDto user, String password);

    void createRole(UserDto userDto);


}
