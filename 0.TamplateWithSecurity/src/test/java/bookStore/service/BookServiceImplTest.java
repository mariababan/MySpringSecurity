package bookStore.service;

import bookStore.repository.MockBookRepository;
import bookStore.repository.MockSellRepository;
import bookStore.service.Book.BookService;
import bookStore.service.Book.BookServiceImpl;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by mariababan on 22/04/2017.
 */
public class BookServiceImplTest {

    private static BookService target;

    @BeforeClass
    public static void init() {
        target = new BookServiceImpl(new MockBookRepository(), new MockSellRepository());
    }

    @Test
    public void testAll() {
        //view
        Assert.assertTrue(target.getAll().size() == 3);
    }

    @Test
    public void CreateBook() {
        //create new book
        BookDto bookDto = new BookDto();
        Assert.assertThat(target.create(bookDto).getAuthor(), is("Maria3"));
    }

    @Test
    public void findById() {
        //test find by id
        Assert.assertThat(target.findById(1).getTitle(), is("Ion4"));
    }

    @Test
    public void delete() {
        //test delete
        target.delete(1);
    }

    @Test
    public void findByGenre() {
        //test find by genre
        Assert.assertTrue(target.findByGenre("Comedy").size() == 3);
    }

    @Test
    public void findByTitle() {
        //test find by title
        Assert.assertTrue(target.findByTitle("Ion").size() == 2);
    }

    @Test
    public void findByAuthor() {
        //test find by author
        Assert.assertTrue(target.findByAuthor("Maria").size() == 1);
    }

    @Test
    public void update() {
        //update a book
        BookDto bookDto = new BookDto();
        target.update(bookDto,1);
    }

    @Test
    public void sellBook() {
        //sell a book
        Book b1 = new Book("ion", "Maria4", "Comedy", "good", 10, 1);
        Book b2 = new Book("ion", "Maria4", "Comedy", "good", 10, 1);
        target.sellBook(b1);
        Assert.assertThat(b1.getNr_of_copies(), is(0));
    }


}

