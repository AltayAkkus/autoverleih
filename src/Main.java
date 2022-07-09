public class Main {
    public static void main() {
        Hersteller volkswagen = new Hersteller(1, "Volkswagen");
        Hersteller bmw = new Hersteller(2, "BMW");

        Fahrzeug meinFahrzeug = new Fahrzeug(
                1,
                "KS-GA688",
                "JN1CA31D3YT717809",
                300F,
                110,
                4F,
                5F,
                false,
                4,
                volkswagen
        );
        Fahrzeug meinFahrzeug2 = new Fahrzeug(
                2,
                "KS-GA678",
                "JN1CA31D3YTTT17809",
                330F,
                150,
                8F,
                7F,
                false,
                2,
                bmw
        );
        System.out.println(meinFahrzeug2.getFahrzeugID());
    }
}