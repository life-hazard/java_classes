package com.company.dzial.projekt;

/*
 *   There is a conflict, because there is main function at the end and main function in Main file.
 */

class Vehicle {

    private int productionYear;
    private String engineType;
    private String color;
    private double mass;

    public Vehicle(int productionYear, String engineType, String color, double mass) {
        this.productionYear = productionYear;
        this.engineType = engineType;
        this.color = color;
        this.mass = mass;
    }

    public Vehicle() {
        this.productionYear = 1998;
        this.engineType = "hybrid";
        this.color = "red";
        this.mass = 4510.12;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void startEngine() {
        System.out.println("Engine has started.");
    }
}

class Wheeled extends Vehicle {

    private String tireSize;

    public Wheeled(int production_year, String engineType, String color, double mass, String tireSize) {
        super(production_year, engineType, color, mass);
        this.tireSize = tireSize;
    }

    public Wheeled() {

    }

    public String getTireSize() {
        return tireSize;
    }

    public void setTireSize(String tireSize) {
        this.tireSize = tireSize;
    }

    public void startEngine(String engineType) {
        System.out.println("Started the " + engineType + " engine.");
    }
}


class Rail extends Vehicle {

    public Rail(int production_year, String engineType, String color, double mass) {
        super(production_year, engineType, color, mass);
    }

    public Rail() {
    }

    @Override
    public void startEngine() {
        System.out.println("Rail engine hes started.");
    }
}


class Tracked extends Vehicle {

    private int power;

    public Tracked(int production_year, String engineType, String color, double mass, int power) {
        super(production_year, engineType, color, mass);
        this.power = power;
    }

    public Tracked() {
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public final void startEngine() {
        super.startEngine();
        System.out.println("This is a tracked vehicle.");
    }
}


class Truck extends Wheeled {

    private double capacity;

    public Truck(int production_year, String engineType, String color, double mass, String tireSize, double capacity) {
        super(production_year, engineType, color, mass, tireSize);
        this.capacity = capacity;
    }

    public Truck() {
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void liftBox() {

    }
}


class Car extends Wheeled {

    int numberOfPeople;

    public Car(int production_year, String engineType, String color, double mass, String tireSize, int numberOfPeople) {
        super(production_year, engineType, color, mass, tireSize);
        this.numberOfPeople = numberOfPeople;
    }

    public Car() {
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
}

class Train extends Rail {

    public static String owner = "P.K.P.";

    public Train(int production_year, String engineType, String color, double mass) {
        super(production_year, engineType, color, mass);
    }

    public Train() {
    }
}

class Tank extends Tracked {

    public Tank(int production_year, String engineType, String color, double mass, int power) {
        super(production_year, engineType, color, mass, power);
    }

    public Tank() {
    }

}

class Bulldozer extends Tracked {

    public Bulldozer(int production_year, String engineType, String color, double mass, int power) {
        super(production_year, engineType, color, mass, power);
    }

    public Bulldozer() {
    }
}


class Sedan extends Car {

    public String model;
    public String symbol;

    public Sedan(int production_year, String engineType, String color, double mass, String tireSize, int numberOfPeople) {
        super(production_year, engineType, color, mass, tireSize, numberOfPeople);
    }

    public Sedan() {
    }
}

class Pickup extends Car {

    public Pickup(int production_year, String engineType, String color, double mass, String tireSize, int numberOfPeople) {
        super(production_year, engineType, color, mass, tireSize, numberOfPeople);
    }

    public Pickup() {
    }
}

class Skoda extends Sedan {

    public Skoda(int production_year, String engineType, String color, double mass, String tireSize, int numberOfPeople) {
        super(production_year, engineType, color, mass, tireSize, numberOfPeople);
    }

    public Skoda() {
    }
}

class Volkswagen extends Sedan {

    public Volkswagen(int production_year, String engineType, String color, double mass, String tireSize, int numberOfPeople) {
        super(production_year, engineType, color, mass, tireSize, numberOfPeople);
    }

    public Volkswagen() {
    }
}

class SuperB extends Skoda {

    public SuperB(int production_year, String engineType, String color, double mass, String tireSize, int numberOfPeople) {
        super(production_year, engineType, color, mass, tireSize, numberOfPeople);
    }

    public SuperB() {
    }
}

final class Octavia extends Skoda {

    public Octavia(int production_year, String engineType, String color, double mass, String tireSize, int numberOfPeople) {
        super(production_year, engineType, color, mass, tireSize, numberOfPeople);
    }

    public Octavia() {
    }
}

class Golf extends Volkswagen {

    public Golf(int production_year, String engineType, String color, double mass, String tireSize, int numberOfPeople) {
        super(production_year, engineType, color, mass, tireSize, numberOfPeople);
    }

    public Golf() {
    }
}

public class Main {

    public static void main(String[] args) {

        Car firstCar = new Car(2019, "electric", "white", 1200,
                "195/70 R15", 4);
        Car secondCar = new Car(2012, "petrol", "red", 1500,
                "185/70 R16", 5);
        Car thirdCar = new Car(2012, "petrol", "red", 1500,
                "185/70 R16", 5);

    }
}
