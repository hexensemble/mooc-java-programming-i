
public class Bird {

    private String name;
    private String nameLatin;
    private int observations;

    public Bird() {
        this.name = "";
        this.nameLatin = "";
        this.observations = 0;
    }

    public void addName(String name) {
        this.name = name;
    }

    public void addNameLatin(String nameLatin) {
        this.nameLatin = nameLatin;
    }

    public void addObservation() {
        this.observations++;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        if (this.observations == 1) {
            return this.name + " (" + this.nameLatin + "): " + this.observations + " observation";
        }

        return this.name + " (" + this.nameLatin + "): " + this.observations + " observations";
    }
}
