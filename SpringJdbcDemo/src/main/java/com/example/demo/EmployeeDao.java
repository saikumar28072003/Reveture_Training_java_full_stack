package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	private final NamedParameterJdbcTemplate npjt;

	public EmployeeDao(NamedParameterJdbcTemplate npjt) {
		this.npjt = npjt;
	}

	public List<Employee> getallemps(){
		return npjt.query("select * from employee", new EmployeeRowMapper());
	}
	
	public Employee getEmpById(int id) {
		String sql="select * from employee where id=:id";
		return npjt.queryForObject(sql, Map.of("id",id), new EmployeeRowMapper());
	}
	
	public int addEmployee(Employee emp) {
		String sql="""
				insert into employee (id,name,salary)
				values(:id,:name,:salary)
				""";
		return npjt.update(sql, new BeanPropertySqlParameterSource(emp));
	}
	
}
