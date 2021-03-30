public class Bicikl extends PrijevoznoSredstvo {

    private int brojKotaca;



    public Bicikl( String boja, String model, String proizvodac,  int brojKotaca) {
        super("Bicikl", boja, model, proizvodac, false);

        this.brojKotaca = brojKotaca;

    }

    public int getBrojKotaca() {
        return brojKotaca;
    }

    public void setBrojKotaca(int brojKotaca) {
        this.brojKotaca = brojKotaca;
    }

    public void tricikl(){
        if(brojKotaca == 3){
            System.out.println("Bicikl jest zapravo tricikl!");
        }
    }

    @Override
    public void kojomBrzinom(int brzina) {
        super.kojomBrzinom(brzina);
    }

    public String opis(){
        return "Ovo je bicikl.";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
