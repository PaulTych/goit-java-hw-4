package HW4;

public abstract class SpaceObject {

}

abstract class Planet extends SpaceObject {

}

class Mars extends Planet {

}

class Moon extends SpaceObject {

}

class PlanetTester {
    String test(SpaceObject object) {
        return object instanceof Planet?"planet":"not planet";
    }
}