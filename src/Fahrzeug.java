
public class Fahrzeug {
    private int fahrzeugID;
    private String kennzeichen;
    private String vin;
    private float maxGeschwindigkeit;
    private int kw;
    private double aktivierungsGebühr;
    private double mieteStuendlich;
    private boolean vermietet;
    private int sitze;
    private Hersteller hersteller;
    private static int anzahl = 0;

    public Fahrzeug(int fahrzeugID, String kennzeichen, String vin, float maxGeschwindigkeit, int kw, double aktivierungsGebühr, double mieteStuendlich, boolean vermietet, int sitze, Hersteller hersteller) {
        this.fahrzeugID = fahrzeugID;
        this.kennzeichen = kennzeichen;
        this.vin = vin;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.kw = kw;
        this.aktivierungsGebühr = aktivierungsGebühr;
        this.mieteStuendlich = mieteStuendlich;
        this.vermietet = vermietet;
        this.sitze = sitze;
        this.hersteller = hersteller;
    }

    public int getFahrzeugID() {
        return fahrzeugID;
    }

    public void setFahrzeugID(int fahrzeugID) {
        this.fahrzeugID = fahrzeugID;
    }

    public Hersteller getHersteller() {
        return hersteller;
    }

    public void setHersteller(Hersteller hersteller) {
        this.hersteller = hersteller;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public float getMaxGeschwindigkeit() {
        return maxGeschwindigkeit;
    }

    public void setMaxGeschwindigkeit(float maxGeschwindigkeit) {
        this.maxGeschwindigkeit = maxGeschwindigkeit;
    }

    public int getKw() {
        return kw;
    }

    public void setKw(int kw) {
        this.kw = kw;
    }

    public double getAktivierungsGebühr() {
        return aktivierungsGebühr;
    }

    public void setAktivierungsGebühr(float aktivierungsGebühr) {
        this.aktivierungsGebühr = aktivierungsGebühr;
    }

    public double getMieteStuendlich() {
        return mieteStuendlich;
    }

    public void setMieteStuendlich(float mieteStuendlich) {
        this.mieteStuendlich = mieteStuendlich;
    }

    public boolean isVermietet() {
        return vermietet;
    }

    public void setVermietet(boolean vermietet) {
        this.vermietet = vermietet;
    }

    public int getSitze() {
        return sitze;
    }

    public void setSitze(byte sitze) {
        this.sitze = sitze;
    }
}
