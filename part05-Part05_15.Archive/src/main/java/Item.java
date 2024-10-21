
public class Item {

    private String id;
    private String name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.id + ": " + this.name;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Item)) {
            return true;
        }

        Item comparedItem = (Item) compared;

        if (comparedItem.id.equals(this.id)) {
            return true;
        }

        return false;
    }

}
