package HW4;

abstract class Season {
    public abstract String getName();

    public abstract boolean isCold();
}

class Winter extends Season {

    public String getName() {
        return "winter";
    }

    public boolean isCold() {
        return true;
    }
}

class Spring extends Season {
    public String getName() {
        return "spring";
    }

    public boolean isCold() {
        return false;
    }
}

class Summer extends Season {
    public String getName() {
        return "summer";
    }

    public boolean isCold() {
        return false;
    }
}

class Autumn extends Season {
    public String getName() {
        return "autumn";
    }

    public boolean isCold() {
        return true;
    }
}
