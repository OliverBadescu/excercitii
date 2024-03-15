package Casa;

import java.util.ArrayList;
import java.util.Scanner;

public class CasaService {

    public ArrayList<Casa> caseList = new ArrayList<>();
    public Scanner scanner = new Scanner(System.in);

    public void loadData() {

        Casa c1 = new Casa();
        c1.adresa = "Strada Florilor, nr. 10";
        c1.nrCamere = 3;
        c1.suprafata = 120;
        c1.anConstructie = 1998;
        c1.pret = 150000;
        c1.esteMobilata = true;

        Casa c2 = new Casa();
        c2.adresa = "Bulevardul Independentei, nr. 25";
        c2.nrCamere = 4;
        c2.suprafata = 150;
        c2.anConstructie = 2005;
        c2.pret = 200000;
        c2.esteMobilata = false;

        Casa c3 = new Casa();
        c3.adresa = "Strada Crinilor, nr. 7";
        c3.nrCamere = 5;
        c3.suprafata = 180;
        c3.anConstructie = 2010;
        c3.pret = 250000;
        c3.esteMobilata = true;

        Casa c4 = new Casa();
        c4.adresa = "Aleea Trandafirilor, nr. 15";
        c4.nrCamere = 4;
        c4.suprafata = 160;
        c4.anConstructie = 2008;
        c4.pret = 180000;
        c4.esteMobilata = true;

        Casa c5 = new Casa();
        c5.adresa = "Bulevardul Primaverii, nr. 30";
        c5.nrCamere = 6;
        c5.suprafata = 200;
        c5.anConstructie = 2015;
        c5.pret = 300000;
        c5.esteMobilata = false;

        Casa c6 = new Casa();
        c6.adresa = "Strada Bradului, nr. 12";
        c6.nrCamere = 3;
        c6.suprafata = 140;
        c6.anConstructie = 1995;
        c6.pret = 120000;
        c6.esteMobilata = true;

        Casa c7 = new Casa();
        c7.adresa = "Aleea Ghioceilor, nr. 8";
        c7.nrCamere = 5;
        c7.suprafata = 180;
        c7.anConstructie = 2000;
        c7.pret = 220000;
        c7.esteMobilata = true;

        Casa c8 = new Casa();
        c8.adresa = "Strada Iasomiei, nr. 20";
        c8.nrCamere = 4;
        c8.suprafata = 150;
        c8.anConstructie = 2012;
        c8.pret = 190000;
        c8.esteMobilata = false;

        Casa c9 = new Casa();
        c9.adresa = "Bulevardul Margaritarului, nr. 5";
        c9.nrCamere = 6;
        c9.suprafata = 220;
        c9.anConstructie = 2018;
        c9.pret = 320000;
        c9.esteMobilata = true;

        Casa c10 = new Casa();
        c10.adresa = "Strada Violetelor, nr. 18";
        c10.nrCamere = 3;
        c10.suprafata = 130;
        c10.anConstructie = 2003;
        c10.pret = 170000;
        c10.esteMobilata = false;


        caseList.add(c1);
        caseList.add(c2);
        caseList.add(c3);
        caseList.add(c4);
        caseList.add(c5);
        caseList.add(c6);
        caseList.add(c7);
        caseList.add(c8);
        caseList.add(c9);
        caseList.add(c10);
    }

    public void afisare() {
        for (int i = 0; i < caseList.size(); i++) {
            System.out.println(caseList.get(i).descriere());
        }
    }

    public Casa findCasaByAdresa(String adresa) {
        for (int i =0; i < caseList.size(); i++){
            if (caseList.get(i).adresa.equals(adresa)){

                return  caseList.get(i);


            }
        }
        return null;
    }

    public boolean adaugareCasa(Casa casa) {
        if (findCasaByAdresa(casa.adresa) != null) {
            return false;
        }
        caseList.add(casa);
        return true;
    }

    public boolean stergereCasa(String adresa) {
        Casa casa = findCasaByAdresa(adresa);
        if (casa != null) {
            caseList.remove(casa);
            return true;
        }
        return false;
    }

    public void editareCasa(Casa casa) {
        if (casa != null) {
            System.out.println("Ce doriti sa modificati?");
            System.out.println("1. Numar camere");
            System.out.println("2. Suprafata");
            System.out.println("3. An constructie");
            System.out.println("4. Pret");
            System.out.println("5. Este mobilata?");

            int alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {
                case 1:
                    System.out.println("Introduceti noul numar de camere:");
                    casa.nrCamere = Integer.parseInt(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Introduceti noua suprafata:");
                    casa.suprafata = Integer.parseInt(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Introduceti noul an de constructie:");
                    casa.anConstructie = Integer.parseInt(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Introduceti noul pret:");
                    casa.pret = Integer.parseInt(scanner.nextLine());
                    break;
                case 5:
                    System.out.println("Este mobilata? (true/false)");
                    casa.esteMobilata = Boolean.parseBoolean(scanner.nextLine());
                    break;
                default:
                    System.out.println("Tasta incorecta");
            }
            System.out.println("Datele casei au fost actualizate cu succes.");
        } else {
            System.out.println("Casa nu a fost gasita in lista.");
        }
    }



}
