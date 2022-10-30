public abstract class Driver <T extends Transport & Competing>{
    private String name;
    final private Character typeOfLicense;
    private int experience;
    private T car;

    public Driver(String name, Character typeOfLicense, int experience, T car) {
        this.name = name;

        if(typeOfLicense.equals("B") && typeOfLicense.equals("C") && typeOfLicense.equals("D")){
            throw new NullPointerException("Нет прав, иди в автошколу");
        }else{
            this.typeOfLicense = typeOfLicense;
        }

        if (experience < 0) {
            this.experience = Math.abs(experience);
        } else {
            this.experience = experience;
        }

        if(car != null){
            this.car = car;
        }
    }

    public void startMoving(){
        System.out.println(name + " заводит " + car.getBrand() + " " + car.getModel());
    }

    public void finishMoving(){
        System.out.println(name + " останавливает " + car.getBrand() + " " + car.getModel());
    }

    public void refuel(){
        System.out.println(name + " заправляет " + car.getBrand() + " " + car.getModel());
    }

    public String getName() {
        return name;
    }
}
