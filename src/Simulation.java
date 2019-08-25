import javax.sound.midi.Soundbank;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public ArrayList itemArrayList = new ArrayList();

    public ArrayList loadItems(String textFile){ //TODO wypełnić metodą wczytującą plik

        try {
            itemArrayList.clear();
            System.out.println();
            System.out.println("Loading "+textFile);
            System.out.println();
            File file = new File(textFile);
            Scanner scanner = new Scanner(file);

            while ( scanner.hasNextLine()){
                itemArrayList.add(scanner.nextLine());
            }
            scanner.close();
        }
        catch (Exception e){
            System.out.println("EXCEPTION: "+e);
        }
        return itemArrayList;
    }


    public int loadU1(ArrayList itemArrayList){
        U1 u1 = new U1();

        int u1RocketsCount = 1; // starting with first rocket to fill
        int singleItemWeight = 0;
        double limit = u1.cargoLimit;
        double initialCargoLimit = u1.cargoLimit;
        ArrayList u1Rockets = new ArrayList();
        int cargoCarried = 0;

        System.out.println();
        System.out.println("Starting loading U1 rockets.");

        for (Object i: itemArrayList){

//            System.out.println(i);
            String line = String.valueOf(i.toString().split("=")[1]);
            singleItemWeight = Integer.parseInt(line);

//            System.out.println("Limit: "+limit);
//            System.out.println("Item: "+ singleItemWeight);

            if ((limit - singleItemWeight) >= 0) {
                cargoCarried += singleItemWeight;
                limit -= singleItemWeight;
            }
            else {
                u1Rockets.add(cargoCarried);

//                System.out.println();
//                System.out.println("adding rocket: "+u1Rockets.size());
//                System.out.println(u1Rockets);
//                System.out.println();

                limit = initialCargoLimit;

                cargoCarried = 0;

                cargoCarried += singleItemWeight;

                limit -= singleItemWeight;
            }

//            System.out.println("Cargo carried: "+cargoCarried);
//            System.out.println();
        }

        if (cargoCarried > 0){
            u1Rockets.add(cargoCarried);
        }

        System.out.println(u1Rockets);
        return u1Rockets.size();
    }


    public int loadU2(ArrayList itemArrayList){
        U2 u2 = new U2();

        int u1RocketsCount = 1; // starting with first rocket to fill
        int singleItemWeight = 0;
        double limit = u2.cargoLimit;
        double initialCargoLimit = u2.cargoLimit;
        ArrayList u2Rockets = new ArrayList();
        int cargoCarried = 0;

        System.out.println();
        System.out.println("Starting loading U2 rockets.");

        for (Object i: itemArrayList){

//            System.out.println(i);
            String line = String.valueOf(i.toString().split("=")[1]);
            singleItemWeight = Integer.parseInt(line);

//            System.out.println("Limit: "+limit);
//            System.out.println("Item: "+ singleItemWeight);

            if ((limit - singleItemWeight) >= 0) {
                cargoCarried += singleItemWeight;
                limit -= singleItemWeight;
            }
            else {
                u2Rockets.add(cargoCarried);

//                System.out.println();
//                System.out.println("adding rocket: "+u2Rockets.size());
//                System.out.println(u2Rockets);
//                System.out.println();

                limit = initialCargoLimit;

                cargoCarried = 0;

                cargoCarried += singleItemWeight;

                limit -= singleItemWeight;
            }

//            System.out.println("Cargo carried: "+cargoCarried);
//            System.out.println();
        }

        if (cargoCarried > 0){
            u2Rockets.add(cargoCarried);
        }

        System.out.println(u2Rockets);
        return u2Rockets.size();
    }


}
