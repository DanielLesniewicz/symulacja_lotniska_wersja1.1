import java.util.Random;
/** Klasa zawierająca generator liczb */
public class Generator {
    /** Generuje i zwraca wylosowaną liczbę
     * @param zakres Zakres do wylosowania liczb
     * @return Wylosowana liczba
     * */
    public static int generuj(int zakres)
    {
        Random r = new Random();
        return r.nextInt(zakres);
    }
}
