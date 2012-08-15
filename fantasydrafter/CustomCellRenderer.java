/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasydrafter;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author cbachich
 */
public class CustomCellRenderer extends DefaultTableCellRenderer {
  
  // Static colors used in the cell renderer
  private Color honeyDew  = new Color(240,255,240);
  private Color mintCream = new Color(245,255,250);
  private Color lavender  = new Color(230,230,250);
  private Color midnightBlue = new Color(25,25,112);
    
  @Override
  // Over writes the table cell renderer to perform custom cell rendering
  public Component getTableCellRendererComponent(JTable table, Object value,   
          boolean isSelected, boolean hasFocus, int row, int column) {   
    // Create a rendered label for easy manipulation
    JLabel renderedLabel = (JLabel) super.getTableCellRendererComponent(
      table, value, isSelected, hasFocus, row, column);
    
    // Set the horizontal alignment based on the column
    if(column == CustomModel.TEAM_NAME_COL) {
      renderedLabel.setHorizontalAlignment(SwingConstants.LEFT);
    } else {
      renderedLabel.setHorizontalAlignment(SwingConstants.CENTER);
    }
    
    // Determine the color for this cell
    Color cellColor;
    // Set the color to grey wherever the user currently is highlighting
    if(isSelected && hasFocus) {
      cellColor = Color.gray;
    }
    // Set the draft column to a special color
    else if (column == CustomModel.DRAFT_ORDER_COL){
      cellColor = lavender;
    } 
    // Set picked columns to yellow
    else if( (value != null) && value.toString().equals(CustomModel.PICKED)) {
      cellColor = Color.yellow;
    }
    // If this is an even row, set the color one way
    else if( (row%2) == 0) {
      cellColor = honeyDew;
    }
    // Otherwise set the color to the default
    else {
      cellColor = mintCream;
    }
    
    renderedLabel.setOpaque(true);
    renderedLabel.setBackground(cellColor);
    renderedLabel.setForeground(midnightBlue); 
    renderedLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
    
    return renderedLabel;  
  }
  
}
