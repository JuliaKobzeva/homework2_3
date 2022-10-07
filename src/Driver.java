public abstract class Driver {
    private String name;
    private String driverLicense;
    private int experience;

    public Driver(String name, String driverLicense, int experience) {
        this.name = name;
        this.driverLicense = driverLicense;

        if (experience < 0) {
            this.experience = Math.abs(experience);
        } else {
            this.experience = experience;
        }
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    public abstract void refuel();
}
