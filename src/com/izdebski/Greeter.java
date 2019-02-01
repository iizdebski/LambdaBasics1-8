package com.izdebski;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        LeclercMBT leclercMBT = new LeclercMBT();
        greeter.greet(leclercMBT);
    }
}