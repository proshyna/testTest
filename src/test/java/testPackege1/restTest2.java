package testPackege1;

import testPackege.testTest;

public class restTest2 {

    public static void main(String[] args){

        testTest.Testing_pub(); //Can access public methods outside the class or package.

        //testTest.Testing_pri(); //- Can not access private methods outside the class
       // testTest.Testing_prot();  //Can access protected methods inside same package class.
       // testTest.Testing_Nomod(); //Can access no modifier methods inside same package class.
    }
}
