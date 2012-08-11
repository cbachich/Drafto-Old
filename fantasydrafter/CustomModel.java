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
    {"Victorious Secret",  new Integer(2),  new Integer(5), new Integer(4),  new Integer(5),  new Integer(3), null},
    {null, null, null, null, null, null, null},
    {null,  new Integer(2),  new Integer(5),  new Integer(6),  new Integer(7),  new Integer(8), null},
    {"Smack Talkers",  new Integer(8),  new Integer(1),  new Integer(5),  new Integer(1),  new Integer(8), null},
    {null, null, null, null, null, null, null},
    {"Someone",  new Integer(2),  new Integer(3),  new Integer(1),  new Integer(8),  new Integer(9), null},
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
  private boolean locked;
  private Console console;
  
  public CustomModel(Console console) {
    this.locked = false;
    this.console = console;
  }
  
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
  @Override
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
  @Override
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
  
  // Check the table contains good values
  public boolean isTableGood() {
    boolean passed = true;
    
    // Step through each row for error checking
    for (int row = 0; row < ROWS; row++) {
      // Start by checking if the team name is empty. If it is, then don't check
      // the draft numbers
      String name = getTeamName(row);
      
      // If there is no team name then we'll move onto the next row
      if (name.isEmpty()) {
        continue;
      } 
      
      // Check that each of the pick number is between the set values
      int count = 1;
      for(int pickCol = FIRST_PICK_COL; pickCol < LAST_PICK_COL; pickCol++) {
        if(!isPickGood(row,pickCol)) {
          console.write("Pick #" + count + " for Team " + name + 
                  " is not valid");
          passed = false;
        }
        count++;
      }
    }
    
    return passed;
  }
  
  // Return the team name in the passed in row
  private String getTeamName(int row) {
    try {
      return getValueAt(row, TEAM_NAME_COL).
              toString().trim();
    } catch(Exception ex) {
      return "";
    }
  }
  
    // Checks if the pick cell is good
  private boolean isPickGood(int row, int col) {
    try {
      int pick = (Integer)getValueAt(row, col);
      if( (pick >= DraftoMachine.MIN) && (pick <= DraftoMachine.MAX)) {
        return true;
      }
      else {
        return false;
      }
    } catch(Exception ex) {
      return false;
    }
  }
   
  // Return the pick value in the row and col
  private int getPickValue(int row, int col) {
    return (Integer)getValueAt(row, col);
  }
}
