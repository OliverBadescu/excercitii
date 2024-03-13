package telefon;

import java.util.Scanner;

public class TelefonView {

    public TelefonService telefonService = new TelefonService();

    public Scanner scanner = new Scanner(System.in);


    public void meniu(){

        System.out.println("Apasati tasta 1 pentru a afisa lista de telefoane");
        System.out.println("Apasati tasta 2 pentru a adauga un telefon");
        System.out.println("Apasati tasta 3 pentru a sterge un telefon");
        System.out.println("Apasati tasta 4 pentru a edita datele unui telefon");

    }

    public void play(){

        telefonService.loadData();
        boolean running = true;
        while(running){

            meniu();
            int alegere = Integer.parseInt(scanner.nextLine());

            switch (alegere){
                case 1: telefonService.afisare();
                break;
                case 2: adaugareTelefon();
                break;
                case 3: stergereTelefon();
                break;
                case 4: editareTelefon();
                break;
                default:
                    System.out.println("Tasta incorecta");
            }

        }

    }


    public void adaugareTelefon(){

        System.out.println("Introduceti datele telefonului:");

        System.out.println("Marca: ");
        String marca = scanner.nextLine();
        System.out.println("Model: ");
        String model = scanner.nextLine();
        System.out.println("Pretul: ");
        int pret= Integer.parseInt(scanner.nextLine());
        System.out.println("Anul: ");
        int an = Integer.parseInt(scanner.nextLine());
        System.out.println("Este uzat?(true/false)");
        boolean uzat = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Capacitate:");
        int capacitate = Integer.parseInt(scanner.nextLine());

        Telefon nou = new Telefon();
        nou.marca = marca;
        nou.model = model;
        nou.pret = pret;
        nou.an = an;
        nou.uzat= uzat;
        nou.capacitate = capacitate;

        if(!telefonService.adaugareTelefon(nou)){
            System.out.println("Telefonul se afla deja in lista");

        }
        else{
            System.out.println("Telefonul a fost adaugat");
        }



    }

    public void stergereTelefon(){

        System.out.println("Introduceti Marca si Modelul telefonului care doriti sa fie sters din lista\n");
        System.out.println("Marca: ");
        String marca = scanner.nextLine();
        System.out.println("Modelul: ");
        String model = scanner.nextLine();

        if(telefonService.stergereTelefon(marca, model)){

            System.out.println("Telefonul a fost sters");

        }else{
            System.out.println("Telefonul nu a fost gasit in lista");
        }


    }

    public void editareTelefon(){

        System.out.println("Introduceti Marca si Modelul telefonului care doriti sa fie editat\n");
        System.out.println("Marca: ");
        String marca = scanner.nextLine();
        System.out.println("Modelul: ");
        String model = scanner.nextLine();

        Telefon telefon = telefonService.findTelefonByMarcaSiModel(marca, model);

        telefonService.editareTelefon(telefon);

    }

}
