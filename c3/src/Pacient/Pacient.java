package Pacient;

public class Pacient {

    public String nume;
    public String prenume;
    public int varsta;
    public int kilograme;
    public int inaltime;


    public String descriere(){

        String text = "";

        text += "Nume: " +this.nume + "\n";
        text +="Prenume: " +this.prenume + "\n";
        text += "Varsta: " +this.varsta + "\n";
        text += "Kilograme: " + this.kilograme + "kg" + "\n";
        text += "Inaltime: " + this.inaltime + "cm" + "\n";

        return text;

    }


}
