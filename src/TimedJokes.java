import java.util.Timer;
import java.util.TimerTask;

public class TimedJokes {
    public static void main(String[] args) {

    //First joke starts here
        System.out.println("Why did the two Java methods get a divorce?...");
        //This displays first part of the joke
    Timer timer = new Timer();
    //creates the timer
    TimerTask task = new TimerTask() {
    //creates the task
        @Override
        public void run() {
            System.out.println("Because they had constant arguments");
            //This displays the punchline

        }
    };

    timer.schedule(task, 6000);
    // This sets what we want the timer to do and the delay

    }
}


