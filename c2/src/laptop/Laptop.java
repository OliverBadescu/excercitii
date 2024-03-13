package laptop;

public class Laptop {

    public String marca;
    public String model;
    public int an;
    public int pret;
    public int stocareGB;
    public boolean uzat;
    public String procesor;
    public int ram;



    public String descriere(){

        String text = "";

        text += "Marca: " +this.marca + "\n";
        text += "Model: "+ this.model + "\n";
        text += "Pret: " +this.pret + "\n";
        text += "An: "  + this.an + "\n";
        text += "Stocare: " + this.stocareGB + "GB" + "\n";
        text += "Uzat: " + this.uzat + "\n";
        text += "Procesor: " +this.procesor + "\n";
        text += "Ram: " +this.ram + "\n";

        return text;

    }


}
