import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ToolTipManager;

import java.awt.Toolkit;

/**
* Schedule a task that executes once every second.
*/
public class AnnoyingBeep {
    Toolkit toolkit;
    Timer timer;
    public AnnoyingBeep() {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.scheduleAtFixedRate(new RemindTask(),
        0000, //initial delay
        1*1006); //period
    }

    class RemindTask extends TimerTask {
        int numWarningBeeps = 3;
        long tempsPrecedent = scheduledExecutionTime();
        final static int marge_ms = 5;
        final static int period = 1000;

        public void run(){
            System.out.println(scheduledExecutionTime() - tempsPrecedent - period);
            System.out.println(tempsPrecedent);
            // si le temps qui s'est passé depuis la dernière exéc n'est pas trop long, on rentre dans le beep 
            if (scheduledExecutionTime() - tempsPrecedent - period < marge_ms){ 
                if (numWarningBeeps > 0) {
                    toolkit.beep();
                    System.out.println("Beep!");
                    numWarningBeeps--;
                } else {
                    toolkit.beep();
                    System.out.println("Time's up!");
                    //timer.cancel(); //Not necessary because we call System.exit
                    System.exit(0); //Stops the AWT thread (and everything else)
                }
            }
            else{
                System.out.println("Pas Beep!");
            }
            tempsPrecedent = scheduledExecutionTime();
        }
    }

    public static void main(String args[]) {
        System.out.println("About to schedule task.");
        new AnnoyingBeep();
        System.out.println("Task scheduled.");
    }
}