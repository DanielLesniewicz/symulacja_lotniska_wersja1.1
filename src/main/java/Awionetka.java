public class Awionetka extends Samolot {

    private int iloscPasazerow;
    private int iloscPasazerowPoklad;

    public Awionetka(String nazwa)
    {
        super(nazwa, 200, 4,3,3);
        iloscPasazerow = 4;
        iloscPasazerowPoklad = Generator.generuj(iloscPasazerow);
    }

    public int pasazerowiePoklad()
    {
        return iloscPasazerowPoklad;
    }

    public int iloscPasazerowMax()
    {
        return iloscPasazerow;
    }

    public void rozladunek()
    {
        System.out.println("Wyjscie osob z pokladu");
        iloscPasazerowPoklad = 0;
    }
}
