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
            System.out.println("Loading materials from "+textFile);
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


    public ArrayList loadU1(ArrayList itemArrayList){
        U1 u1 = new U1();

        int u1RocketsCount = 1; // starting with first rocket to fill
        int singleItemWeight = 0;
        double limit = u1.cargoLimit;
        double initialCargoLimit = u1.cargoLimit;
        ArrayList u1Rockets = new ArrayList();
        int cargoCarried = 0;

//        System.out.println();
//        System.out.println("Starting loading U1 rockets.");

        for (Object i: itemArrayList){
            String line = String.valueOf(i.toString().split("=")[1]);
            singleItemWeight = Integer.parseInt(line);

            if ((limit - singleItemWeight) >= 0) {
                cargoCarried += singleItemWeight;
                limit -= singleItemWeight;
            }
            else {
                u1Rockets.add(cargoCarried);
                limit = initialCargoLimit;
                cargoCarried = 0;
                cargoCarried += singleItemWeight;
                limit -= singleItemWeight;
            }
        }

        if (cargoCarried > 0){
            u1Rockets.add(cargoCarried);
        }

        return u1Rockets;
    }


    public ArrayList loadU2(ArrayList itemArrayList){
        U2 u2 = new U2();

        int u1RocketsCount = 1; // starting with first rocket to fill
        int singleItemWeight = 0;
        double limit = u2.cargoLimit;
        double initialCargoLimit = u2.cargoLimit;
        ArrayList u2Rockets = new ArrayList();
        int cargoCarried = 0;
//
//        System.out.println();
//        System.out.println("Starting loading U2 rockets.");

        for (Object i: itemArrayList){

            String line = String.valueOf(i.toString().split("=")[1]);
            singleItemWeight = Integer.parseInt(line);

            if ((limit - singleItemWeight) >= 0) {
                cargoCarried += singleItemWeight;
                limit -= singleItemWeight;
            }
            else {
                u2Rockets.add(cargoCarried);
                limit = initialCargoLimit;
                cargoCarried = 0;
                cargoCarried += singleItemWeight;
                limit -= singleItemWeight;
            }
        }

        if (cargoCarried > 0){
            u2Rockets.add(cargoCarried);
        }

        //System.out.println(u2Rockets);
        return u2Rockets;
    }

    public int runSimulationU1 (ArrayList rocketList) {
        int goodCount = 0;
        int crashcount = 0;
        U1 u1 = new U1();

        for (Object rocket : rocketList) {
            while (!u1.launch((Integer) rocket) || !u1.land((Integer) rocket)) {
                crashcount++;
            }
            goodCount++;
        }

        System.out.println();
        System.out.println("Total project cost of launching U1 rockets for phase 1 is:");
        System.out.println();
        System.out.println("U1 rockets crashed (" + crashcount + ") * cost of " + u1.cost + " (millions) = " + crashcount * u1.cost + " (millions)");
        System.out.println("U1 rockets succeeded (" + goodCount + ") * cost of " + u1.cost + " (millions) = " + goodCount * u1.cost + " (millions)");
        System.out.println();
        int totalU1cost = crashcount * u1.cost + goodCount * u1.cost;
        System.out.println("Total: " + totalU1cost + " millions");
        System.out.println();

        return totalU1cost;
    }

        public int runSimulationU2 (ArrayList rocketList) {

        int goodCount = 0;
        int crashcount = 0;
        U2 u2 = new U2();

        for(Object rocket: rocketList){
            while (!u2.launch((Integer) rocket) || !u2.land((Integer) rocket)){
                crashcount++;
            }
            goodCount++;
        }

            System.out.println();
            System.out.println("Total project cost of launching U2 rockets for this phase is:");
            System.out.println();
            System.out.println("U2 rockets crashed ("+crashcount+") * cost of "+u2.cost+" (millions) = "+crashcount * u2.cost+" (millions)");
            System.out.println("U2 rockets succeeded ("+goodCount+") * cost of "+u2.cost+" (millions) = "+goodCount * u2.cost+" (millions)");
            System.out.println();
            int totalU2cost = crashcount*u2.cost + goodCount*u2.cost;
            System.out.println("Total: "+totalU2cost+" millions");
            System.out.println();

            return totalU2cost;
        }
    }

