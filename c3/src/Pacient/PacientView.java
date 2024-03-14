package Pacient;

import java.util.Scanner;
import javax.print.DocFlavor;
import java.util.ArrayList;

public class PacientView {
    public PacientService pacientService = new PacientService();
    public Scanner scanner = new Scanner(System.in);

    public void meniu(){

        System.out.println("Apasati tasta 1 pentru a afisa lista de pacienti");
        System.out.println("Apasati tasta 2 pentru a adauga un pacient");
        System.out.println("Apasati tasta 3 pentru a sterge un pacient");
        System.out.println("Apasati tasta 4 pentru a edita datele unui pacient");

    }

    public void play(){

        pacientService.loadData();
        boolean running = true;
        while(running){

            meniu();
            int alegere = Integer.parseInt(scanner.nextLine());

            switch (alegere){
                case 1: pacientService.afisare();
                    break;
                case 2: adaugarePacient();
                    break;
                case 3: stergerePacient();
                    break;
                case 4: editarePacient();
                    break;
                default:
                    System.out.println("Tasta incorecta");
            }

        }

    }


    public void adaugarePacient(){

        System.out.println("Introduceti datele pacientului:");

        System.out.println("Nume: ");
        String nume = scanner.nextLine();
        System.out.println("Prenume: ");
        String prenume = scanner.nextLine();
        System.out.println("Varsta: ");
        int varsta= Integer.parseInt(scanner.nextLine());
        System.out.println("Inaltime: ");
        int inaltime = Integer.parseInt(scanner.nextLine());
        System.out.println("Kilograme:");
        int kilograme = Integer.parseInt(scanner.nextLine());

        Pacient nou = new Pacient();
        nou.nume = nume;
        nou.prenume = prenume;
        nou.varsta = varsta;
        nou.inaltime = inaltime;
        nou.kilograme = kilograme;

        if(!pacientService.adaugarePacient(nou)){
            System.out.println("Pacientul se afla deja in lista");

        }
        else{
            System.out.println("Pacientul a fost adaugat");
        }



    }

    public void stergerePacient(){

        System.out.println("Introduceti Numele si Prenumele pacientului care doriti sa fie sters din lista\n");
        System.out.println("Nume: ");
        String nume = scanner.nextLine();
        System.out.println("Prenume: ");
        String prenume = scanner.nextLine();

        if(pacientService.stergerePacient(nume, prenume)){

            System.out.println("Pacientul a fost sters");

        }else{
            System.out.println("Pacientul nu a fost gasit in lista");
        }


    }

    public void editarePacient(){

        System.out.println("Introduceti Numele si Prenumele pacientului care doriti sa fie editat\n");
        System.out.println("Nume: ");
        String nume = scanner.nextLine();
        System.out.println("Prenume: ");
        String prenume = scanner.nextLine();

        Pacient pacient = pacientService.gasestePacientDupaNumeSiPrenume(nume, prenume);

        pacientService.editarePacient(pacient);

    }

}
