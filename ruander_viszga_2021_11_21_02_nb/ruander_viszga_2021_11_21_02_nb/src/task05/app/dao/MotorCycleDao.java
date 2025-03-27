package task05.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import task05.app._utils.Database;
import task05.app.entity.MotorCycle;
import task05.app.entity.MotorCycleCategory;

public class MotorCycleDao {

	private Connection connection = new Database().createConnection();
	private ResultSet resultSet = null;
	private PreparedStatement preparedStatement = null;
	
	public List<MotorCycle> getAll() {
		List<MotorCycle> motorCycles = new ArrayList<MotorCycle>();
		// ToDo: folytatás - Hiányzó kódrészlet
		return motorCycles;
	}
	
	public MotorCycle getObjectFromResultSet() {
		MotorCycle motorCycle = null;
		MotorCycleCategoryDao motorCycleCategoryDaoObj = new MotorCycleCategoryDao();
		try {
			MotorCycleCategory motorCycleCategory = motorCycleCategoryDaoObj.getById(resultSet.getInt("category_id"));
			motorCycle = new MotorCycle(
					resultSet.getInt("id"),
					resultSet.getString("manufacturer"),
			        resultSet.getString("model"),
			        motorCycleCategory,
			        resultSet.getBoolean("status")
			);
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return motorCycle;
	}
}
