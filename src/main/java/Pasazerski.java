/**
 * Klasa odpowiedzialna za funkcjonalność samolotu pasażerskiego
 */
public class Pasazerski extends Samolot {

    /** Maksymalna liczba pasażerów na pokładzie */
    private int iloscPasazerow;
    /** Obecna ilość pasażerów na pokładzie */
    private int iloscPasazerowPoklad;

    /** Inicjalizuje samolot pasażerski
     * @param nazwa Nazwa samolotu*/
    public Pasazerski(String nazwa)
    {
        super(nazwa, 1000, 5,3,4);
        iloscPasazerow = 120;
        iloscPasazerowPoklad = Generator.generuj(iloscPasazerow);           // generuje liczbe pasazerow obecna na pokladzie
    }

    /** Mówi o iloci pasażerów na pokładzie
     * @return Ilość pasażerów znajdującego się na pokładzie */
    public int pasazerowiePoklad()
    {
        return iloscPasazerowPoklad;
    }

    /** Zwraca maksymalną ilość pasażerów, którzy moga wejść na pokład
     * @return  Maksymalna ilość pasażerów w danym samolocie pasażerskim*/
    public int iloscPasazerowMax()
    {
        return iloscPasazerow;
    }

    /** Odpowiada za wejście pasażerów */
    public void zaladunek()
    {
        iloscPasazerowPoklad = iloscPasazerow;
        System.out.println("Wejscie pasazerow na poklad pomyslne.");
    }

    /** Odpowiada za wyjście pasażerów */
    public void rozladunek()
    {
        System.out.println("Wyjscie pasazerow z samolotu: ");
        iloscPasazerowPoklad = 0;
    }
}
