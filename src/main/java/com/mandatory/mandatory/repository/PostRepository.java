package com.mandatory.mandatory.repository;

import com.mandatory.mandatory.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
// CrudRepository: dette interface benytter de metoder der findes i denne klasse
public interface PostRepository extends CrudRepository<Post, Long> {
}
