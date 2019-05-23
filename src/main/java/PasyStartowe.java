import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Klasa odpowiedzialana za pasy startowe
 * */

public class PasyStartowe
{
    /** Ilość pasów dla samolotów pasażerskich*/
    private int liczbaPasowPasazerskie = 5;
    /** Ilość pasów dla samolotów towarowych*/
    private int liczbaPasowTowarowe = 6;
    /** Ilość pasów dla awionetek*/
    private int liczbaPasowAwionetka = 4;
    /** Zmienna wykorzystywana do nazw samolotów*/
    private int numer = 9550;

    List<Pasazerski> pasyPasazerskie = new ArrayList<>(liczbaPasowPasazerskie);
    List<Towarowy> pasyTowarowe = new ArrayList<>(liczbaPasowTowarowe);
    List<Awionetka> pasyAwionetki = new ArrayList<>(liczbaPasowAwionetka);

    /** Generuje dostępne pasy (sytuację) na lotnisku dla samolotu pasażerskiego*/
    public boolean dostepnoscPasyPasazerskie()
    {
        int ile = Generator.generuj(liczbaPasowPasazerskie);

        pasyPasazerskie.removeAll(pasyPasazerskie);
        for(int i = 0; i < ile; i++)
        {
            String str = Integer.toString(numer);
            pasyPasazerskie.add(new Pasazerski("Pasazerski" + str));
            numer += 50;
        }

        System.out.println("Samoloty na pasach: ");
        if(ile != 0)
        {
            System.out.println(pasyPasazerskie);
            if(ile == liczbaPasowPasazerskie)
            {
                System.out.println("Brak wolnych miejsc!");
                return false;
            }
            else
            {
                System.out.println("Liczba wolnych miejsc: " + (liczbaPasowPasazerskie - ile));
                return true;
            }
        }
        else
        {
            System.out.println("Wszystkie pasy sa wolne");
            return true;
        }
    }

    /** Generuje dostępne pasy (sytuację) na lotnisku dla samolotu towarowego*/
    public boolean dostepnoscPasyTowarowe()
    {
        int ile  = Generator.generuj(liczbaPasowTowarowe);

        pasyTowarowe.removeAll(pasyTowarowe);

        for(int i = 0; i < ile; i++)
        {
            String str = Integer.toString(numer);
            pasyTowarowe.add(new Towarowy("Towarowy" + str));
            numer += 50;
        }

        System.out.println("Samoloty na pasach: ");
        if(ile != 0)
        {
            System.out.println(pasyTowarowe);
            if(ile == liczbaPasowTowarowe)
            {
                System.out.println("Brak wolnych miejsc! ");
                return false;
            }
            else
            {
                System.out.println("Liczba wolnych miejsc: " + (liczbaPasowTowarowe - ile));
                return true;
            }
        }
        else
        {
            System.out.println("Wszystkie pasy sa wolne");
            return true;
        }
    }

    /** Generuje dostępne pasy (sytuację) na lotnisku dla awionetki*/
    public boolean dostepnoscPasyAwionetki()
    {
        int ile = Generator.generuj(liczbaPasowAwionetka);

        pasyAwionetki.removeAll(pasyAwionetki);

        for(int i =0; i < ile; i++)
        {
            String str = Integer.toString(numer);
            pasyAwionetki.add(new Awionetka("Awionetka" + str));
            numer += 50;
        }

        System.out.println("Samoloty na pasach:");
        if(ile != 0)
        {
            System.out.println(pasyAwionetki);
            if(ile == liczbaPasowAwionetka)
            {
                System.out.println(" Brak wolnych miejsc!");
                return false;
            }
            else
            {
                System.out.println("Liczba wolnych miejsc: " + (liczbaPasowAwionetka - ile));
                return true;
            }
        }
        else
        {
            System.out.println("Wszystkie pasy sa wolne");
            return true;
        }
    }
}
