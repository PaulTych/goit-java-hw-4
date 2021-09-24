package HW4;

public class SpaceShip {
    private String name = "Voyager";
    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }
    public static String test(Season season) {
        return season.getName() + (season.isCold() ? " is cold" : " is warm");
    }

    public void setSerialNumber(String serialNumber) {
        if (!(serialNumber.startsWith("SN")) || (serialNumber.length() != 8)) {
            return;
        }
        this.serialNumber = serialNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty() && name.length() < 100) {
            this.name = name;
        }

    }

    public void printInfo() {
        System.out.println("Name is " + this.name + ", serial number is " + this.serialNumber);
    }

    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
        System.out.println(ship.getName()); //Should be null
        ship.setName("Walker");
        System.out.println(ship.getName()); //Should be Walker
        ship.setSerialNumber("SN506788");
        System.out.println(ship.getSerialNumber()); //Should be SN506788

        ship.setSerialNumber("EE123456");
        System.out.println(ship.getSerialNumber());
        //Name is Voyager, serial number is SN504030
        ship.printInfo();
        ///
        ///
        AdvancedXFuelEngine engine = new AdvancedXFuelEngine();
        engine.setPower(1000);
        engine.setSerialNumber("SN504030");
        engine.printInfo(); //Serial number is SN504030, power is 1000
        //Task16
        System.out.println(Planets.MERCURY);
        //Task17
        System.out.println(SpaceportMessages.generateLandingMessage("SunFlower", "EarthKeeper", "20:40"));
        //Task18
        System.out.println(SpaceUtils.PLANET_COUNT);
        System.out.println(SpaceUtils.pluralPlanets(1));
        System.out.println(SpaceUtils.pluralPlanets(5));
        System.out.println(SpaceUtils.generateStartMessage("Earthkeeper", "20:40"));
        //Task19
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        Point p3 = new Point();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        System.out.println(p1.equals(p2)); //Will be false
        System.out.println(p1.getX());
        System.out.println(p2.getX());
        //Task 20
        System.out.println(p1.equals(p2)); //Should be true
        System.out.println(p1.equals(p3)); //Should be false

        //Task 21
        System.out.println(p1.hashCode() == p2.hashCode()); //Should be true
        System.out.println(p1.hashCode() == p3.hashCode()); //Can be true or false

        //Task22
        StarTrack track1 = new StarTrack();
        track1.setStart(p1);
        track1.setFinish(p2);

        StarTrack track2 = new StarTrack();
        track2.setStart(p1);
        track2.setFinish(p2);

        StarTrack track3 = new StarTrack();
        track3.setStart(p1);
        track3.setFinish(p3);

        System.out.println("1 eq 2 ="+track1.equals(track2)); //Should be true
        System.out.println("1 eq 3 ="+track1.equals(track3)); //Should be false
        System.out.println("1 hs 2 ="+(track1.hashCode() == track2.hashCode())); //Should be true
        System.out.println("1 hs 3 ="+(track1.hashCode() == track3.hashCode())); //Should be false

        //Task 23
        RocketLauncher launcher = new RocketLauncher();
        launcher.setSize("big");
        launcher.setRocketCount(50);

        System.out.println(launcher);//Should be - Size is big, rocket count is 50

        //Task 24
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars.toString());
        System.out.println(stars.getCount());

        //Task 25
        PlanetTester tester = new PlanetTester();
        System.out.println(tester.test(new Mars())); //Should be planet
        System.out.println(tester.test(new Moon())); //Should be not planet

        //Task 26
        FirNum firNum = new FirNum();
        System.out.println(firNum.calc(10));//Should be 10

        //Task 27
        FirNumSum firNumSum = new FirNumSum();
        System.out.println(firNumSum.calc(3)); //Should be 6

        //Task 28
        FirNumFactorial firNumFactorial = new FirNumFactorial();
        System.out.println(firNumFactorial.calc(4)); //Should be 24

        //Task 29
        FirNumMultiplyOdd firNumMultiplyOdd = new FirNumMultiplyOdd();
        System.out.println(firNumMultiplyOdd.calc(5)); //Should be 15

        //Task 30
        FirNumFizzBuzz firNumFizzBuzz = new FirNumFizzBuzz();
        System.out.println(firNumFizzBuzz.calc(20)); //Should be 83

        //Task 31
        FirNumBasis firNumBasis = new FirNumBasis();
        System.out.println(firNumBasis.calc(9)); //Should be 10

        //Task 32
        System.out.println(test(new Winter())); //Should be winter is cold
        System.out.println(test(new Spring()));//Should be spring is warm
        System.out.println(test(new Summer()));//Should be summer is warm
        System.out.println(test(new Autumn()));//Should be autumn is cold

        //Task 33-38
        Spaceport spaceport = new Spaceport();
        spaceport.launch();

        //Task 39
           // new ControlPanelTest().control();
    }
}