import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lotnisko
{

    List<Pasazerski> magazynPasazerskich = new LinkedList<>();
    List<Towarowy> magazynTowarowych = new LinkedList<>();
    List<Awionetka> magazynAwionetek = new LinkedList<>();

    private PasyStartowe pasy = new PasyStartowe();

    public Lotnisko()
    {
        magazynPasazerskich.add(new Pasazerski("Pasazerski1"));
        magazynPasazerskich.add(new Pasazerski("Pasazerski2"));

        magazynTowarowych.add(new Towarowy("Towarowy1"));
        magazynTowarowych.add(new Towarowy("Towarowy2"));

        magazynAwionetek.add(new Awionetka("Awionetka1"));
        magazynAwionetek.add(new Awionetka("Awionetka2"));
    }



    public void wyswietlMagazyn(int rodzaj)
    {
        System.out.println("Samoloty dostepne w magazynie: ");
        if(rodzaj == 1)
            System.out.println(magazynPasazerskich);
        else if(rodzaj == 2)
            System.out.println(magazynTowarowych);
        else
            System.out.println(magazynAwionetek);
    }



    public int ileWmagazynie(int rodzajSamolotu)
    {
        if(rodzajSamolotu == 1)
            return magazynPasazerskich.size();
        else if(rodzajSamolotu == 2)
            return magazynTowarowych.size();
        else
            return  magazynAwionetek.size();
    }


    public Pasazerski wybierzZmagazynuPasazerski()
    {
        int ile = ileWmagazynie(1);
        if(ile != 0)
        {
            int numerSamolotu = Generator.generuj(ile);
            return magazynPasazerskich.remove(numerSamolotu);
        }
        else
            return null;
    }


    public Towarowy wybierzZmagazynuTowarowy()
    {
        int ile = ileWmagazynie(2);
        if(ile != 0)
        {
            int numerSamolotu = Generator.generuj(ile);
            return magazynTowarowych.remove(numerSamolotu);
        }
        else
            return null;
    }


    public Awionetka wybierzZmagazynuAwionetka()
    {
        int ile = ileWmagazynie(3);
        if(ile != 0)
        {
            int numerSamolotu = Generator.generuj(ile);
            return magazynAwionetek.remove(numerSamolotu);
        }
        else
            return null;
    }


    public boolean dostepnoscPasyPasazerskie()
    {
        return pasy.dostepnoscPasyPasazerskie();
    }

    public boolean dostepnoscPasyTowarowe()
    {
        return pasy.dostepnoscPasyTowarowe();
    }

    public boolean dostepnoscPasyAwionetki()
    {
        return pasy.dostepnoscPasyAwionetki();
    }

    public void odstawDoMagazynu(Pasazerski pasazerski)
    {
        magazynPasazerskich.add(pasazerski);
        System.out.println("Samolot odstawiono pomyslnie do magazynu");
    }

    public void odstawDoMagazynu(Towarowy towarowy)
    {
        magazynTowarowych.add(towarowy);
        System.out.println("Samolot odstawiono pomyslnie do magazynu");
    }

    public void odstawDoMagazynu(Awionetka awionetka)
    {
        magazynAwionetek.add(awionetka);
        System.out.println("Samolot odtsawiono pomyslnie do magazynu");
    }
}
