package testPackege;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.reflect.Array;


public class testTest {
    public static int i = 10;
    private static String str = "Hello";
    protected static double d = 30.235;
    static char c = 'g';

    public static void main(String[] args) {

        Testing_pri();
        Testing_prot();
        Testing_Nomod();
    }

    public void Testing_pub() {
        System.out.println("Testing_pub() Executed");
        System.out.println("Value Of i Is " + i);
        System.out.println("Value Of str Is " + str);
        System.out.println("Value Of d Is " + d);
        System.out.println("Value Of c Is " + c);
    }

    private static void Testing_pri() {
        System.out.println("Testing_pri() Executed");

    }

    protected static void Testing_prot() {
        System.out.println("Testing_prot() Executed");
    }

    static void Testing_Nomod() {
        System.out.println("Testing_Nomod() Executed");
    }

}




