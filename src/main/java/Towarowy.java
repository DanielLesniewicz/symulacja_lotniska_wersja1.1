public class Towarowy extends Samolot {

    private int ladownosc;          // maksymalna liczba towaru na pokladzie
    private int iloscTowaru;        // obecna liczba towaru na pokladzie

    public Towarowy(String nazwa)
    {
        super(nazwa, 1000, 4,5,3);
        ladownosc = 1000;
        iloscTowaru = Generator.generuj(ladownosc);
    }

    public int iloscTowaruPoklad()
    {
        return iloscTowaru;
    }

    public int ladownoscMax()
    {
        return ladownosc;
    }


    public void rozladunek()
    {
        System.out.println("Rozladunek towaru: ");
        iloscTowaru = 0;
    }
}
