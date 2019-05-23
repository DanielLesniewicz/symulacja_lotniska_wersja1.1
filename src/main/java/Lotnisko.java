import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/** Klasa odpowiedzialna za lotnisko */
public class Lotnisko
{

    List<Pasazerski> magazynPasazerskich = new LinkedList<>();
    List<Towarowy> magazynTowarowych = new LinkedList<>();
    List<Awionetka> magazynAwionetek = new LinkedList<>();

    private PasyStartowe pasy = new PasyStartowe();

    /** Tworzy instancje, czyli konkretne samoloty*/
    public Lotnisko()
    {
        magazynPasazerskich.add(new Pasazerski("Pasazerski1"));
        magazynPasazerskich.add(new Pasazerski("Pasazerski2"));

        magazynTowarowych.add(new Towarowy("Towarowy1"));
        magazynTowarowych.add(new Towarowy("Towarowy2"));

        magazynAwionetek.add(new Awionetka("Awionetka1"));
        magazynAwionetek.add(new Awionetka("Awionetka2"));
    }


    /** Wyświetla stan magazynu w zależności od rodzalu samolotu
     * @param rodzaj Rodzaj magazynu*/
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


    /** Zwraca stan magazynu w zależności od rodzalu samolotu
     * @param rodzajSamolotu Rodzaj samolotu
     * @return Ilość samolotów w magazynie*/
    public int ileWmagazynie(int rodzajSamolotu)
    {
        if(rodzajSamolotu == 1)
            return magazynPasazerskich.size();
        else if(rodzajSamolotu == 2)
            return magazynTowarowych.size();
        else
            return  magazynAwionetek.size();
    }

    /** Wybieraz z magazynu samolot pasażerski */
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


    /** Wybieraz z magazynu samolot towarowy */
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

    /** Wybieraz z magazynu awionetkę */
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

    /** Sparawdza dostępność samolotów pasażerskich */
    public boolean dostepnoscPasyPasazerskie()
    {
        return pasy.dostepnoscPasyPasazerskie();
    }

    /** Sparawdza dostępność samolotów towarowych */
    public boolean dostepnoscPasyTowarowe()
    {
        return pasy.dostepnoscPasyTowarowe();
    }

    /** Sparawdza dostępność samolotów typu awionetka */
    public boolean dostepnoscPasyAwionetki()
    {
        return pasy.dostepnoscPasyAwionetki();
    }

    /** odstawia do magazynu samolot pasażerski */
    public void odstawDoMagazynu(Pasazerski pasazerski)
    {
        magazynPasazerskich.add(pasazerski);
        System.out.println("Samolot odstawiono pomyslnie do magazynu");
    }

    /** odstawia do magazynu samolot towarowy */
    public void odstawDoMagazynu(Towarowy towarowy)
    {
        magazynTowarowych.add(towarowy);
        System.out.println("Samolot odstawiono pomyslnie do magazynu");
    }

    /** odstawia do magazynu samolot typu awionetka */

    public void odstawDoMagazynu(Awionetka awionetka)
    {
        magazynAwionetek.add(awionetka);
        System.out.println("Samolot odtsawiono pomyslnie do magazynu");
    }
}
