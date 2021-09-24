package HW4;
import java.util.*;
public class Point {
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Point p = (Point) o;
        if ((this.x == p.x) && (this.y == p.y) && (this.z == p.z)) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

}
