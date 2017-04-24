package com.my.auctions.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.auctions.dao.CommentDao;
import com.my.auctions.model.Comment;
import com.my.auctions.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentDao commentDao;
	
	@Override
	public void add(Comment comment) {
		commentDao.add(comment);
	}

	@Override
	public void delete(int idComment) {
		commentDao.delete(idComment);
	}

	@Override
	public List<Comment> getAllByLot(int idLot) {
		return commentDao.getAllByLot(idLot);
	}

}
