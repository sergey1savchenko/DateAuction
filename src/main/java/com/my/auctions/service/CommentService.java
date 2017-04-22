package com.my.auctions.service;

import java.util.ArrayList;

import com.my.auctions.model.Comment;

public interface CommentService {
	
	void add(Comment comment);
	void delete(int idComment);
	
	ArrayList<Comment> getAllByLot(int idLot);

}
