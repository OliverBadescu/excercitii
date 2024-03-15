package Casa;

public class Casa {

    String adresa;
    int nrCamere;
    int suprafata;
    int anConstructie;
    int pret;
    boolean esteMobilata;


    public String descriere() {
        String text = "";
        text += "Adresa: " + this.adresa + "\n";
        text += "Număr camere: " + this.nrCamere + "\n";
        text += "Suprafață: " + this.suprafata + " mp" + "\n";
        text += "An construcție: " + this.anConstructie + "\n";
        text += "Preț: " + this.pret + " EUR" + "\n";
        text += "Este mobilată: " + this.esteMobilata  + "\n";
        return text;
    }


}
