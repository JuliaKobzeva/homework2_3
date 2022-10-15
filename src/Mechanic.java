public class Mechanic <T extends Transport>{
    String name;
    String surname;
    String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public void service(T t){
        System.out.println(name + " проводит техобслуживание");
    }

    public void fixCar(){
        System.out.println(name + " чинит машину");
    }
}
