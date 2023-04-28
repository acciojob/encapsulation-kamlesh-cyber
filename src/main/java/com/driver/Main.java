package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly obj = new RWOnly();
        //obj.name = "Kamlesh"; // private variable can't be accessed outside the class
         obj.setName("Kamlesh");
         String name = obj.getName();
        System.out.println(name);
    }
  
}