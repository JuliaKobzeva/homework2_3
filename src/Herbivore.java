import java.util.Objects;

public class Herbivore extends Mammal{
    private String foodType;

    public Herbivore(String name, int age, String environment, int speed, String foodType) {
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
        System.out.println("Травоядные пасутся.");
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
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(getName(), herbivore.getName()) && Objects.equals(getAge(), herbivore.getAge())
                && Objects.equals(getEnvironment(), herbivore.getEnvironment()) && Objects.equals(getSpeed(), herbivore.getSpeed())
                && Objects.equals(foodType, herbivore.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getEnvironment(), getSpeed(), foodType);
    }
}
