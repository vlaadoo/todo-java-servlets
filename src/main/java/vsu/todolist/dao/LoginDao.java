package vsu.todolist.dao;

import vsu.todolist.model.LoginBean;
import vsu.todolist.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDao {

	public boolean validate(LoginBean loginBean) throws ClassNotFoundException {
		boolean status = false;

		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = JDBCUtils.getConnection();

			 PreparedStatement preparedStatement = connection
						.prepareStatement("select * from users where username = ? and password = ? ")) {
			preparedStatement.setString(1, loginBean.getUsername());
			preparedStatement.setString(2, loginBean.getPassword());

			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			status = rs.next();

		} catch (SQLException e) {
			JDBCUtils.printSQLException(e);
		}
		return status;
	}
}
