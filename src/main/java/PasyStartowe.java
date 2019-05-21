import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PasyStartowe
{
    private int liczbaPasowPasazerskie = 5;
    private int liczbaPasowTowarowe = 6;
    private int liczbaPasowAwionetka = 4;
    private int numer = 9550;               //zmienna potrzebna do nazw samolotow

    List<Pasazerski> pasyPasazerskie = new ArrayList<>(liczbaPasowPasazerskie);
    List<Towarowy> pasyTowarowe = new ArrayList<>(liczbaPasowTowarowe);
    List<Awionetka> pasyAwionetki = new ArrayList<>(liczbaPasowAwionetka);

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
