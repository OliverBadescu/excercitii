package Ceas;



public class Ceas {

    public String marca;
    public String model;
    public int pret;
    public int anFabricatie;
    public boolean uzat;


    public String descriere(){

        String text = "";

        text += "Marca: " + this.marca + "\n";
        text += "Model: " + this.model + "\n";
        text += "Pret: " + this.pret +  "\n";
        text += "An fabricatie: " + this.anFabricatie + "\n";
        text += "Uzat: " + this.uzat + "\n";

        return text;
    }
}
