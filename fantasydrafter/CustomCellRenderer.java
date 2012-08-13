/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasydrafter;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author cbachich
 */
public class CustomCellRenderer extends DefaultTableCellRenderer {
  
  public CustomCellRenderer() {  
    super();  
    setOpaque(true);
  }
  
  
  @Override
  public Component getTableCellRendererComponent(JTable table, Object value,   
          boolean isSelected, boolean hasFocus, int row, int column) {     
    if(isSelected && hasFocus) {
      setBackground(Color.gray);
    } else if(hasFocus) {
      setBackground(Color.white);
    } else if (column == CustomModel.DRAFT_ORDER_COL){
      setBackground(Color.cyan);
    } else if((value == null) || value.toString().equals("")) {         
      setBackground(Color.lightGray);    
    } else {
      setBackground(Color.white);
    }
      
    setText(value !=null ? value.toString() : "");  
    return this;  
  }
  
}
