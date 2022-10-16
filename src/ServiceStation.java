import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation <T extends Transport>{
    String name;

    public ServiceStation(String name) {
        this.name = name;
    }

    private Queue <T> queue = new LinkedList<>();

    public void addCar(T car){
        queue.offer(car);
    }

    public void serviceCar(){
        T car = queue.poll();
        if (car != null){
            System.out.println("Машина " + car + " проходит техобслуживание в станции техобслуживания " + name);
            serviceCar();
        } else {
            System.out.println("В очедеди никого нет");
        }
    }
}
