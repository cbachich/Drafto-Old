/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasydrafter;

import javax.swing.JTextArea;

/**
 *
 * @author cbachich
 */
public class Console {
  
  private JTextArea textArea;
  private StringBuffer text;
  
  public Console(JTextArea textArea) {
    this.textArea = textArea;
    text = new StringBuffer();
  }
  
  public void write(String newText) {
    text.append(newText).append("\n");
    textArea.setText(text.toString());
  }
  
}
