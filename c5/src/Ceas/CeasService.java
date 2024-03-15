package Ceas;

import java.util.Scanner;
import javax.print.DocFlavor;
import java.util.ArrayList;

public class CeasService {

    public ArrayList<Ceas> ceasuri = new ArrayList<>();

    public Scanner scanner = new Scanner(System.in);

    public void loadData(){

        Ceas c1 = new Ceas();

        c1.marca = "Rolex";
        c1.model = "Submariner";
        c1.pret = 10000;
        c1.anFabricatie= 2010;
        c1.uzat = true;

        Ceas c2 = new Ceas();
        c2.marca = "Omega";
        c2.model = "Speedmaster Professional";
        c2.pret = 8000;
        c2.anFabricatie = 2015;
        c2.uzat = false;

        Ceas c3 = new Ceas();
        c3.marca = "Tag Heuer";
        c3.model = "Carrera";
        c3.pret = 6000;
        c3.anFabricatie = 2018;
        c3.uzat = true;

        Ceas c4 = new Ceas();
        c4.marca = "Patek Philippe";
        c4.model = "Nautilus";
        c4.pret = 50000;
        c4.anFabricatie = 2021;
        c4.uzat = false;

        Ceas c5 = new Ceas();
        c5.marca = "Audemars Piguet";
        c5.model = "Royal Oak";
        c5.pret = 30000;
        c5.anFabricatie = 2019;
        c5.uzat = true;

        Ceas c6 = new Ceas();
        c6.marca = "Breitling";
        c6.model = "Navitimer";
        c6.pret = 7000;
        c6.anFabricatie = 2017;
        c6.uzat = false;

        Ceas c7 = new Ceas();
        c7.marca = "Cartier";
        c7.model = "Tank";
        c7.pret = 12000;
        c7.anFabricatie = 2020;
        c7.uzat = true;

        Ceas c8 = new Ceas();
        c8.marca = "Hublot";
        c8.model = "Big Bang";
        c8.pret = 40000;
        c8.anFabricatie = 2016;
        c8.uzat = false;

        Ceas c9 = new Ceas();
        c9.marca = "Seiko";
        c9.model = "Prospex";
        c9.pret = 1000;
        c9.anFabricatie = 2014;
        c9.uzat = true;

        Ceas c10 = new Ceas();
        c10.marca = "Longines";
        c10.model = "Master Collection";
        c10.pret = 3000;
        c10.anFabricatie = 2013;
        c10.uzat = false;

        ceasuri.add(c1);
        ceasuri.add(c2);
        ceasuri.add(c3);
        ceasuri.add(c4);
        ceasuri.add(c5);
        ceasuri.add(c6);
        ceasuri.add(c7);
        ceasuri.add(c8);
        ceasuri.add(c9);
        ceasuri.add(c10);



    }

    public void afisare(){

        for (int i =0; i < ceasuri.size(); i++){
            System.out.println(ceasuri.get(i).descriere());
        }

    }

    public Ceas findByMarcaSiModel(String marca, String model){

        for (int i =0; i < ceasuri.size(); i++){
            if (ceasuri.get(i).marca.equals(marca) && ceasuri.get(i).model.equals(model)){

                return  ceasuri.get(i);


            }
        }
        return null;

    }

    public boolean adaugareCeas(Ceas ceas) {
        if (findByMarcaSiModel(ceas.model, ceas.marca) != null) {
            return false;
        }
        ceasuri.add(ceas);
        return true;
    }

    public boolean stergereCeas(String marca, String model) {
        Ceas ceas = findByMarcaSiModel(marca, model);
        if (ceas != null) {
            ceasuri.remove(ceas);
            return true;
        }
        return false;
    }

    public void editareCeas(Ceas ceas) {
        if (ceas != null) {
            System.out.println("Ce doriti sa modificati?");
            System.out.println("1. Pret");
            System.out.println("2. An fabricatie");
            System.out.println("3. Este uzat?");

            int alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {
                case 1:
                    System.out.println("Introduceti noul pret:");
                    ceas.pret = Integer.parseInt(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Introduceti noul an de fabricatie:");
                    ceas.anFabricatie = Integer.parseInt(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Este uzat?(true/false):");
                    ceas.uzat = Boolean.parseBoolean(scanner.nextLine());
                    break;
                default:
                    System.out.println("Tasta incorecta");
            }
            System.out.println("Datele ceasului au fost actualizate cu succes.");
        } else {
            System.out.println("Ceasul nu a fost gasit in lista.");
        }
    }
}
