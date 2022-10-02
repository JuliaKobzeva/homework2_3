import java.util.Objects;

public class Predator extends Mammal{
    private String foodType;

    public Predator(String name, int age, String environment, int speed, String foodType) {
        super(name, age, environment, speed);
        if(foodType == null || foodType.isEmpty() || foodType.isBlank()){
            this.foodType = "default";
        } else {
            this.foodType = foodType;
        }
    }

    public String getFoodType() {
        return foodType;
    }

    public void eat(){
        System.out.println("Хищники охотятся.");
    }

    @Override
    public String toString() {
        return getName() + ", возраст: " + getAge() + ", среда обитания: " + getEnvironment() + ", скорость: " + getSpeed()
                + ", тип пищи: " + foodType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predator predator = (Predator) o;
        return Objects.equals(getName(), predator.getName()) && Objects.equals(getAge(), predator.getAge())
                && Objects.equals(getEnvironment(), predator.getEnvironment()) && Objects.equals(getSpeed(), predator.getSpeed())
                && Objects.equals(foodType, predator.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getEnvironment(), getSpeed(), foodType);
    }
}
