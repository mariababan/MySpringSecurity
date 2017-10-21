package bookStore.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mariababan on 22/04/2017.
 */
public class MockBookRepository implements BookRepository{


    @Override
    public Book findByBookId(int id) {
        Book b1 = new Book("Ion4", "Maria4", "Comedy", "good", 10, 1);
        return b1;
    }

    @Override
    public List<Book> findByGenre(@Param("genre") String genre) {
        Book b1 = new Book("Ion3", "Maria1", "Comedy", "good", 10, 1);
        Book b2 = new Book("Ion2", "Maria2", "Comedy", "good", 10, 1);
        Book b3 = new Book("Ion1", "Maria3", "Comedy", "good", 10, 1);

        List<Book> books = new ArrayList<Book>();
                books.add(b1);
                books.add(b2);
                books.add(b3);

        return books;
    }

    @Override
    public List<Book> findByAuthor(@Param("author") String author) {
        Book b1 = new Book("Ion3", "Maria", "Comedy", "good", 10, 1);

        List<Book> books = new ArrayList<Book>();
        books.add(b1);

        return books;
    }

    @Override
    public List<Book> findByTitle(@Param("title") String title) {
        Book b1 = new Book("Ion", "Maria", "Comedy", "good", 10, 1);
        Book b2 = new Book("Ion", "Maria", "Comedy", "good", 10, 1);

        List<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);

        return books;
    }

    @Override
    public void updateBook(@Param("bookId") int id, @Param("title") String title, @Param("author") String author, @Param("genre") String genre, @Param("quality") String quality, @Param("price") int price, @Param("nr_of_copies") int nr_of_copies) {
        Book b1 = new Book("Ion", "Maria", "Comedy", "good", 10, 1);
    }

    @Override
    public <S extends Book> S save(S entity) {
        Book b1 = new Book("Ion3", "Maria3", "Comedy", "good", 10, 1);
        return (S) b1;
    }

    @Override
    public Book findOne(Integer integer) {
        Book b1 = new Book("ion", "Maria4", "Comedy", "good", 10, 1);
        return b1;
    }

    @Override
    public boolean exists(Integer integer) {
        return false;
    }

    @Override
    public List<Book> findAll() {
        return Arrays.asList(new Book("ion","maria","comedy","good",2,10),
                new Book("ion2", "maria2","comedy","good",3,20),
                new Book("ion3", "maria3","comedy","good",4,30));
    }

    @Override
    public List<Book> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Book> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Book> findAll(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Integer integer) {
        Book b1 = new Book("Ion", "Maria", "Comedy", "good", 10, 1);
        Book b2 = new Book("Ion2", "Maria2", "Drama", "poor", 10, 2);
    }

    @Override
    public void delete(Book entity) {

    }

    @Override
    public void delete(Iterable<? extends Book> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void flush() {

    }

    @Override
    public void deleteInBatch(Iterable<Book> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Book getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Book> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Book> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Book> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Book> List<S> save(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends Book> S findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Book> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Book> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Book> boolean exists(Example<S> example) {
        return false;
    }
}
