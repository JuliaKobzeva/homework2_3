public class Main {
    public static void main(String[] args) {

        //String name, int age, String environment, String movementType

        Herbivore gazelle = new  Herbivore ("газель", 1, "саванна", 50, "трава");
        Herbivore giraffe = new  Herbivore ("жираф", 1, "саванна", 60, "трава");
        Herbivore horse = new  Herbivore ("лошадь", 1, "ферма", 50, "трава");
        Predator hyena = new  Predator ("гиена", 1, "саванна", 60, "мясо");
        Predator tiger = new  Predator ("тигр", 1, "джунгли", 60, "мясо");
        Predator bear = new  Predator ("медведь", 1, "лес", 50, "мясо, рыба, ягоды, орехи");
        Amphibian frog = new  Amphibian ("лягушка", 1, "болото");
        Amphibian grassSnake = new  Amphibian ("уж", 1, "лес");
        Flightless peacock = new  Flightless ("павлин", 1, "джунгли", "ходить");
        Flightless penguin = new  Flightless ("пингвин", 1, "север", "ходить");
        Flightless dodo = new  Flightless ("додо", 1, "остров Маврикий", "ходить");
        Flying seagull = new   Flying ("чайка", 1, "морское побережье", "летать");
        Flying albatross = new   Flying ("альбатрос", 1, "океанское побережье", "летать");
        Flying falcon = new   Flying ("сокол", 1, "лес, степь", "летать");

        Amphibian frog2 = new  Amphibian ("лягушка", 1, "болото");

        System.out.println(gazelle);
        System.out.println(gazelle.getClass());
        System.out.println(giraffe);
        System.out.println(giraffe.getClass());
        System.out.println(horse);
        System.out.println(horse.getClass());
        System.out.println(hyena);
        System.out.println(hyena.getClass());
        System.out.println(tiger);
        System.out.println(tiger.getClass());
        System.out.println(bear);
        System.out.println(bear.getClass());
        System.out.println(frog);
        System.out.println(frog.getClass());
        System.out.println(grassSnake);
        System.out.println(grassSnake.getClass());
        System.out.println(peacock);
        System.out.println(peacock.getClass());
        System.out.println(penguin);
        System.out.println(penguin.getClass());
        System.out.println(dodo);
        System.out.println(dodo.getClass());
        System.out.println(seagull);
        System.out.println(seagull.getClass());
        System.out.println(albatross);
        System.out.println(albatross.getClass());
        System.out.println(falcon);
        System.out.println(falcon.getClass());

        System.out.println(frog.equals(frog2));
        frog2.removeUnnecessary(frog, frog2);

    }
}