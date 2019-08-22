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

    public int loadU1(ArrayList itemArrayList1){
        U1 u1 = new U1();


        int cargoLoaded = 0;
        int singleItemWeight = 0;
        int numberOfRocketsLoaded = 1;

        String tempString = "";

        try {
            for (int i = itemArrayList1.size()-1; i >= 0; i--){
//                System.out.println(itemArrayList1.get(i));
                tempString = itemArrayList1.get(i).toString();
                singleItemWeight = Integer.parseInt(tempString.split("=")[1]);
                cargoLoaded = cargoLoaded + singleItemWeight;
            }
//            System.out.println("U1 cargo loaded: "+cargoLoaded);
//            System.out.println("U1 cargo limit: "+u1.getCargoLimit());

            double lastRocketWeight = cargoLoaded % u1.getCargoLimit();
            System.out.println("Modulo " + lastRocketWeight);
            numberOfRocketsLoaded = (int) Math.ceil(cargoLoaded/u1.getCargoLimit());
            System.out.println("U1 rockets loaded: "+numberOfRocketsLoaded);

        } catch (Exception e){
            System.out.println("Exception: "+e);
        }
        return numberOfRocketsLoaded;
    }

    public int loadU2(ArrayList itemArrayList2){
        U2 u2 = new U2();
        ArrayList rocketLoaded = new ArrayList();

        int cargoLoaded = 0; // total amount of cargo loaded to all rockets
        int singleItemWeight = 0;
        int numberOfRocketsLoaded = 0;

        String tempString = "";

        try {
            for (int i = itemArrayList2.size()-1; i >= 0; i--){
//                System.out.println(itemArrayList2.get(i));
                tempString = itemArrayList2.get(i).toString();
                singleItemWeight = Integer.parseInt(tempString.split("=")[1]);
                cargoLoaded = cargoLoaded + singleItemWeight;



            }
//            System.out.println("U2 cargo loaded: "+cargoLoaded);
//            System.out.println("U2 cargo limit: "+u2.getCargoLimit());
            double lastRocketWeight = cargoLoaded % u2.getCargoLimit();
            System.out.println("Modulo " + lastRocketWeight);
            numberOfRocketsLoaded = (int) Math.ceil(cargoLoaded/u2.getCargoLimit());
            System.out.println("U2 rockets loaded: "+numberOfRocketsLoaded);



        } catch (Exception e){
            System.out.println("Exception: "+e);
        }
        return (int) numberOfRocketsLoaded; //TODO do arraylisty wpisać wagę poszczególnych rakiet, żeby móc je przetestować, czy mogą lądować i startować, każda musi mieć określoną wage

    }


}
