import java.util.Objects;

public class Amphibian extends Animal{
    private String environment;

    public Amphibian(String name, int age, String environment) {
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
        System.out.println("Земноводные охотятся.");
    }
    public void sleep(){
    }
    public void go(){
    }

    @Override
    public String toString() {
        return getName() + ", возраст: " + getAge() + ", среда обитания: " + environment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(getName(), amphibian.getName()) && Objects.equals(getAge(), amphibian.getAge())
                && Objects.equals(environment, amphibian.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environment, getName(), getAge());
    }
}
