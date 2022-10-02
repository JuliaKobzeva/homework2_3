public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        if(name == null || name.isEmpty() || name.isBlank()){
            this.name = "животное";
        } else {
            this.name = name;
        }

        if(age < 0){
            this.age = Math.abs(age);
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void go();

    public void removeUnnecessary(Animal animal, Animal animal2){
        if(animal.equals(animal)){
            animal2 = animal;
        }
    }
}
