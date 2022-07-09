public class Hersteller {
    private int herstellerID;
    private String name;

    public Hersteller(int herstellerID, String name) {
        this.herstellerID = herstellerID;
        this.name = name;
    }

    public int getHerstellerID() {
        return herstellerID;
    }

    public String getName() {
        return name;
    }

    public void setHerstellerID(int herstellerID) {
        this.herstellerID = herstellerID;
    }

    public void setName(String name) {
        this.name = name;
    }
}
