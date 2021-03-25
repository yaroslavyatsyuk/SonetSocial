package com.yyatsiuk.social.sonet.repository;


import com.yyatsiuk.social.sonet.model.content.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Long> {

    boolean existsById(Long id);

    Page<Comment> findAllByPostId(Pageable var, Long postId);

    List<Comment> findAllByPostIdAndCreatorId(Long postId, Long userId);
}
