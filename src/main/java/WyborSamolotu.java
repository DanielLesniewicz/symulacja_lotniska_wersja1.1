/** Klasa odpowedzialna za wybór typu samolotu */

public class WyborSamolotu {

    /** Zwraca/wybiera wylosowany typ samolotu
     * @return Typ samolotu */
    public static int wybor()
    {
        int wybor = Generator.generuj(3);
        if (wybor == 1)
        {
            System.out.println("Rodzaj samolotu: Pasazerski");
            return 1;
        }
        else if(wybor == 2)
        {
            System.out.println("Rodzaj samolotu: Towarowy");
            return 2;
        }
        else
        {
            System.out.println("Rodzaj samolotu: Awionetka");
            return 3;
        }
    }
}
