public class Transport {
    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;

        if(productionYear < 0){
            this.productionYear = Math.abs(productionYear);
        }else{
            this.productionYear = productionYear;
        }

        this.productionCountry = productionCountry;

        if(color == null || color.isBlank() || color.isEmpty()){
            this.color = "неизвестно";
        }else{
            this.color = color;
        }

        if(maxSpeed < 0){
            this.maxSpeed = Math.abs(maxSpeed);
        }else{
            this.maxSpeed = maxSpeed;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.isBlank() || color.isEmpty()){
            this.color = "белый";
        }else{
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed < 0){
            this.maxSpeed = Math.abs(maxSpeed);
        }else{
            this.maxSpeed = maxSpeed;
        }
    }
}
