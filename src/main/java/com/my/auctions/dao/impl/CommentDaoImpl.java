package com.my.auctions.dao.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.my.auctions.dao.CommentDao;
import com.my.auctions.model.Comment;

@Repository
public class CommentDaoImpl implements CommentDao {
	
	private static final String SQL_ADD_COMMENT = "INSERT INTO Comments (userId, lotId, note, publishedDate) values (?, ?, ?, ?);";
	private static final String SQL_DELETE_COMMENT = "DELETE FROM Comments WHERE id=?;";
	private static final String SQL_GET_COMMENTS_BY_LOT = "SELECT * FROM Comments WHERE idLot=?;";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void add(Comment comment) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int idComment) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Comment> getAllByLot(int idLot) {
		// TODO Auto-generated method stub
		return null;
	}

}
