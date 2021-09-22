package com.vega.springit.repository;

import com.vega.springit.domain.Comment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepoditory extends JpaRepository<Comment, Long> {
	
}
