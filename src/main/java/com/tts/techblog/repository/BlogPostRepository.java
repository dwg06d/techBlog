package com.tts.techblog.repository;

import com.tts.techblog.model.BlogPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {


}
