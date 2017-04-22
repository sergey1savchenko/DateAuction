package com.my.auctions.dao;

import java.util.ArrayList;

import com.my.auctions.model.Comment;

public interface CommentDao {
	
	void add(Comment comment);
	void delete(int idComment);
	
	ArrayList<Comment> getAllByLot(int idLot);

}
