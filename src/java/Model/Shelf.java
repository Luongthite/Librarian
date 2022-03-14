
package Model;

/**
 *
 * @author Admin
 */
public class Shelf {
    private String id;
    private int floor;

    public Shelf() {
    }

    public Shelf(String id, int floor) {
        this.id = id;
        this.floor = floor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Shelf{" + "id=" + id + ", floor=" + floor + '}';
    }
    
    
}
