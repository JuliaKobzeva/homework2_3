public class Bus extends Transport implements Competing{
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void startMoving(){
    }
    public void finishMoving(){
    }

    @Override
    public int pitStop() {
        return 0;
    }

    @Override
    public int maxSpeed() {
        return 0;
    }

    @Override
    public int bestTime() {
        return 0;
    }

    //    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
//        super(brand, model, productionYear, productionCountry, color, maxSpeed);
//    }
//
//    public void refill(){
//        System.out.println("Заправьте автобус бензином или дизелем.");
//    }
}
