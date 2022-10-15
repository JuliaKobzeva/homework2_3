public class Sponsor {
    String name;
    double sum;

    public Sponsor(String name, double sum) {
        this.name = name;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void giveMoney(){
        System.out.println(name + " спонсирует заезд");
    }
}
