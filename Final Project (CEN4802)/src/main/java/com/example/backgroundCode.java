package main.java.com.example;

public class backgroundCode {
	 public static void main(String[] args) {
	        try {
	            while (true) {
	                System.out.println("This code is running in the background...");
	                Thread.sleep(1000); // Sleep for 1 second to avoid consuming too much CPU
	            }
	        } catch (InterruptedException e) {
	            // Handle interruption if needed
	            e.printStackTrace();
	        }
	    }
	}

