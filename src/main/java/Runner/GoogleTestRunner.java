package Runner;

import ThreadClass.GoogleFeatureThread;

public class GoogleTestRunner {
    public static void main(String[] args) {
        //Example of TopCasting
        //Object of Child Class is being referred by reference variable of parent class
        Thread t1 = new GoogleFeatureThread("Chrome Thread", "chrome");
        Thread t2 = new GoogleFeatureThread("Firefox Thread", "firefox");

        System.out.println("Threads started.......................");
        //t1.start();
        t2.start();
        System.out.println("Threads Closed.......................");
    }
}
