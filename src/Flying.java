import java.util.Objects;

public class Flying extends Bird{
    private String movementType;

    public Flying(String name, int age, String environment, String movementType) {
        super(name, age, environment);

        if(movementType == null || movementType.isEmpty() || movementType.isBlank()){
            this.movementType = "default";
        } else {
            this.movementType = movementType;
        }
    }

    public String getMovementType() {
        return movementType;
    }

    public void go(){
        System.out.println("Эти птицы летают.");
    }

    @Override
    public String toString() {
        return getName() + ", возраст: " + getAge() + ", среда обитания: " + getEnvironment()
                + ", тип перемещения: " + movementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flying flying = (Flying) o;
        return Objects.equals(getName(), flying .getName()) && Objects.equals(getAge(), flying .getAge())
                && Objects.equals(getEnvironment(), flying .getEnvironment()) && Objects.equals(movementType, flying .movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getEnvironment(), movementType);
    }
}
