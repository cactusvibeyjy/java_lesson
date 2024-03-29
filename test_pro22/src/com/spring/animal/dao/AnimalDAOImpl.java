package com.spring.animal.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.animal.vo.AnimalVO;


public class AnimalDAOImpl implements AnimalDAO {
	private JdbcTemplate jdbcTemplate;
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List selectAllAnimals() throws DataAccessException {
		String query = "select id,name,local" + " from t_animal " + " order by id desc";
		List animalsList = new ArrayList();

		animalsList = this.jdbcTemplate.query(query, new RowMapper() {
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				AnimalVO animalVO = new AnimalVO();
				animalVO.setId(rs.getString("id"));
				animalVO.setName(rs.getString("name"));
				animalVO.setLocal(rs.getString("local"));
				return animalVO;
			}
		});
		return animalsList;
	}

	@Override
	public int addAnimal(AnimalVO animalVO) throws DataAccessException {
		String id = animalVO.getId();
		String name = animalVO.getName();
		String local = animalVO.getLocal();
		String query = "insert into t_animal(id, name, local) values  ("
		                 + "'" + id + "' ,"
		                 + "'" + name + "' ,"
		                 + "'" + local + "') ";
		System.out.println(query);
		int result = jdbcTemplate.update(query);
		System.out.println(result);
		return result;
	}

}
