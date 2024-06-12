package WordWithTimer;

import java.util.Timer;
import java.util.TimerTask;

public class SystemTimer {
     void main() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            private long startTime = System.currentTimeMillis();

            @Override
            public void run() {
                long TimerRun = System.currentTimeMillis() - startTime;
                long hours = (TimerRun / (1000 * 60 * 60)) % 24;
                long minutes = (TimerRun / (1000 * 60)) % 60;
                long seconds = (TimerRun / 1000) % 60;
                System.out.printf("\rMBH System Timer: %02d:%02d:%02d", hours, minutes, seconds);
                System.out.flush();
            }
        };

        // Schedule the task to run every second
        timer.scheduleAtFixedRate(task, 0, 1000);

        // Keep the program running indefinitely
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}