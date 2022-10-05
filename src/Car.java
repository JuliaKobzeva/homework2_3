import java.time.LocalDate;

public class Car extends Transport implements Competing{

    public Car(String brand, String model, double engineVolume) {
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

//    public static class Key{
//        private boolean remoteEngineStart;
//        private boolean keylessAccess;
//
//        public Key(boolean remoteEngineStart, boolean keylessAccess) {
//            this.remoteEngineStart = remoteEngineStart;
//            this.keylessAccess = keylessAccess;
//        }
//
//        public Key() {
//            this(false, false);
//        }
//
//        @Override
//        public String toString() {
//            return ", удаленный контроль: " + remoteEngineStart + ", бесключевой доступ: " + keylessAccess;
//        }
//    }
//
//    public class Insurance{
//        private LocalDate insuranceValidityPeriod;
//        private double insuranceCost;
//        private String insuranceNumber;
//
//        public Insurance(LocalDate insuranceValidityPeriod, double insuranceCost, String insuranceNumber) {
//
//            if(insuranceValidityPeriod == null){
//                this.insuranceValidityPeriod = LocalDate.now().plusDays(365);
//            } else {
//                this.insuranceValidityPeriod = insuranceValidityPeriod;
//            }
//
//            if(insuranceCost < 0){
//                this.insuranceCost = Math.abs(insuranceCost);
//            }else this.insuranceCost = insuranceCost;
//
//            if(insuranceNumber.length() != 9){
//                System.out.println("Номер страховки некорректный.");
//            }else this.insuranceNumber = insuranceNumber;
//        }
//
//        public Insurance(){
//            this(null,10_000, "123456789");
//        }
//
//        public LocalDate getInsuranceValidityPeriod() {
//            return insuranceValidityPeriod;
//        }
//
//        public void setInsuranceValidityPeriod(LocalDate insuranceValidityPeriod) {
//            this.insuranceValidityPeriod = insuranceValidityPeriod;
//        }
//
//        public double getInsuranceCost() {
//            return insuranceCost;
//        }
//
//        public void setInsuranceCost(double insuranceCost) {
//            this.insuranceCost = insuranceCost;
//        }
//
//        public String getInsuranceNumber() {
//            return insuranceNumber;
//        }
//
//        public void setInsuranceNumber(String insuranceNumber) {
//            this.insuranceNumber = insuranceNumber;
//        }
//
//        public void checkInsuranceValidityPeriod(){
//            if(insuranceValidityPeriod.isBefore(LocalDate.now()) || insuranceValidityPeriod.isEqual(LocalDate.now())){
//                System.out.println("Нужно срочно оформить новую страховку.");
//            }
//        }
//
//        @Override
//        public String toString() {
//            return ", период страхования: " + insuranceValidityPeriod + ", стоимость страховки: " + insuranceCost + ", номер страховки: " + insuranceNumber;
//        }
//    }


//    private double engineVolume;
//    private String transmission;
//    private String bodyType;
//    private String registrationNumber;
//    private int numberOfSeats;
//    private String summerOrWinterTires;
//    private Key key;
//    private Insurance insurance;

//    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry,
//               String transmission, String bodyType, String registrationNumber, int numberOfSeats, int maxSpeed, String summerOrWinterTires,
//               Key key, Insurance insurance){
//
//        super(brand, model, productionYear, productionCountry, color, maxSpeed);
//
//        if(engineVolume == 0){
//            this.engineVolume = 1.5;
//        }else this.engineVolume = engineVolume;
//
//        if(transmission == null || transmission.isEmpty() || transmission.isBlank()){
//            this.transmission = "default";
//        }else this.transmission = transmission;
//
//        if(bodyType == null || bodyType.isEmpty() || bodyType.isBlank()){
//            this.bodyType = "default";
//        }else this.bodyType = bodyType;
//
//        if(registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()){
//            this.registrationNumber = "default";
//        }else this.registrationNumber = registrationNumber;
//
//        if(numberOfSeats < 0){
//            this.numberOfSeats = Math.abs(numberOfSeats);
//        }else this.numberOfSeats = numberOfSeats;
//
//        if(summerOrWinterTires == null || summerOrWinterTires.isEmpty() || summerOrWinterTires.isBlank()){
//            this.summerOrWinterTires = "default";
//        }else this.summerOrWinterTires = summerOrWinterTires;
//
//        if(key == null){
//            this.key = new Key();
//        }else this.key = key;
//
//        if(key == null){
//            this.insurance = new Insurance();
//        }else this.insurance = insurance;
//    }

//    public String getBodyType() {
//        return bodyType;
//    }
//
//    public int getNumberOfSeats() {
//        return numberOfSeats;
//    }
//
//    public double getEngineVolume() {
//        return engineVolume;
//    }
//
//    public void setEngineVolume(double engineVolume) {
//        if(engineVolume == 0){
//            this.engineVolume = 1.5;
//        }else this.engineVolume = engineVolume;
//    }
//
//
//    public String getTransmission() {
//        return transmission;
//    }
//
//    public void setTransmission(String transmission) {
//        if(transmission == null || transmission.isEmpty() || transmission.isBlank()){
//            this.transmission = "default";
//        }else this.transmission = transmission;
//    }
//
//    public String getRegistrationNumber() {
//        return registrationNumber;
//    }
//
//    public void setRegistrationNumber(String registrationNumber) {
//        if(registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()){
//            this.registrationNumber = "default";
//        }else this.registrationNumber = registrationNumber;
//    }
//
//    public String getSummerOrWinterTires() {
//        return summerOrWinterTires;
//    }
//
//    public void setSummerOrWinterTires(String summerOrWinterTires) {
//        if(summerOrWinterTires == null || summerOrWinterTires.isEmpty() || summerOrWinterTires.isBlank()){
//            this.summerOrWinterTires = "default";
//        }else this.summerOrWinterTires = summerOrWinterTires;
//    }
//
//    public Key getKey() {
//        return key;
//    }
//
//    public void setKey(Key key) {
//        this.key = key;
//    }
//
//    public Insurance getInsurance() {
//        return insurance;
//    }
//
//    public void setInsurance(Insurance insurance) {
//        this.insurance = insurance;
//    }
//
//    @Override
//    public String toString() {
//        return getBrand() + " " + getModel() + ", объем двигателя: " + engineVolume + " литра, цвет кузова: " + getColor() + ", год выпуска: " +
//                getProductionYear() + ", страна сборки: " + getProductionCountry() + ", коробка передач: " + transmission + ", тип кузова: " +
//                bodyType + ", регистрационный номер: " + registrationNumber + ", количество мест: " + numberOfSeats + ", максимальная скорость: " + getMaxSpeed() + ", тип резины: "
//                + summerOrWinterTires + key + insurance;
//    }
//
//    public void changeTires(Car car){
//        if(summerOrWinterTires == "летняя"){
//            setSummerOrWinterTires("зимняя");
//        } else {
//            setSummerOrWinterTires("летняя");
//        }
//    }
//
//    public boolean isCorrectRegNumber(){
//        //x000xx000
//        if(registrationNumber.length() != 9){
//            return false;
//        }
//        char[]chars = registrationNumber.toCharArray();
//        if(!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])){
//            return false;
//        }
//        if(!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
//                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])){
//            return false;
//        }
//        return true;
//    }
//
//    public void refill(){
//        System.out.println("Заправьте машину бензином, дизелем или зарядите на специальных электроду-парковках, если это электрокар.");
//    }
}
