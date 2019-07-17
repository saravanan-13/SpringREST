package com.pack.springrest.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pack.springrest.model.Employee;

@Repository(value = "mysqlDaoImpl")
public class MySQLEmployeeDAOImpl implements EmployeeDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int register(Employee employee) {

		System.out.println("Register Employee in MySQL DAO");

		String query = "insert into employee (name, password, email, age, salary, role) values (?,?,?,?,?,?)";
		try {
			return jdbcTemplate.update(query, employee.getName(), employee.getPassword(), employee.getEmail(),
					employee.getAge(), employee.getSalary(), employee.getRole());
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}

	}

	public Employee login(Employee employee) {

		System.out.println("Login Employee in MySQL DAO");

		String query = "select * from employee where name = '" + employee.getName() + "' and password = '"
				+ employee.getPassword() + "'";

		try {
			return jdbcTemplate.queryForObject(query, (rs, rowNum) -> new Employee(rs.getInt(1), rs.getString(2),
					rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDouble(6), rs.getString(7)));
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

	public List<Employee> listAll() {

		System.out.println("Login Employee in MySQL DAO");

		String query = "select * from employee";

		try {
			return jdbcTemplate.query(query, (rs, rowNum) -> new Employee(rs.getInt(1), rs.getString(2),
					rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDouble(6), rs.getString(7)));
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public Employee findById(int id) {
		
		System.out.println("Find By Id Employee in MySQL DAO");

		String query = "select * from employee where id = " + id;

		try {
			return jdbcTemplate.queryForObject(query, (rs, rowNum) -> new Employee(rs.getInt(1), rs.getString(2),
					rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDouble(6), rs.getString(7)));
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

	public int delete(int id) {
		System.out.println("Delete Employee in MySQL DAO");

		String query = "delete from employee where id = "+id;
		try {
			return jdbcTemplate.update(query);
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}

	}

}
