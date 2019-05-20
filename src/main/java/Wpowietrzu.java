public class Wpowietrzu {

    private Pasazerski pasazerski;
    private Towarowy towarowy;
    private Awionetka awionetka;
    private int numerSamolotu;          // zmienna wykorzystywana przy nazwach samolotow

    public Wpowietrzu()
    {
        numerSamolotu = 1250;
    }

    public Pasazerski ladujePasazerski()
    {
        pasazerski = new Pasazerski("Pasazerski" + numerSamolotu);
        numerSamolotu += 100;
        return pasazerski;
    }

    public Towarowy ladujeTowarowy()
    {
        towarowy = new Towarowy("Towarowy" + numerSamolotu);
        numerSamolotu += 100;
        return towarowy;
    }

    public Awionetka ladujeAwionetka()
    {
        awionetka = new Awionetka("Awionetka" + numerSamolotu);
        numerSamolotu += 100;
        return awionetka;
    }
}
