public class Start
{

    public static Lotnisko lotnisko = new Lotnisko();

    public static void main(String[] args) throws InterruptedException
    {
        final int ileSamolotow = 10 ;        // przechowuje dla ilu cykli samolotu mamy wykonac symulacje

        WiezaStartow wiezaStartow = new WiezaStartow();
        WiezaLadowan wiezaLadowan = new WiezaLadowan();

        System.out.println("Symulacja rozpoczeta");


        for(int i = 0; i < ileSamolotow; i++)
        {
            System.out.println("");
            int pozycja = PozycjaSamolotu.podajPozycje();   // zmienna przechowuje gdzie znajduje sie samolot, 1- na ladzie, 2 - w powietrzu
            Thread.sleep(2000);

            if(pozycja == 1)                                // gdy samolot jest na ladzie
            {
                wiezaStartow.PrzygotowanieDoStartu();
            }
            else                                            // gdy samolot jest w powietrzu
                wiezaLadowan.przygotowanieDoLadowania();
        }
    }
}
