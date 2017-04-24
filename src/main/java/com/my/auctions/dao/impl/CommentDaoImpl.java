package com.my.auctions.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
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
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(SQL_ADD_COMMENT, new String[] { "id" });
				ps.setInt(1, comment.getUser().getId());
				ps.setInt(2, comment.getApplication().getId());
				ps.setString(3, comment.getNote());
				ps.setDate(4, comment.getPublishedDate());
				return ps;
			}
			
		}, keyHolder);	
		comment.setId(keyHolder.getKey().intValue());
	}

	@Override
	public void delete(int idComment) {
		jdbcTemplate.update(SQL_DELETE_COMMENT, idComment);
	}

	@Override
	public List<Comment> getAllByLot(int idLot) {
		// TODO Auto-generated method stub
		return null;
	}

}
