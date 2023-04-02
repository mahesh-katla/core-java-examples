package com.org.test.interfaces;

public class TestInterface {

    public static void main(String args[]){



      int x =1;
      int y = 1 ;

       if(x==y){
           System.out.println(" true ");
       }

       Car car = new Car();
       car.carName ="one";
       car.carNumber = 1;

       Car car1 = new Car();
       car1.carName ="Two";
       car1.carNumber = 1;

        System.out.println(car);
        System.out.println(car1);

       if(car.equals(car1)){
           System.out.println( " cars are equal");
       }

      Steerable steerable = new Car();
       car.turnRight(10);
    }

    private static void extracted(Car car) {
        if(car instanceof Steerable){
            System.out.println("inside steerable");
        }
    }
}
