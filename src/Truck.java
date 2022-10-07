public class Truck extends Transport implements Competing{

    public enum Weight {
        N1(0D, 3.5), N2(3.5, 12D), N3(12D, null);

        private Double from;
        private Double to;

        Weight(Double from, Double to) {
            this.from = from;
            this.to = to;
        }

        public Double getFrom() {
            return from;
        }

        public Double getTo() {
            return to;
        }
    }

    private Weight weight;

    public Truck(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
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
