package com.basic;

public class Variable {
    // instance variable
    public final String myVar="instance variable";

    public void myMethod(){
        // local variable
        String myVar = "Inside Method";
        System.out.println(myVar);
    }
    public static void main(String[] args){
        // Creating object
        Variable obj = new Variable();

        /* We are calling the method, that changes the
         * value of myVar. We are displaying myVar again after
         * the method call, to demonstrate that the local
         * variable scope is limited to the method itself.
         */
        System.out.println("Calling Method");
        obj.myMethod();
        System.out.println(obj.myVar);
    }
}