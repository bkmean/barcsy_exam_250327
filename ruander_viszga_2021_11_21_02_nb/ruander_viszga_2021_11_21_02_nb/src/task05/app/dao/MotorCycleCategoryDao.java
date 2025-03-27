package task05.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import task05.app._utils.Database;
import task05.app.entity.MotorCycleCategory;

public class MotorCycleCategoryDao {
	private Connection connection = new Database().createConnection();
	private ResultSet resultSet = null;
	private PreparedStatement preparedStatement = null;
	
	public List<MotorCycleCategory> getAll() {
		List<MotorCycleCategory> motorCycleCategories = new ArrayList<MotorCycleCategory>();
		String sql = "SELECT * FROM motor_cycle_category";
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				motorCycleCategories.add(getObjectFromResultSet());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return motorCycleCategories;
	}
	
	public MotorCycleCategory getObjectFromResultSet() {
		MotorCycleCategory motorCycleCategory = null;
		try {
			motorCycleCategory = new MotorCycleCategory(
				resultSet.getInt("id"),
				resultSet.getString("name")
			);
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return motorCycleCategory;
	}
	
	public MotorCycleCategory getById(int id) {
		MotorCycleCategory motorCycleCategory = null;
		String sql = "SELECT * FROM motor_cycle_category WHERE id = ?;";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				motorCycleCategory = getObjectFromResultSet();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return motorCycleCategory;
	}
}
