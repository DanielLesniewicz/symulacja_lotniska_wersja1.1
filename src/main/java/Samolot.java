public abstract class Samolot {

    private String nazwa;
    private int czasZaladunku;
    private int czasTankowania;
    private int czasRozladunku;
    Zbiornik zbiornik;

    //konstruktor
    public Samolot(String nazwa, int pojemnoscZbiornika, int czasZaladunku, int czasTankowania, int czasRozladunku)
    {
        this.nazwa = nazwa;
        zbiornik = new Zbiornik(pojemnoscZbiornika);
        this.czasZaladunku = czasZaladunku;
        this.czasTankowania = czasTankowania;
        this.czasRozladunku = czasRozladunku;
    }


    public Samolot()
    {}

    public String podajNazwe()
    {
        return nazwa;
    }


    public int ilePaliwa()
    {
        return zbiornik.ilePaliwa();
    }

    public int podajCzasTankowania()
    {
        return czasTankowania;
    }

    public int podajCzasZaladunku()
    {
        return czasZaladunku;
    }

    public int podajCzasRozladunku()
    {
        return czasRozladunku;
    }


    public int podajPojemnoscZbiornika()
    {
        return zbiornik.ilePojemnosc();
    }

    public void zatankuj()
    {
        zbiornik.zatankuj();
    }
}
