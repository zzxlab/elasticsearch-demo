package com.elastic.demo.zzx;

import static org.junit.Assert.assertTrue;

import com.elastic.demo.zzx.entity.Book;
import com.elastic.demo.zzx.mapper.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Unit test for simple App.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ElasticApplicationTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Autowired
    BookRepository bookRepository;

    @Test
    public void createIndex(){
        Book book = new Book();
        book.setId(1);
        book.setBookName("西游记");
        book.setAuthor( "吴承恩" );
        bookRepository.index( book );
    }

    @Test
    public void useFind() {
        List<Book> list = bookRepository.findByBookNameLike( "游" );
        for (Book book : list) {
            System.out.println(book);
        }

    }

}
