package bookStore.repository;

import bookStore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mariababan on 15/04/2017.
 **/

public interface UserRepository  extends JpaRepository<User, String>{


    @Transactional
    @Query("SELECT u FROM User u WHERE u.username = :username")
    User findByUsername(@Param("username") String username);


    @Transactional
    @Modifying
    @Query("UPDATE User u SET u.password = :password WHERE u.username = :username")
    void updateUser(@Param("username") String username,@Param("password") String password);


}
