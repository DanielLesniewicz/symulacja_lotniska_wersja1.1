/** Klasa odpowedzialna za samoloty w powietrzu */
public class Wpowietrzu {

    /** */
    private Pasazerski pasazerski;
    private Towarowy towarowy;
    private Awionetka awionetka;
    /** Zmienna wykorzystywana przy nazwach samolotów */
    private int numerSamolotu;

    /** Nadaje numer samolotowi */
    public Wpowietrzu()
    {
        numerSamolotu = 1250;
    }

    /** Inicjalizuje samolot pasażerski
     * @return Konkretny samolot pasażerkski o danej nazwie*/
    public Pasazerski ladujePasazerski()
    {
        pasazerski = new Pasazerski("Pasazerski" + numerSamolotu);
        numerSamolotu += 100;
        return pasazerski;
    }

    /** Inicjalizuje samolot towarowy
     * @return Konkretny samolot towarowy o danej nazwie*/
    public Towarowy ladujeTowarowy()
    {
        towarowy = new Towarowy("Towarowy" + numerSamolotu);
        numerSamolotu += 100;
        return towarowy;
    }

    /** Inicjalizuje samolot typu awionetka
     * @return Konkretny samolot typu awionetka o danej nazwie*/
    public Awionetka ladujeAwionetka()
    {
        awionetka = new Awionetka("Awionetka" + numerSamolotu);
        numerSamolotu += 100;
        return awionetka;
    }
}
