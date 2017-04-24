package com.my.auctions.dao;

import java.util.List;

import com.my.auctions.model.Comment;

public interface CommentDao {
	
	void add(Comment comment);
	void delete(int idComment);
	
	List<Comment> getAllByLot(int idLot);

}
