import java.util.Random;

public class Generator {

    public static int generuj(int zakres)
    {
        Random r = new Random();
        return r.nextInt(zakres);
    }
}
