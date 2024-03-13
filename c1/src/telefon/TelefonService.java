package telefon;

import java.util.Scanner;
import javax.print.DocFlavor;
import java.util.ArrayList;

public class TelefonService {

    public ArrayList<Telefon> telefoane = new ArrayList<>();
    public Scanner scanner = new Scanner(System.in);

    public void loadData(){

        Telefon t1= new Telefon();

        t1.marca = "Iphone";
        t1.model = "7";
        t1.pret = 2500;
        t1.an = 2017;
        t1.uzat = true;
        t1.capacitate = 128;

        Telefon t2 = new Telefon();
        t2.marca = "Samsung";
        t2.model = "Galaxy S9";
        t2.pret = 2000;
        t2.an = 2018;
        t2.uzat = false;
        t2.capacitate = 64;

        Telefon t3 = new Telefon();
        t3.marca = "Huawei";
        t3.model = "P30 Pro";
        t3.pret = 3000;
        t3.an = 2019;
        t3.uzat = false;
        t3.capacitate = 256;

        Telefon t4 = new Telefon();
        t4.marca = "OnePlus";
        t4.model = "8 Pro";
        t4.pret = 3500;
        t4.an = 2020;
        t4.uzat = false;
        t4.capacitate = 128;

        Telefon t5 = new Telefon();
        t5.marca = "Xiaomi";
        t5.model = "Mi 11";
        t5.pret = 1800;
        t5.an = 2021;
        t5.uzat = false;
        t5.capacitate = 256;

        Telefon t6 = new Telefon();
        t6.marca = "Google";
        t6.model = "Pixel 5";
        t6.pret = 1500;
        t6.an = 2020;
        t6.uzat = true;
        t6.capacitate = 128;

        Telefon t7 = new Telefon();
        t7.marca = "Sony";
        t7.model = "Xperia 1 II";
        t7.pret = 2300;
        t7.an = 2020;
        t7.uzat = false;
        t7.capacitate = 256;

        Telefon t8 = new Telefon();
        t8.marca = "Iphone";
        t8.model = "X";
        t8.pret = 1000;
        t8.an = 2020;
        t8.uzat = true;
        t8.capacitate = 64;

        Telefon t9 = new Telefon();
        t9.marca = "Iphone";
        t9.model = "15";
        t9.pret = 4000;
        t9.an = 2023;
        t9.uzat = false;
        t9.capacitate = 256;

        Telefon t10 = new Telefon();
        t10.marca = "Iphone";
        t10.model = "13";
        t10.pret = 3000;
        t10.an = 2020;
        t10.uzat = false;
        t10.capacitate = 128;

        telefoane.add(t1);
        telefoane.add(t2);
        telefoane.add(t3);
        telefoane.add(t4);
        telefoane.add(t5);
        telefoane.add(t6);
        telefoane.add(t7);
        telefoane.add(t8);
        telefoane.add(t9);
        telefoane.add(t10);


    }

    public void afisare(){

        for (int i =0 ; i < telefoane.size();i++){

            System.out.println(telefoane.get(i).descriere());

        }

    }

    public Telefon findTelefonByMarcaSiModel(String marcaTelefon, String modelTelefon){

        for (int i =0; i < telefoane.size(); i++){
            if (telefoane.get(i).marca.equals(marcaTelefon) && telefoane.get(i).model.equals(modelTelefon)){

                return  telefoane.get(i);


            }
        }

        return null;

    }

    public boolean adaugareTelefon(Telefon telefon){
        if(this.findTelefonByMarcaSiModel(telefon.marca,telefon.model)!=null){

            return false;
        }
        this.telefoane.add(telefon);
        return true;


    }

    public boolean stergereTelefon(String marcaTelefon, String modelTelefon){

        for (int i =0; i < telefoane.size(); i++){
            if (telefoane.get(i).marca.equals(marcaTelefon) && telefoane.get(i).model.equals(modelTelefon)){


                telefoane.remove(telefoane.get(i));
                return true;

            }
        }

        return false;

    }

    public void editareTelefon(Telefon telefon){


        if (telefon != null) {

            System.out.println("Ce doriti sa modificati?");
            String alegere = scanner.nextLine();
            switch (alegere) {
                case "an":
                    System.out.println("Introduceti noul an:");
                    telefon.an = Integer.parseInt(scanner.nextLine());
                    break;
                case "pret":
                    System.out.println("Introduceti noul pret:");
                    telefon.pret = Integer.parseInt(scanner.nextLine());
                    break;
                case "capacitate":
                    System.out.println("Introduceti noua capacitate:");
                    telefon.capacitate = Integer.parseInt(scanner.nextLine());
                    break;
                case "uzat":
                    System.out.println("Introduceti daca este uzat: (true/false)");
                    telefon.uzat = Boolean.parseBoolean(scanner.nextLine());
                    break;
                default:
                    System.out.println("Date incorecte");



            }
            System.out.println("Datele telefonului au fost actualizate cu succes.");
        }else{
            System.out.println("Telefonul nu a fost gasita in lista.");
        }

    }

}
