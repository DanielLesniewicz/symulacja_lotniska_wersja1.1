public class Start
{

    public static Lotnisko lotnisko = new Lotnisko();


    public static void main(String[] args) throws InterruptedException {
        final int ileSamolotow = 10 ;        // przechowuje dla ilu cykli samolotu mamy wykonac symulacje
        Pasazerski pasazerski;
        Towarowy towarowy;
        Awionetka awionetka;

        WiezaKontroliLotow wieza = new WiezaKontroliLotow();
        System.out.println("Symulacja rozpoczeta");


        for(int i = 0; i < ileSamolotow; i++)
        {
            System.out.println("");
            int pozycja = PozycjaSamolotu.podajPozycje();   // zmienna przechowuje gdzie znajduje sie samolot, 1- na ladzie, 2 - w powietrzu
            Thread.sleep(2000);

            int rodzajSamolotu = WyborSamolotu.wybor();     // wybieramy 1 z 3 rodzajii samolotu
            Thread.sleep(2000);

            if(pozycja == 1)                            // gdy samolot jest na ladzie
            {
                if(rodzajSamolotu == 1)                 // gdy samolot pasazerski
                {
                    wieza.startSamolotu(lotnisko.wybierzZmagazynuPasazerski());
                }
                else if(rodzajSamolotu == 2)            // gdy samolot towarowy
                {
                    wieza.startSamolotu(lotnisko.wybierzZmagazynuTowarowy());
                }
                else                                     // gdy awionetka
                    wieza.startSamolotu(lotnisko.wybierzZmagazynuAwionetka());
            }
            else                                        // gdy samolot jest w powietrzu
                System.out.println("Tutaj bedzie kiedys opcja dostepna");
        }
    }
}
