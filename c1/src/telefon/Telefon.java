package telefon;

public class Telefon {

    public String marca;
    public String model;
    public int an;
    public int pret;
    public int capacitate;
    public boolean uzat;


    public String descriere(){

        String text = "";

        text += "Marca: " +this.marca + "\n";
        text += "Model: "+ this.model + "\n";
        text += "Pret: " +this.pret + "\n";
        text += "An: "  + this.an + "\n";
        text += "Capacitate: " + this.capacitate + "GB" + "\n";
        text += "Uzat: " + this.uzat + "\n";

        return text;

    }


}
