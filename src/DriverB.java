public class DriverB <B extends Car> {

    private String name;
    private String driverLicense;
    private int experience;

    public DriverB(String name, String driverLicense, int experience) {
        this.name = name;
        this.driverLicense = driverLicense;

        if (experience < 0) {
            this.experience = Math.abs(experience);
        } else {
            this.experience = experience;
        }
    }

    public void startMoving(B car){
    }

    public void finishMoving(B car){
    }

    public void refuel(B car){
    }
}
