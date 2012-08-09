/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasydrafter;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author cbachich
 */
public class CustomModel extends AbstractTableModel {
  
  /******************
   * Static Values  *
   * ****************/
  public static int ROWS            = 12;
  public static int COLUMNS         = 7;
  public static int TEAM_NAME_COL   = 0;
  public static int FIRST_PICK_COL  = 1;
  public static int LAST_PICK_COL   = 5;
  public static int DRAFT_ORDER_COL = 6;
  
  /******************
   * Table Contents *
   * ****************/
  private String[] columnNames = new String[] {
    "Team", "Pick 1", "Pick 2", "Pick 3", "Pick4", "Pick 5", "Draft Order"
  };

  private Object[][] data = new Object[][] {
    {"8-Bit Warriors",  new Integer(1),  new Integer(2),  new Integer(3),  new Integer(4),  new Integer(5), null},
    {null, null, null, null, null, null, null},
    {"Victorious Secret",  new Integer(2),  new Integer(5), null,  new Integer(5),  new Integer(3), null},
    {null, null, null, null, null, null, null},
    {null,  new Integer(2),  new Integer(5),  new Integer(6),  new Integer(7),  new Integer(8), null},
    {"Smack Talkers",  new Integer(8),  new Integer(0),  new Integer(5),  new Integer(12),  new Integer(8), null},
    {null, null, null, null, null, null, null},
    {"Someone",  new Integer(2),  new Integer(3),  new Integer(100),  new Integer(8),  new Integer(9), null},
    {null, null, null, null, null, null, null},
    {null, null, null, null, null, null, null},
    {null, null, null, null, null, null, null},
    {null, null, null, null, null, null, null}
  };

  Class[] types = new Class [] {
    String.class,  Integer.class, Integer.class, Integer.class, 
    Integer.class, Integer.class, Integer.class
  };
   
  /******************
   * Global Values  *
   * ****************/
  private boolean locked = false;

  /******************
   * Procedures     *
   * ****************/
  @Override
  public int getColumnCount() {
      return columnNames.length;
  }

  @Override
  public int getRowCount() {
      return data.length;
  }

  @Override
  public String getColumnName(int col) {
      return columnNames[col];
  }

  @Override
  public Object getValueAt(int row, int col) {
      return data[row][col];
  }

  @Override
  public Class getColumnClass(int c) {
      return types[c];
  }

  /*
   * Don't need to implement this method unless your table's
   * editable.
   */
  public boolean isCellEditable(int row, int col) {
      //Note that the data/cell address is constant,
      //no matter where the cell appears onscreen.
      if ((col == DRAFT_ORDER_COL) || locked) {
          return false;
      } else {
          return true;
      }
  }
  
  /*
   * Don't need to implement this method unless your table's
   * data can change.
   */
  public void setValueAt(Object value, int row, int col) {
      data[row][col] = value;
      fireTableCellUpdated(row, col);
  }
  
  // Lock the cells from editing
  public void lockCells() {
    locked = true;
  }
  
  // Unlock the cells for editing
  public void unlockCells() {
    locked = false;
  }
}
