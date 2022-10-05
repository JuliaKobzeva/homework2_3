public class Main {
    public static void main(String[] args) {
        Car ladaGrande = new Car ("Lada", "Grande", 1.7);
        Car audiA8 = new Car ("Audi", "A8 50 L TDI quattro", 3.0);
        Car bmwZ8 = new Car ("BMW", "Z8", 3.0);
        Car kiaSportage = new Car ("Kia", "Sportage 4 поколение", 2.4);


        System.out.println(ladaGrande);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);

        Bus paz = new Bus("ПАЗ","3205",4.6);
        Bus kia = new Bus("Kia","Granbird",4.6);
        Bus liaz = new Bus("ЛиАЗ","5256",4.6);
        Bus hyundai = new Bus("Hyundai","Universe",4.6);

        System.out.println(paz);
        System.out.println(kia);
        System.out.println(liaz);
        System.out.println(hyundai);

        Truck gaz = new Truck ("ГАЗ", "66", 4.2);
        Truck zil = new Truck ("ЗИЛ", "130", 4.2);
        Truck hyundai2 = new Truck ("Hyundai", "Porter", 4.2);

        System.out.println(gaz);
        System.out.println(zil);
        System.out.println(hyundai2);

        audiA8.pitStop();
        paz.maxSpeed();
        zil.bestTime();

        DriverB <Car> sasha = new DriverB("Саша","B",5);
        DriverC <Truck> petr = new DriverC("Петр","C",5);
        DriverD <Bus> dima = new DriverD("Дима","D",5);

        sasha.startMoving(bmwZ8);
        petr.startMoving(gaz);
        dima.startMoving(hyundai);

//        audiA8.refill();
    }
}