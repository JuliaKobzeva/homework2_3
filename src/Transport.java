import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    Set<DriverB<?>> driversB = new HashSet<>();
    Set<DriverC<?>>driversC = new HashSet<>();
    Set<DriverD<?>>driversD = new HashSet<>();

    Set<Sponsor>sponsors = new HashSet<>();
    Set<Mechanic<?>>mechanics = new HashSet<>();

//    private int productionYear;
//    private String productionCountry;
//    private String color;
//    private int maxSpeed;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;

        if (engineVolume < 0) {
            this.engineVolume = Math.abs(engineVolume);
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void addDriverB(DriverB<?> driver){
        driversB.add(driver);
    }

    public void addDriverC(DriverC<?> driver){
        driversC.add(driver);
    }

    public void addDriverD(DriverD<?> driver){
        driversD.add(driver);
    }

    public void addMechanic(Mechanic<?> mechanic){
        mechanics.add(mechanic);
    }

    public void addSponsor(Sponsor sponsor){
        sponsors.add(sponsor);
    }



//    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
//        this.brand = brand;
//        this.model = model;

//        if(productionYear < 0){
//            this.productionYear = Math.abs(productionYear);
//        }else{
//            this.productionYear = productionYear;
//        }
//
//        this.productionCountry = productionCountry;
//
//        if(color == null || color.isBlank() || color.isEmpty()){
//            this.color = "неизвестно";
//        }else{
//            this.color = color;
//        }
//
//        if(maxSpeed < 0){
//            this.maxSpeed = Math.abs(maxSpeed);
//        }else{
//            this.maxSpeed = maxSpeed;
//        }
//    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if(engineVolume < 0){
            this.engineVolume = Math.abs(engineVolume);
        }else{
            this.engineVolume = engineVolume;
        }
    }

    public Set<DriverB<?>> getDriversB() {
        return driversB;
    }

    public  Set<DriverC<?>> getDriversC() {
        return driversC;
    }

    public  Set<DriverD<?>> getDriversD() {
        return driversD;
    }

    public  Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public  Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    //    public int getProductionYear() {
//        return productionYear;
//    }
//
//    public String getProductionCountry() {
//        return productionCountry;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        if(color == null || color.isBlank() || color.isEmpty()){
//            this.color = "белый";
//        }else{
//            this.color = color;
//        }
//    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        if(maxSpeed < 0){
//            this.maxSpeed = Math.abs(maxSpeed);
//        }else{
//            this.maxSpeed = maxSpeed;
//        }
//    }

    @Override
    public String toString() {
        return brand + " " + model + ", объем двигателя: " + engineVolume;
    }

    public abstract void startMoving();
    public abstract void finishMoving();

    public abstract void printType();
    public abstract boolean check();

//    public abstract void refill();
}
