/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasydrafter;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author cbachich
 */
public class CustomTable extends JTable {
  
  private static int TEAM_NAME_COL_SIZE   = 130;
  private static int PICK_COL_SIZE        = 45;
  private static int DRAFT_ORDER_COL_SIZE = 75;
  
  public CustomTable() {
    setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
  }
  
  // Set the default column sizes
  public void resizeColumns() {
    TableColumnModel columns = this.getColumnModel();
    
    // Start by setting the team name column
    TableColumn teamColumn = columns.getColumn(CustomModel.TEAM_NAME_COL);
    teamColumn.setPreferredWidth(TEAM_NAME_COL_SIZE);

    // Next set up each of the pick column sizes
    for(int col = CustomModel.FIRST_PICK_COL; 
            col <= CustomModel.LAST_PICK_COL; 
            col++) {
      TableColumn pickColumn = columns.getColumn(col);
      pickColumn.setPreferredWidth(PICK_COL_SIZE);
    }
    
    // Finally, set the size of the draft order column
    TableColumn draftOrderColumn = 
            columns.getColumn(CustomModel.DRAFT_ORDER_COL);
    draftOrderColumn.setPreferredWidth(DRAFT_ORDER_COL_SIZE);
  }
  
}
