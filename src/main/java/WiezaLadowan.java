public class WiezaLadowan extends WiezaKontroliLotow
{

    public void  przygotowanieDoLadowania() throws InterruptedException
    {
        int rodzajSamolotu = Generator.generuj(3);
        Thread.sleep(2000);

        if(rodzajSamolotu == 1)                                 // wybrano pasazerski
            ladowaniePasazerski(wpowietrzu.ladujePasazerski());
        else if(rodzajSamolotu == 2)                            // wybrano towarowy
            ladowanieTowarowy(wpowietrzu.ladujeTowarowy());
        else                                                    // wybrano awionetke
            ladowanieAwionetka(wpowietrzu.ladujeAwionetka());

    }

    public void ladowaniePasazerski(Pasazerski pasazerski)
    {


    }

    public void ladowanieTowarowy(Towarowy towarowy)
    {

    }

    public void ladowanieAwionetka(Awionetka awionetka)
    {

    }
}
