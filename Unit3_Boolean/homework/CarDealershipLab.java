package Unit3_Boolean.homework;

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
    final double TAX_RATE = .122;
    final double LUXURY_PRICE_INCREASE = 0.2;
    final int PRICE_INCREASE_4WD = 3500;
    final double SPORTS_PRICE_INCREASE = .15;
    final double FUEL_EFFICIENCY_DEDUCTION = 0.2;

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

    // compareTo method
    public int compareTo(CarDealershipLab other){
        return this.price - other.price;
    }

    // equals method
    public boolean equals(CarDealershipLab other) {
        boolean oldONewStatus1 = this.mileage < 200;
        boolean oldONewStatus2 = other.mileage < 200;
        if(this.model.equals(other.model) && this.color.equals(other.color) && oldONewStatus2 == oldONewStatus1) {
            return true;
        } else {
            return false;
        }
    }

    //toString method
    public String toString() {
        String output = year + " " + model + " ( " + color + " )";
        output += "\n\t PRICE:\t\t$" + price;
        output += "\n\t MILES:\t\t" + mileage;
        output += "\n\t FUEL EFFICIENCY:\t" + fuelEfficiency + " mpg";
        output += "\n\t PACKAGES:\t\t";
        if (luxuryPackageStatus == true) {
            output += "\n\t -Luxury Package";
        }
        if (a4WDStatus == true) {
            output += "\n\t -4WD Package";
        }
        if (sportsPackageStatus == true) {
            output += "\n\t -Sports Package";
        }
        if (luxuryPackageStatus == false && a4WDStatus == false && sportsPackageStatus == false) {
            output += "\n\t -None";
        }
        return output;
    }

    //calcPrice method
    public double calcPrice(){
        if(luxuryPackageStatus == true){
            double extraCost = price * LUXURY_PRICE_INCREASE;
            price += extraCost;
        }
        if(a4WDStatus == true){
            price += PRICE_INCREASE_4WD;
        }
        if(sportsPackageStatus == true){
            double sportsAdd = price * SPORTS_PRICE_INCREASE;
            double fuelSubtract = price * FUEL_EFFICIENCY_DEDUCTION;
            price += sportsAdd - fuelSubtract;
        }
        double withTax = price + (price * TAX_RATE);
        return withTax;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLuxuryPackageStatus() {
        return luxuryPackageStatus;
    }

    public void setLuxuryPackageStatus(boolean luxuryPackageStatus) {
        this.luxuryPackageStatus = luxuryPackageStatus;
    }

    public boolean isA4WDStatus() {
        return a4WDStatus;
    }

    public void setA4WDStatus(boolean a4WDStatus) {
        this.a4WDStatus = a4WDStatus;
    }
}



