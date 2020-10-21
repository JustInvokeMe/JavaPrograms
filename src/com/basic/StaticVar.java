package com.basic;

public class StaticVar {
    public String myClassVar="class or static variable";

    public static void main(String[] args){
        StaticVar obj = new StaticVar();
        StaticVar obj2 = new StaticVar();
        StaticVar obj3 = new StaticVar();

        //All three will display "class or static variable"
        System.out.println(obj.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);

        //changing the value of static variable using obj2
        obj2.myClassVar = "Changed Text";

        //All three will display "Changed Text"
        System.out.println(obj.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);
    }
}