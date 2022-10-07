public class Bus extends Transport implements Competing{

    public enum Capacity {
        EXTRA_SMALL(0,10), SMALL(10,25), AVERAGE(40,50), BIG(60,80), EXTRA_BIG(100,120);

        private int from;
        private int to;

        Capacity(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public int getFrom() {
            return from;
        }

        public int getTo() {
            return to;
        }
    }

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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
