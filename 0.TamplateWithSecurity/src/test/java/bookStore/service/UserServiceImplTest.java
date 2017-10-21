package bookStore.service;

import bookStore.dto.UserDto;
import bookStore.repository.MockRoleRepository;
import bookStore.repository.MockUserRepository;
import bookStore.service.User.UserService;
import bookStore.service.User.UserServiceImpl;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by mariababan on 22/04/2017.
 */
public class UserServiceImplTest {

    private static UserService target;

    @BeforeClass
    public static void init() {
        target = new UserServiceImpl(new MockUserRepository(), new MockRoleRepository());
    }

    @Test
    public void testAll() {
        //view
        Assert.assertTrue(target.getAll().size() == 3);
    }

    @Test
    public void createUser() {
        //create new user
        UserDto userDto = new UserDto();
        Assert.assertThat(target.create(userDto).getUsername(), is("TestUser1"));
    }

    @Test
    public void findByUsername() {
        //test find by username
        Assert.assertThat(target.findByUsername("TestUser2").getPassword(), is("Blabla"));
    }

    @Test
    public void deleteUser() {
        //test delete
        target.delete("TestUser4");
    }

    @Test
    public void updateUser() {
        //update a user
        UserDto userDto = new UserDto();
        target.update(userDto,"NewPassword");
    }

    @Test
    public void booksOut() {
        //out of stock books
        Assert.assertTrue(target.bookOut().size() == 4);
    }

}
