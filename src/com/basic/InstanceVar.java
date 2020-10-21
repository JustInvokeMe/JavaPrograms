package com.basic;

public class InstanceVar {
    String myInstanceVar="instance variable";

    public static void main(String[] args){
        InstanceVar obj = new InstanceVar();
        InstanceVar obj2 = new InstanceVar();
        InstanceVar obj3 = new InstanceVar();

        System.out.println(obj.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);


        obj2.myInstanceVar = "Changed Text";


        System.out.println(obj.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);
    }
}