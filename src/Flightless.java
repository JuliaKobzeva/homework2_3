import java.util.Objects;

public class Flightless extends Bird{
    private String movementType;

    public Flightless(String name, int age, String environment, String movementType) {
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
        System.out.println("Эти птицы гуляют.");
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
        Flightless flightless = (Flightless) o;
        return Objects.equals(getName(), flightless .getName()) && Objects.equals(getAge(), flightless .getAge())
                && Objects.equals(getEnvironment(), flightless .getEnvironment()) && Objects.equals(movementType, flightless .movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getEnvironment(), movementType);
    }
}
