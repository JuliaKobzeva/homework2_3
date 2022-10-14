public class DriverC <C extends Transport>{

    private String name;
    private String driverLicense;
    private int experience;

    public DriverC(String name, String driverLicense, int experience) {
        this.name = name;
        this.driverLicense = driverLicense;

        if (experience < 0) {
            this.experience = Math.abs(experience);
        } else {
            this.experience = experience;
        }
    }

    public void startMoving(C truck){
        System.out.println("Водитель " + name + " управляет грузовиком " + truck.getBrand() + " " + truck.getModel() + " и будет участвовать в заезде.");
    }

    public void finishMoving(C truck){
    }

    public void refuel(C truck){
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
