public class Truck extends Transport implements Competing{

    public Truck(String brand, String model, double engineVolume) {
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
}
