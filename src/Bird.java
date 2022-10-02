public abstract class Bird extends Animal{
    private String environment;

    public Bird(String name, int age, String environment) {
        super(name, age);
        if(environment == null || environment.isEmpty() || environment.isBlank()){
            this.environment = "default";
        } else {
            this.environment = environment;
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

    public void eat(){
        System.out.println("Птицы охотятся.");
    }
    public void sleep(){
    }
    public void go(){
    }

}
