package main.java.com.example;

import org.junit.Test;

public class FinalTest {

    @Test(timeout = 5000)
    public void testBackgroundCode() {
        backgroundCode backgroundCode = new backgroundCode();

        // Run the code in a separate thread
        Thread thread = new Thread(() -> {
            backgroundCode.main(null);
        });

        // Start the thread
        thread.start();

        // Let the thread run for a while (e.g., 5 seconds)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt the thread to stop the infinite loop
        thread.interrupt();
    }
}
