public class DriverD <D extends Bus>{

    private String name;
    private String driverLicense;
    private int experience;

    public DriverD(String name, String driverLicense, int experience) {
        this.name = name;
        this.driverLicense = driverLicense;

        if (experience < 0) {
            this.experience = Math.abs(experience);
        } else {
            this.experience = experience;
        }
    }

    public void startMoving(D bus){
    }

    public void finishMoving(D bus){
    }

    public void refuel(D bus){
    }
}
