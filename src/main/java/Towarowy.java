/**
 * Klasa odpowiedzialna za funkcjonalność samolotu wowarowego
 */
public class Towarowy extends Samolot {

    /** Maksymalna liczba towaru na pokładzie */
    private int ladownosc;
    /** Obecna ilość towaru na pokładzie */
    private int iloscTowaru;

    /** Inicjalizuje samolot towarowy
     * @param nazwa Nazwa samolotu*/
    public Towarowy(String nazwa)
    {
        super(nazwa, 1000, 4,5,3);
        ladownosc = 1000;
        iloscTowaru = Generator.generuj(ladownosc);
    }

    /** Mówi o iloci towaru na pokładzie
     * @return Ilość towaru znajdującego się na pokładzie */
    public int iloscTowaruPoklad()
    {
        return iloscTowaru;
    }

    /** Zwraca maksymalną ładowność
     * @return  Ładowność samolotu towarowego*/
    public int ladownoscMax()
    {
        return ladownosc;
    }

    /** Rozładowuje towar */
    public void rozladunek()
    {
        System.out.println("Rozladunek towaru: ");
        iloscTowaru = 0;
    }
}
