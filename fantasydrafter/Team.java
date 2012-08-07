/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasydrafter;

import java.util.ArrayList;

/**
 *
 * @author cbachich
 */
public class Team {
  
  // Internal Values
  private String name;
  private ArrayList picks;
  private int tableRow;
  
  public Team() {
    picks = new ArrayList();
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setRow(int row) {
    tableRow = row;
  }
  
  public void addPick(int pick) {
    picks.add(pick); 
  }
  
  public String getName() {
    return name;
  }
  
  public int getPick(int number) {
    return (Integer)picks.get(number);
  }
  
}
