package com.org.test.interfaces;

public  class Car implements Steerable, Steerable1 {


    String carName;
    int carNumber;

    public void turnLeft(int deg) {
        System.out.println("turn left");
    }

    @Override
    public void turnRight(int x) {
        Steerable.super.turnRight(x);
        Steerable1.super.turnRight(x);
    }


    @Override
    public void steerAround() {

    }

    @Override
    public boolean equals(Object otherObject) {
        // check objects are identical
        if (this == otherObject)
            return true;
        //check for null
        if (otherObject == null)
            return false;
        // check for the class of the object
        if (getClass() != otherObject.getClass())
            return false;
        // cast the object to the right type
        Car eobj = (Car) otherObject;
        //check the instance variables
        return carName.equals(eobj.carName)
                && carNumber == (eobj.carNumber);
    }
}

