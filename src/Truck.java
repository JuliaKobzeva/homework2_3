public class Truck extends Transport implements Competing{

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void startMoving(){
    }
    public void finishMoving(){
    }

    @Override
    public void  pitStop() {
        System.out.println("Остановка для дозаправки");
    }

    @Override
    public void  maxSpeed() {
        System.out.println("Достигнута максимальная скорость");
    }

    @Override
    public void  bestTime() {
        System.out.println("Лучшее время круга");
    }
}
