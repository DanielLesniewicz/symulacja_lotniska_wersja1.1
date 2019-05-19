public class Zbiornik
{
    private int pojemnosc;
    private int iloscPaliwa;        // przechowuje obecną ilość paliwa w zbiorniku

    //konstruktor
    public Zbiornik(int pojemnosc)
    {
        this.pojemnosc = pojemnosc;
        iloscPaliwa = Generator.generuj(pojemnosc);         // losowa ilosc paliwa w samolocie
    }

    public int ilePaliwa()
    {
        return iloscPaliwa;
    }

    public int ilePojemnosc()
    {
        return pojemnosc;
    }

    public void zatankuj()
    {
        iloscPaliwa = pojemnosc;
        System.out.println("Zatankowano samolot!");
    }
}
