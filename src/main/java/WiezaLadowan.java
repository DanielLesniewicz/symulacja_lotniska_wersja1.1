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

    public void ladowaniePasazerski(Pasazerski pasazerski) throws InterruptedException {
        System.out.println("Dostpenosc pasow na lotnisku przeznaczonych dla samolotow pasazerskich: ");

        while(!(lotnisko.dostepnoscPasyPasazerskie()))
        {
            System.out.println("Sytuacja na lotnisku po 50 minutach");
            Odliczanie.odliczaj(5);
        }

        Thread.sleep(2000);
        System.out.println("Samolot laduje");
        Odliczanie.odliczaj(3);
        System.out.println("Samolot wyladowal pomyslnie!");
        Thread.sleep(2000);

        System.out.println("Rozpakowywanie samolotu: ");
        pasazerski.rozladunek();
        Odliczanie.odliczaj(pasazerski.podajCzasRozladunku());
        Thread.sleep(1500);

        System.out.println("Odstawienie samolotu do magazynu: ");
        Odliczanie.odliczaj(4);
        lotnisko.odstawDoMagazynu(pasazerski);
        Thread.sleep(1500);
        System.out.println("Obecne samoloty w magazynie: ");
        lotnisko.wyswietlMagazyn(1);
        Thread.sleep(2000);
    }

    public void ladowanieTowarowy(Towarowy towarowy) throws InterruptedException {

        System.out.println("Dostepnosc pasow na lotnisku dla samolotow transportowych: ");

        while(!(lotnisko.dostepnoscPasyTowarowe()))
        {
            System.out.println("Sytuacja na lotnisku po 50 minutach");
            Odliczanie.odliczaj(5);
        }
        Thread.sleep(2000);
        System.out.println("Samolot laduje");
        Odliczanie.odliczaj(3);
        System.out.println("Samolot wyladowal pomyslnie!");
        Thread.sleep(2000);

        System.out.println("Rozpakowywanie samolotu:");
        towarowy.rozladunek();
        Odliczanie.odliczaj(towarowy.podajCzasRozladunku());
        Thread.sleep(1500);

        System.out.println("Odstawienie samolotu do magazynu:");
        Odliczanie.odliczaj(4);
        lotnisko.odstawDoMagazynu(towarowy);
        Thread.sleep(1500);
        System.out.println("Obecne samoloty w magazynie: ");
        lotnisko.wyswietlMagazyn(2);                    // wyswietlenie zawartosci magazynu samolotow towarowych
        Thread.sleep(2000);

    }

    public void ladowanieAwionetka(Awionetka awionetka) throws InterruptedException {

        System.out.println("Dostepnosc pasow na lotnisku dla awionetek: ");

        while(!(lotnisko.dostepnoscPasyAwionetki()))
        {
            System.out.println("Sytuacja na lotnisku po 50 minutach");
            Odliczanie.odliczaj(5);
        }
        Thread.sleep(2000);
        System.out.println("Samolot laduje");
        Odliczanie.odliczaj(3);
        System.out.println("Samolot wyladowal pomyslnie!");
        Thread.sleep(2000);

        System.out.println("Rozpakowywanie samolotu:  ");
        awionetka.rozladunek();
        Odliczanie.odliczaj(awionetka.podajCzasRozladunku());
        Thread.sleep(1500);

        System.out.println("Odstawienie samolotu do magazynu:  ");
        Odliczanie.odliczaj(4);
        lotnisko.odstawDoMagazynu(awionetka);
        Thread.sleep(1500);
        System.out.println("Obecne samoloty w magazynie: ");
        lotnisko.wyswietlMagazyn(3);                    // wyswietlenie zawartosci magazynu samolotow towarowych
        Thread.sleep(2000);
    }
}
