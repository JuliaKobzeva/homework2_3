public class Main {
    public static void main(String[] args) {
        Car ladaGrande = new Car ("Lada", "Grande", 1.7, Car.BodyType.SEDAN );
        Car audiA8 = new Car ("Audi", "A8 50 L TDI quattro", 3.0, Car.BodyType.SEDAN);
        Car bmwZ8 = new Car ("BMW", "Z8", 3.0, Car.BodyType.SEDAN);
        Car kiaSportage = new Car ("Kia", "Sportage 4 поколение", 2.4, Car.BodyType.SEDAN);


        System.out.println(ladaGrande);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);

        Bus paz = new Bus("ПАЗ","3205",4.6, Bus.Capacity.AVERAGE);
        Bus kia = new Bus("Kia","Granbird",4.6, Bus.Capacity.AVERAGE);
        Bus liaz = new Bus("ЛиАЗ","5256",4.6, Bus.Capacity.AVERAGE);
        Bus hyundai = new Bus("Hyundai","Universe",4.6, Bus.Capacity.AVERAGE);

        System.out.println(paz);
        System.out.println(kia);
        System.out.println(liaz);
        System.out.println(hyundai);

        Truck gaz = new Truck ("ГАЗ", "66", 4.2, Truck.Weight.N2);
        Truck zil = new Truck ("ЗИЛ", "130", 4.2, Truck.Weight.N2);
        Truck hyundai2 = new Truck ("Hyundai", "Porter", 4.2, Truck.Weight.N2);

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

        audiA8.printType();
        paz.printType();
        zil.printType();

        service(
                ladaGrande, audiA8, bmwZ8, kiaSportage,
                paz, kia,liaz, hyundai,
                gaz, zil, hyundai2
        );


//        audiA8.refill();
    }

    private static void service(Transport ... transports){
        for (Transport transport : transports) {
            serviceTransport (transport);
        }
    }

    private static void serviceTransport (Transport transport){
        try{
            if(!transport.check()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}