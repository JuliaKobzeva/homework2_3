public abstract class Mammal extends Animal{
    private String environment;
    private int speed;

    public Mammal(String name, int age, String environment, int speed) {
        super(name, age);
        if(environment == null || environment.isEmpty() || environment.isBlank()){
            this.environment = "default";
        } else {
            this.environment = environment;
        }

        if(speed < 0){
            this.speed = Math.abs(speed);
        } else {
            this.speed = speed;
        }
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        if(environment == null || environment.isEmpty() || environment.isBlank()){
            this.environment = "default";
        } else {
            this.environment = environment;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void eat(){
    }
    public void sleep(){
    }
    public void go(){
        System.out.println("Метод перемещения - гулять");
    }

}
