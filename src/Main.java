public class Main {
    public static void main(String[] args) {
        Car ladaGrande = new Car ("Lada", "Grande", 1.7, "желтый", 2015, "Россия","автомат", "седан", "н500оа678", 4, 200,"летняя", null, null);
        Car audiA8 = new Car ("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "автомат", "седан", "р770ка860", 4, 200,"зимняя", null, null);
        Car bmwZ8 = new Car ("BMW", "Z8", 3.0, "черный", 2021, "Германия", "автомат", "седан", "у539зв050", 4, 200,"летняя", null, null);
        Car kiaSportage = new Car ("Kia", "Sportage 4 поколение", 2.4, "красный", 2018, "Южная Корея", "автомат", "седан", "с4890цв090", 4, 200,"зимняя", null, null);
        Car hyundaiAvante = new Car ("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "автомат", "седан", "г777ду878", 4, 200,"летняя", null, null);


        System.out.println(ladaGrande);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
    }
}