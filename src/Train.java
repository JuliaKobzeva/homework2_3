public class Train extends Transport{

    private double ticketCost;
    private int tripTime;
    private String departureStation;
    private String finalStation;
    private int numberOfWagons;


    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed,
                 double ticketCost, int tripTime, String departureStation, String finalStation, int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);

        if(ticketCost < 0){
            this.ticketCost = Math.abs(ticketCost);
        }else{
            this.ticketCost = ticketCost;
        }

        if(tripTime < 0){
            this.tripTime = Math.abs(tripTime);
        }else{
            this.tripTime = tripTime;
        }

        if(departureStation == null || departureStation.isBlank() || departureStation.isEmpty()){
            this.departureStation = "неизвестно";
        }else{
            this.departureStation = departureStation;
        }

        if(finalStation == null || finalStation.isBlank() || finalStation.isEmpty()){
            this.finalStation = "неизвестно";
        }else{
            this.finalStation = finalStation;
        }

        if(numberOfWagons < 0){
            this.numberOfWagons = Math.abs(tripTime);
        }else{
            this.numberOfWagons = numberOfWagons;
        }
    }

    public double getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(double ticketCost) {
        if(ticketCost < 0){
            this.ticketCost = Math.abs(ticketCost);
        }else{
            this.ticketCost = ticketCost;
        }
    }

    public int getTripTime() {
        return tripTime;
    }

    public void setTripTime(int tripTime) {
        if(tripTime < 0){
            this.tripTime = Math.abs(tripTime);
        }else{
            this.tripTime = tripTime;
        }
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        if(departureStation == null || departureStation.isBlank() || departureStation.isEmpty()){
            this.departureStation = "неизвестно";
        }else{
            this.departureStation = departureStation;
        }
    }

    public String getFinalStation() {
        return finalStation;
    }

    public void setFinalStation(String finalStation) {
        if(finalStation == null || finalStation.isBlank() || finalStation.isEmpty()){
            this.finalStation = "неизвестно";
        }else{
            this.finalStation = finalStation;
        }
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if(numberOfWagons < 0){
            this.numberOfWagons = Math.abs(tripTime);
        }else{
            this.numberOfWagons = numberOfWagons;
        }
    }

    @Override
    public String toString() {
        return "Поезд: " + getBrand() + " " + getModel() + ", год выпуска: " + getProductionYear() + ", страна производства: " +
                getProductionCountry() + ", цвет: " + getColor() + ", максимальная скорость: " + getMaxSpeed() +
                " км/ч, стоимость билетов: " + ticketCost + " руб., время в пути: " + tripTime + ", станция отправления: " +
                departureStation + ", станция прибытия: " + finalStation + ", количество вагонов: " + numberOfWagons;
    }

    public void refill(){
        System.out.println("Заправьте поезд дизелем.");
    }
}
