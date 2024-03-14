package Pacient;

import java.util.Scanner;
import javax.print.DocFlavor;
import java.util.ArrayList;

public class PacientService {

    public ArrayList<Pacient> pacients = new ArrayList<>();
    public Scanner scanner = new Scanner(System.in);

    public void loadData(){

        Pacient p1 = new Pacient();

        p1.nume = "Hagiu";
        p1.prenume = "Alex";
        p1.varsta = 19;
        p1.kilograme = 80;
        p1.inaltime = 179;

        Pacient p2 = new Pacient();
        p2.nume = "Popescu";
        p2.prenume = "Maria";
        p2.varsta = 42;
        p2.kilograme = 65;
        p2.inaltime = 165;

        Pacient p3 = new Pacient();
        p3.nume = "Ionescu";
        p3.prenume = "Ion";
        p3.varsta = 56;
        p3.kilograme = 90;
        p3.inaltime = 175;

        Pacient p4 = new Pacient();
        p4.nume = "Vasilescu";
        p4.prenume = "Andreea";
        p4.varsta = 35;
        p4.kilograme = 55;
        p4.inaltime = 160;

        Pacient p5 = new Pacient();
        p5.nume = "Gheorghe";
        p5.prenume = "Ana";
        p5.varsta = 28;
        p5.kilograme = 70;
        p5.inaltime = 170;

        Pacient p6 = new Pacient();
        p6.nume = "Radu";
        p6.prenume = "Marius";
        p6.varsta = 50;
        p6.kilograme = 75;
        p6.inaltime = 180;

        Pacient p7 = new Pacient();
        p7.nume = "Stoica";
        p7.prenume = "Elena";
        p7.varsta = 65;
        p7.kilograme = 60;
        p7.inaltime = 155;

        Pacient p8 = new Pacient();
        p8.nume = "Dumitru";
        p8.prenume = "Andrei";
        p8.varsta = 33;
        p8.kilograme = 85;
        p8.inaltime = 170;

        Pacient p9 = new Pacient();
        p9.nume = "Dragomir";
        p9.prenume = "Cristina";
        p9.varsta = 47;
        p9.kilograme = 75;
        p9.inaltime = 165;

        Pacient p10 = new Pacient();
        p10.nume = "Antonescu";
        p10.prenume = "Dan";
        p10.varsta = 60;
        p10.kilograme = 95;
        p10.inaltime = 175;


        pacients.add(p1);
        pacients.add(p2);
        pacients.add(p3);
        pacients.add(p4);
        pacients.add(p5);
        pacients.add(p6);
        pacients.add(p7);
        pacients.add(p8);
        pacients.add(p9);
        pacients.add(p10);


    }

    public void afisare(){

        for (int i =0 ; i < pacients.size(); i++){
            System.out.println(pacients.get(i).descriere());
        }

    }

    public Pacient gasestePacientDupaNumeSiPrenume(String nume, String prenume){

        for (int i = 0; i < pacients.size(); i++){
            if (pacients.get(i).nume.equals(nume) && pacients.get(i).prenume.equals(prenume)){
                return pacients.get(i);
            }
        }
        return null;
    }

    public boolean adaugarePacient(Pacient pacient){

        if(this.gasestePacientDupaNumeSiPrenume(pacient.nume, pacient.prenume)!= null){
            return false;
        }
        this.pacients.add(pacient);
        return true;

    }

    public boolean stergerePacient(String nume, String prenume){

        for (int i =0 ; i < pacients.size(); i++){

            if (pacients.get(i).nume.equals(nume) && pacients.get(i).prenume.equals(prenume)){
                this.pacients.remove(pacients.get(i));
                return true;
            }

        }
        return false;

    }

    public void editarePacient(Pacient pacient){

        if (pacient != null) {

            System.out.println("Ce doriti sa modificati?");
            String alegere = scanner.nextLine();
            switch (alegere) {
                case "varsta":
                    System.out.println("Introduceti noua varsta:");
                    pacient.varsta = Integer.parseInt(scanner.nextLine());
                    break;
                case "kilograme":
                    System.out.println("Introduceti noile kilograme:");
                    pacient.kilograme = Integer.parseInt(scanner.nextLine());
                    break;
                case "inaltime":
                    System.out.println("Introduceti noua inaltime:");
                    pacient.inaltime = Integer.parseInt(scanner.nextLine());
                    break;
                default:
                    System.out.println("Date incorecte");



            }
            System.out.println("Datele pacientului au fost actualizate cu succes.");
        }else{
            System.out.println("Pacientul nu a fost gasita in lista.");
        }

    }



}
