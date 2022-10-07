public class DriverD <D extends Transport>{

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
        System.out.println("Водитель " + name + " управляет автобусом " + bus.getBrand() + " " + bus.getModel() + " и будет участвовать в заезде.");
    }

    public void finishMoving(D bus){
    }

    public void refuel(D bus){
    }
}
