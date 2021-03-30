

//klasa Automobil nasljeđuje (extends) polja i metode iz klase PrijevoznoSredstvo
public class Automobil extends  PrijevoznoSredstvo{
    //najprije dodajem polje koje je karakteristično za automobil
    private boolean jeLiElektrican;

    //konstruktor koji povlači (super) polja iz klase PrijevoznoSredstvo i dodaje novo polje iz klase Automobil
    public Automobil( String boja, String model, String proizvodac, boolean motor, boolean jeLiElektrican) {
        super("Automobil", boja, model, proizvodac, motor);
        this.jeLiElektrican = jeLiElektrican;
    }



    public boolean isJeLiElektrican() {
        return jeLiElektrican;
    }

    public void setJeLiElektrican(boolean jeLiElektrican) {
        this.jeLiElektrican = jeLiElektrican;
    }

    //sljedeće su dvije metode prepisane iz klase PrijevoznoSredstvo, zbog toga imamo @Override
    @Override
    public void kojomBrzinom(int brzina) {
        super.kojomBrzinom(brzina);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String elektrican(){
        if(jeLiElektrican == true){
            return  "Automobil je električan";
        }
            return "Automobil nije električan";
    }

    public String opis(){
        return "Ovo je automobil.";
    }
}
