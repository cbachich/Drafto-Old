/*
 * Drafto runs as a seperate Thread that makes picks until all the draft spots
 * have been assigned or been told to stop.
 */
package fantasydrafter;

import fantasydrafter.hmi.PickPanel;
import java.util.Random;

/**
 *
 * @author cbachich
 */
public class DraftoMachine implements Runnable {
  
  // Range for pick values
  public static int MIN = 1;
  public static int MAX = 10;
  
  // Timer values
  private static int WAIT = 1;
  
  // The random generator
  private Random drafto;
  
  // Keep track of if drafto is running
  private boolean running;
  
  // For displaying the picks
  private PickPanel pickPanel;
  
  // Access to the model
  private CustomModel pickModel;
  
  // Initialize the 
  public DraftoMachine(PickPanel pickPanel, CustomModel pickModel) {
    drafto = new Random();
    running = true;
    this.pickPanel = pickPanel;
    this.pickModel = pickModel;
  }

  @Override
  // Makes a pick in intervals of whatever WAIT is set to while running
  public void run() {
    while(true) {
      // If drafto is running, get the next pick
      if(running) {
        int pick = getPick();

        pickPanel.activatePick(pick);
        
        pickModel.makePicks(pick);
        
        if(!pickModel.areTeamsActive()) {
          running = false;
        }
      }
    
      // Wait the designated amount of time
      try {
        Thread.sleep(1000 * WAIT);
      } catch (InterruptedException ex) { }
    }
  }
  
  // Pause drawing picks
  public void pause() {
    running = false;
  }
  
  // Resume drawing picks
  public void resume() {
    running = true;
  }
  
  // Return a random number between [Minimum,Maximum]
  private int getPick() {
    return drafto.nextInt(MAX - MIN + 1) + MIN;
  }
}
