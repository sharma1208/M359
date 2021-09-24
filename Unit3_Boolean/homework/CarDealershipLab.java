package Unit3_Boolean.homework;

import Unit2_UsingObjects.cars.Car;

public class CarDealershipLab {
    //Vehicle instance variables, details
    private int year;
    private int mileage;
    private double fuelEfficiency;
    private int price;
    private String model;
    private String color;
    private boolean luxuryPackageStatus;
    private boolean a4WDStatus;
    private boolean sportsPackageStatus;

    //Constants
    final String VEHICLE_MAKE = "Chevrolet";
    final double TAX_RATE = 12.2;
    final int LUXURY_PRICE_INCREASE = 20;
    final int PRICE_INCREASE_4WD = 3500;
    final int SPORTS_PRICE_INCREASE = 15;
    final int FUEL_EFFICIENCY_DEDUCTION = -20;

    //Default Constructor
    public CarDealershipLab() {
        year = 2021;
        mileage = 0;
        fuelEfficiency = 35;
        price = 16000;
        model = "Trax";
        color = "White";
        luxuryPackageStatus = false;
        a4WDStatus = false;
        sportsPackageStatus = false;
    }

    //Full Constructor
    public CarDealershipLab(int year, int mileage, double fuelEfficiency, int price, String model, String color, boolean luxuryPackageStatus, boolean a4WDStatus, boolean sportsPackageStatus) {
        this.year = year;
        this.mileage = mileage;
        this.fuelEfficiency = fuelEfficiency;
        this.price = price;
        this.model = model;
        this.color = color;
        this.luxuryPackageStatus = luxuryPackageStatus;
        this.a4WDStatus = a4WDStatus;
        this.sportsPackageStatus = sportsPackageStatus;
    }
}

    // compareTo method
    public int compareTo(CarDealershipLab other){
        return this.price - other.price;
    }

    // equals method
    public boolean equals(CarDealershipLab other){
        boolean oldONewStatus1 = this.mileage < 200;
        boolean oldONewStatus2 = other.mileage < 200;
        if(this.model.equals(other.model) && this.color.equals(other.color) && oldONewStatus2 == oldONewStatus1){
            return true;
        }else{
            return false;
        }


      //toString method
        public void toString(){
            String







        }



    }