/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task05.app.views;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import task05.app.entity.MotorCycle;

/**
 *
 * @author Vizsga
 */
public class TableModelMotors extends AbstractTableModel {

    private List<MotorCycle> motors;
    private String[] header;

    public TableModelMotors(List<MotorCycle> motors, String[] header) {
        this.motors = motors;
        this.header = header;
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }

    @Override
    public int getRowCount() {
        return motors.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return motors.get(rowIndex).getProperty(columnIndex);
    }

}
