public class DriverB <B extends Transport> {

    private String name;
    private String driverLicense;
    private int experience;


    public DriverB(String name, String driverLicense, int experience) {
        this.name = name;
        setDriverLicense(driverLicense);

        if (experience < 0) {
            this.experience = Math.abs(experience);
        } else {
            this.experience = experience;
        }
    }


    public void startMoving(B car){
        System.out.println("Водитель " + name + " управляет автомобилем " + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде.");
    }

    public void finishMoving(B car){
    }

    public void refuel(B car){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        if(driverLicense == null){
            throw new IllegalArgumentException("Необходимо указать тип прав");
        }
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
