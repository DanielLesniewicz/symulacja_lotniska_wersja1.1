/**
 * Klasa odpowiedzialna za funkcjonalność awionetki
 */
public class Awionetka extends Samolot {

    /** Maksymalna liczba pasażerów na pokładzie */
    private int iloscPasazerow;
    /** Obecna ilość pasażerów na pokładzie */
    private int iloscPasazerowPoklad;

    /** Inicjalizuje samolot typu awionetka
     * @param nazwa Nazwa samolotu*/
    public Awionetka(String nazwa)
    {
        super(nazwa, 200, 4,3,3);
        iloscPasazerow = 4;
        iloscPasazerowPoklad = Generator.generuj(iloscPasazerow);
    }
    /** Mówi o iloci pasażerów na pokładzie
     * @return Ilość pasażerów znajdującego się na pokładzie */
    public int pasazerowiePoklad()
    {
        return iloscPasazerowPoklad;
    }

    /** Zwraca maksymalną ilość pasażerów, którzy moga wejść na pokład
     * @return  Maksymalna ilość pasażerów w danej awionetce*/
    public int iloscPasazerowMax()
    {
        return iloscPasazerow;
    }

    /** Odpowiada za wyjście pasażerów */
    public void rozladunek()
    {
        System.out.println("Wyjscie osob z pokladu");
        iloscPasazerowPoklad = 0;
    }
}
