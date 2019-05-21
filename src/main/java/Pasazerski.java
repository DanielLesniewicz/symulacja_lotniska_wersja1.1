public class Pasazerski extends Samolot {

    private int iloscPasazerow;
    private int iloscPasazerowPoklad;

    public Pasazerski(String nazwa)
    {
        super(nazwa, 1000, 5,3,4);
        iloscPasazerow = 120;
        iloscPasazerowPoklad = Generator.generuj(iloscPasazerow);           // generuje liczbe pasazerow obecna na pokladzie
    }

    public int pasazerowiePoklad()
    {
        return iloscPasazerowPoklad;
    }

    public int iloscPasazerowMax()
    {
        return iloscPasazerow;
    }

    public void zaladunek()
    {
        iloscPasazerowPoklad = iloscPasazerow;
        System.out.println("Wejscie pasazerow na poklad pomyslne.");
    }

    public void rozladunek()
    {
        System.out.println("Wyjscie pasazerow z samolotu: ");
        iloscPasazerowPoklad = 0;
    }
}
