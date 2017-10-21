package bookStore.repository;

import bookStore.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mariababan on 22/04/2017.
 */
public class MockUserRepository implements UserRepository {

    @Override
    public User findByUsername(@Param("username") String username) {
        User u1 = new User("TestUser1","Blabla");
        return u1;
    }

    @Override
    public void updateUser(@Param("username") String username, @Param("password") String password) {
        User u1 = new User("TestUser1","Blabla");
    }

    @Override
    public List<Book> booksOut() {
        Book b1 = new Book("Ion3", "Maria1", "Comedy", "good", 10, 0);
        Book b2 = new Book("Ion2", "Maria2", "Comedy", "good", 10, 0);
        Book b3 = new Book("Ion1", "Maria3", "Comedy", "good", 10, 0);
        Book b4 = new Book("Ion1", "Maria3", "Comedy", "good", 10, 0);

        List<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        return books;
    }

    @Override
    public <S extends User> S save(S entity) {
        User u1 = new User("TestUser1","Blabla");
        return (S) u1;
    }

    @Override
    public User findOne(String s) {
        return null;
    }

    @Override
    public boolean exists(String s) {
        return false;
    }

    @Override
    public List<User> findAll() {
        User u1 = new User("TestUser1","Blabla");
        User u2 = new User("TestUser2","Blabla1");
        User u3 = new User("TestUser2","Blabla2");

        List<User> users = new ArrayList<>();

        users.add(u1);
        users.add(u2);
        users.add(u3);

        return users;
    }

    @Override
    public List<User> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<User> findAll(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public void delete(User entity) {
        User u1 = new User("TestUser4","Blabla");
        User u2 = new User("TestUser5","Blabla1");
        User u3 = new User("TestUser6","Blabla2");
    }

    @Override
    public void delete(Iterable<? extends User> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void flush() {

    }

    @Override
    public void deleteInBatch(Iterable<User> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public User getOne(String s) {
        return null;
    }

    @Override
    public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends User> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends User> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends User> List<S> save(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends User> S findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends User> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends User> boolean exists(Example<S> example) {
        return false;
    }
}
