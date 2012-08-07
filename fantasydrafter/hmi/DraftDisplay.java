/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasydrafter.hmi;

import fantasydrafter.Team;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author cbachich
 */
public class DraftDisplay extends javax.swing.JFrame {

  // Static Values
  private static String START  = "Start";
  private static String END    = "End";
  private static String RESUME = "Resume";
  private static String PAUSE  = "Pause";
  
  // Error Text
  private static String BAD_TABLE = 
          "There is bad data in the table. Please correct!";
  
  // Numeric Settings
  private static int ROWS = 12;
  private static int COLUMNS = 7;
  private static int TOTAL_PICKS = 5;
  private static int MIN_PICK_RANGE = 1;
  private static int MAX_PICK_RANGE = 10;
  
  // Indexes
  private static int TEAM_NAME_COL = 0;
  private static int FIRST_PICK_COL = 1;
  private static int LAST_PICK_COL = FIRST_PICK_COL + TOTAL_PICKS;
  
  // Console Text
  StringBuffer consoleText;
  
  /**
   * Creates new form DraftDisplay
   */
  public DraftDisplay() {
    initComponents();
    consoleText = new StringBuffer();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    ButtonPanel = new javax.swing.JPanel();
    StartButton = new javax.swing.JButton();
    ResumeButton = new javax.swing.JButton();
    PauseButton = new javax.swing.JButton();
    EndButton = new javax.swing.JButton();
    PickPanel = new javax.swing.JPanel();
    PickScrollPane = new javax.swing.JScrollPane();
    PickTable = new javax.swing.JTable();
    ConsolePanel = new javax.swing.JScrollPane();
    ConsoleTextArea = new javax.swing.JTextArea();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    StartButton.setText("Start");
    StartButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        DraftDisplay.this.actionPerformed(evt);
      }
    });

    ResumeButton.setText("Resume");
    ResumeButton.setEnabled(false);
    ResumeButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        DraftDisplay.this.actionPerformed(evt);
      }
    });

    PauseButton.setText("Pause");
    PauseButton.setEnabled(false);
    PauseButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        DraftDisplay.this.actionPerformed(evt);
      }
    });

    EndButton.setText("End");
    EndButton.setEnabled(false);
    EndButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        DraftDisplay.this.actionPerformed(evt);
      }
    });

    javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
    ButtonPanel.setLayout(ButtonPanelLayout);
    ButtonPanelLayout.setHorizontalGroup(
      ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(ButtonPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(StartButton)
        .addGap(18, 18, 18)
        .addComponent(PauseButton)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(ResumeButton)
        .addGap(18, 18, 18)
        .addComponent(EndButton)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    ButtonPanelLayout.setVerticalGroup(
      ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(ButtonPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(ResumeButton)
          .addComponent(PauseButton)
          .addComponent(StartButton)
          .addComponent(EndButton))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    PickTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
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
      },
      new String [] {
        "Team", "Pick 1", "Pick 2", "Pick 3", "Pick4", "Pick 5", "Draft Order"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }
    });
    PickScrollPane.setViewportView(PickTable);
    PickTable.getColumnModel().getColumn(0).setPreferredWidth(150);
    PickTable.getColumnModel().getColumn(1).setPreferredWidth(50);
    PickTable.getColumnModel().getColumn(2).setPreferredWidth(50);
    PickTable.getColumnModel().getColumn(3).setPreferredWidth(50);
    PickTable.getColumnModel().getColumn(4).setPreferredWidth(50);
    PickTable.getColumnModel().getColumn(5).setPreferredWidth(50);
    PickTable.getColumnModel().getColumn(6).setPreferredWidth(100);

    javax.swing.GroupLayout PickPanelLayout = new javax.swing.GroupLayout(PickPanel);
    PickPanel.setLayout(PickPanelLayout);
    PickPanelLayout.setHorizontalGroup(
      PickPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
      .addGroup(PickPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(PickPanelLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(PickScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
          .addContainerGap()))
    );
    PickPanelLayout.setVerticalGroup(
      PickPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 267, Short.MAX_VALUE)
      .addGroup(PickPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PickPanelLayout.createSequentialGroup()
          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(PickScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap()))
    );

    ConsoleTextArea.setColumns(20);
    ConsoleTextArea.setRows(5);
    ConsolePanel.setViewportView(ConsoleTextArea);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(ConsolePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
          .addComponent(ButtonPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(PickPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(PickPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(ConsolePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionPerformed

    // Get the command string
    String command = evt.getActionCommand();
    // Perform an action based on the button selected
    writeToConsole("Command: " + command);
    
    switch(command) {
      case "Start": 
        StartDrafter();
        break;
      case "Resume":
        ResumeDrafter();
        break;
      case "Pause":
        PauseDrafter();
        break;
      case "End":
        EndDrafter();
        break;
    }
  }//GEN-LAST:event_actionPerformed

  // Start the drafter
  private void StartDrafter() {
    // Check that the table contains good values. If not, inform the user and do
    // not continue
    try {
      ArrayList teams = getTableData();
    } catch (Exception ex) {
      writeToConsole(BAD_TABLE);
      return;
    }
    
    // Toggle the buttons
    ToggleButtons(START);
    
    // Lock the fields
    lockFields(true);
  }
  
  // Pause the drafter
  private void PauseDrafter() {
    // Toggle the buttons
    ToggleButtons(PAUSE);
    
  }
  
  // Resume the drafter
  private void ResumeDrafter() {
    // Toggle the buttons
    ToggleButtons(RESUME);
    
  }
  
  // Ends the drafter
  private void EndDrafter() {
    // Toggle the buttons
    ToggleButtons(END);
    
    // Unlock the fields
    lockFields(false);
  }
  
  // Toggle the buttons
  private void ToggleButtons(String cmd) {
    if (cmd.matches(START) || cmd.matches(RESUME)) {
      StartButton.setEnabled(false);
      ResumeButton.setEnabled(false);
      PauseButton.setEnabled(true);
      EndButton.setEnabled(false);
    } else if (cmd.matches(PAUSE)) {
      StartButton.setEnabled(false);
      ResumeButton.setEnabled(true);
      PauseButton.setEnabled(false);
      EndButton.setEnabled(true);
    } else if (cmd.matches(END)) {
      StartButton.setEnabled(true);
      ResumeButton.setEnabled(false);
      PauseButton.setEnabled(false);
      EndButton.setEnabled(false);     
    }
  }
  
  // Check the table contains good values
  private ArrayList<Team> getTableData() throws Exception {
    ArrayList<Team> teams = new ArrayList();
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
      
      // Create a team object since we've got this far
      Team team = new Team();
      team.setName(name);
      
      // Check that each of the pick number is between the set values
      int count = 1;
      for(int pickCol = FIRST_PICK_COL; pickCol < LAST_PICK_COL; pickCol++) {
        if(isPickGood(row,pickCol)) {
          team.addPick(getPickValue(row,pickCol));
        } else {
          writeToConsole("Pick #" + count + " for Team " + name + 
                  " is not valid");
          passed = false;
        }
        count++;
      }
      
      // If all of the pick values were good, then the only piece remaining is
      // the row position. This is used to keep track of where the results will
      // need to be stored.
      team.setRow(row);
      
      teams.add(team);
    }
    
    if (!passed) {
      throw new Exception();
    }
    
    return teams;
  }
  
  // Return the team name in the passed in row
  private String getTeamName(int row) {
    try {
      return PickTable.getModel().
              getValueAt(row, TEAM_NAME_COL).toString().trim();
    } catch(Exception ex) {
      return "";
    }
  }
  
  // Checks if the pick cell is good
  private boolean isPickGood(int row, int col) {
    try {
      int pick = (Integer)PickTable.getModel().getValueAt(row, col);
      if( (pick >= MIN_PICK_RANGE) && (pick <= MAX_PICK_RANGE)) {
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
    return (Integer)PickTable.getModel().getValueAt(row, col);
  }
  
  // Locks the fields so the can not be edited
  private void lockFields(boolean lock) {
    // TODO
  }

  private void writeToConsole(String add) {
    consoleText.append(add).append("\n");
    ConsoleTextArea.setText(consoleText.toString());
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DraftDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DraftDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DraftDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DraftDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new DraftDisplay().setVisible(true);
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel ButtonPanel;
  private javax.swing.JScrollPane ConsolePanel;
  private javax.swing.JTextArea ConsoleTextArea;
  private javax.swing.JButton EndButton;
  private javax.swing.JButton PauseButton;
  private javax.swing.JPanel PickPanel;
  private javax.swing.JScrollPane PickScrollPane;
  private javax.swing.JTable PickTable;
  private javax.swing.JButton ResumeButton;
  private javax.swing.JButton StartButton;
  // End of variables declaration//GEN-END:variables
}