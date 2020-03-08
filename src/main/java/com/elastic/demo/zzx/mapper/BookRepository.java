package com.elastic.demo.zzx.mapper;

import com.elastic.demo.zzx.entity.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends ElasticsearchRepository<Book,Integer> {

    List<Book> findByBookNameLike(String bookName);
}
