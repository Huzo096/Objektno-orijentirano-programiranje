
//na primjeru polja sa modifikatorom pristupa (private) je prikazano učahurivanje, odnosno polja nisu direktno
// dostupna drugim klasama, osim putem konstruktora/gettera/settera
public class PrijevoznoSredstvo {
    private String tip;
    private String boja;
    private String model;
    private String proizvodac;
    private boolean motor;

    //između prvog i drugog konstruktora vidimo "Method overloading", odnosno, konstruktori su istog imena,
    //ali različitih parametara
    public PrijevoznoSredstvo() {
    }

    public PrijevoznoSredstvo(String tip, String boja, String model, String proizvodac, boolean motor){
        this.tip = tip;
        this.boja = boja;
        this.model = model;
        this.proizvodac = proizvodac;
        this.motor = motor;
    }

    /*
    kreiram gettere i settere putem kojih u main klasi mogu postaviti i dohvatiti vrijednosti polja klase
    PrijevoznoSredstvo
     */
    public void setTip(String tip){
        this.tip = tip;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProizvodac(String proizvodac) {
        this.proizvodac = proizvodac;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public String getTip(){
        return  this.tip;
    }

    public String getBoja(){
        return this.boja;
    }

    public String getModel(){
        return this.model;
    }

    public String getProizvodac(){
        return this.proizvodac;
    }

    public boolean isMotor() {
        return motor;
    }

    //metoda koja ne vraća ništa jer je void, ako prijevozno sredstvo ima motor, tad ispisuje njegovu brzinu
    public void kojomBrzinom(int brzina){
        if(motor == true){
            System.out.println(getProizvodac() + " " + getModel() + " se kreće brzinom od " + brzina + " kilometara na sat.");

        } else {
            System.out.println( getTip() + " nema motor.");
        }
    }

    //metoda vraća string jer je tipa String
    public String opis(){
        return "Ovo je prijevozno sredstvo.";
    }


    public String toString(){
        return ("Tip:" + this.tip + ", proizvodac:" + this.proizvodac+ ", model:" + this.model+ ", boja:" + this.boja);
    }




}
