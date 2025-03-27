package task05.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
    private List<MotorCycle> motors;
    private String[] header;

    public List<MotorCycle> getAll() {
        motors = new ArrayList<MotorCycle>();
        // ToDo: folytatás - Hiányzó kódrészlet
        String sql = "SELECT * FROM motor_cycle";
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            ResultSetMetaData rsmd = resultSet.getMetaData();
            getHeaderFromRsmd(rsmd);
            while (resultSet.next()) {
                motors.add(getObjectFromResultSet());
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // csak ellenőrzés végett beírt kód
        for (MotorCycle motor : motors) {
            System.out.println(motor);
        }
        // ellenőrzés vége
        return motors;
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

    private void getHeaderFromRsmd(ResultSetMetaData rsmd) throws SQLException {
        int size = rsmd.getColumnCount();
        int rsi = 0;
        header = new String[size];
        for (int i = 0; i < size; i++) {
            rsi += i;
            header[i] = rsmd.getColumnName(rsi).toUpperCase();
        }
    }

    public String[] getHeader() {
        return header;
    }
}
