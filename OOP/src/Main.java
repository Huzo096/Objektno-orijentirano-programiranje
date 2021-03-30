
/*
    Zadatak jest prikazati uporabu koncepata objektno orijentiranog programiranja - nasljeđivanje, učahurivanje,
    polimorfizam - kroz kreiranje nekoliko klasa. Usporedno je prikazano što je to method overloading i method
    overriding.
        Klasa iz koje ostaje klase nasljeđuju jest klasa PrijevoznoSredstvo sa karakterističnim poljima, konstruktroima,
    getterima i setterima i metodama. Klase koje nasljeđuju su Automobil i Bicikl kao tipovi prijevoznih sredstava.
        U klasama Automobil i Bicikl prepoznajemo nasljeđivanje po ključnoj riječi "extends", a sve ono prepisano iz
    klase PrijevoznoSredstvo po ključnoj riječi "super"
        Modifikator pristupa "private" u poljima, ne dozvoljava drugim klasama izravno pristupanje poljima i tu vidimo
    primjer učhurivanja.
        Pozivom metode .opis vidimo primjer polimorfizma. Metoda je u svakoj klasi istog imena bez parametra, jedino
    se razliku string koji metoda vraća. U main nadređena se klasa referencira na samu sebe ili na klase koje od nje
    nasljeđuju i tako u ispisu vidimo stringove koji su različiti, a vraća ih ista metoda .opis
 */




public class Main {

    public static void main(String[] args) {

        Bicikl bic = new Bicikl("crna", "MTB", "Trek",2);
        System.out.println(bic);
        bic.kojomBrzinom(100);
        System.out.println(bic.opis());
        System.out.println();

        Bicikl bic2 = new Bicikl("roza", "urbani", "Schwinn",3);
        System.out.println(bic2);
        bic2.tricikl();
        System.out.println("*******************************************");


        Automobil auto = new Automobil("plava", "Model 3", "Tesla", true,true);
        System.out.println(auto);
        System.out.println(auto.elektrican());
        auto.kojomBrzinom(120);
        System.out.println(auto.opis());
        System.out.println();

        Automobil auto2 = new Automobil("crna", "Serija 3", "BMW", true,false);
        System.out.println(auto2);
        System.out.println(auto2.elektrican());
        auto2.kojomBrzinom(115);
        System.out.println();

        Automobil auto3 = new Automobil("crna", "Koral 45", "Yugo", false,false);
        System.out.println(auto3);
        System.out.println(auto3.elektrican());
        auto3.kojomBrzinom(63);
        System.out.println("******************************************************");

        PrijevoznoSredstvo voz1 = new Automobil("crvena", "i3", "bmw", true,true);
        System.out.println(voz1.opis());
        PrijevoznoSredstvo voz2 = new Bicikl("crna", "MTB", "Trek",2);
        System.out.println(voz2.opis());
        PrijevoznoSredstvo voz3 = new PrijevoznoSredstvo("Avion", "bijela", "737", "Boeing"
                , true);
        System.out.println(voz3.opis());
        System.out.println("****************************************************");


        //davanje parametara kroz konstruktor
        PrijevoznoSredstvo avion = new PrijevoznoSredstvo("Avion", "bijela", "747", "Boeing",
                true);
        //ispit toString metode
        System.out.println(avion);
        //poziv metode kojom se brzinom sredstvo kreće
        avion.kojomBrzinom(1400);
        System.out.println();

        //davanje parametara putem settera
        PrijevoznoSredstvo camac = new PrijevoznoSredstvo();
        camac.setMotor(false);
        camac.setTip("Plovilo");
        System.out.println(camac.getTip());
        camac.kojomBrzinom(20);


    }
}
