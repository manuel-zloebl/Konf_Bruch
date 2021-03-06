public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    public Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {
        // TODO: Die Methode soll den Dezimalwert zum Bruch retournieren
        double decimal = numerator / denominator;
        return decimal;
    }

    public String print() {
        // TODO: Die Methode soll den Bruch als Text retournieren z.B.: "5 / 7"
        String text;
        text = numerator + " / " + denominator;
        return text;
    }


    public Bruch multiplicate(Bruch b2) {
        /* TODO:
        *  Erstellen Sie für das Ergebnis eine neue Bruch-Variable
        *   => Übergeben Sie im Konstruktur für numerator den
        *       eigenen numerator multipliziert mit b2.getNumerator()
        *   => Selbige auch für denominator
        *  Retournieren Sie ihre neue Bruch-Variable
        * */

        int denom = this.denominator * b2.getDenominator();
        int numer = this.numerator * b2.getNumerator();

        return new Bruch(numer, denom);

    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {
        // TODO: Multiplizieren Sie den eigenen Bruch mit b2 und b3
        int denom = this.denominator * b2.getDenominator() * b3.getDenominator();
        int numer = this.numerator * b2.getNumerator() * b3.getDenominator();

        return new Bruch(numer, denom);
    }
}
