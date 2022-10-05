public class Bus extends Transport implements Competing{
    public Bus(String brand, String model, double engineVolume) {
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

    //    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
//        super(brand, model, productionYear, productionCountry, color, maxSpeed);
//    }
//
//    public void refill(){
//        System.out.println("Заправьте автобус бензином или дизелем.");
//    }
}
