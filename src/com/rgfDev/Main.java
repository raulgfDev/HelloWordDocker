package com.rgfDev;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World Docker");

        int count = 0;

        while( true ) {

            try {
                Thread.sleep( 5 * 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Counter " + count++ );
        }
    }
}
