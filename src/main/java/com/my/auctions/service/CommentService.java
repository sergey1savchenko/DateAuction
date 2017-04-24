package com.my.auctions.service;

import java.util.List;

import com.my.auctions.model.Comment;

public interface CommentService {
	
	void add(Comment comment);
	void delete(int idComment);
	
	List<Comment> getAllByLot(int idLot);

}
