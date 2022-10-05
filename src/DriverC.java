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
}
