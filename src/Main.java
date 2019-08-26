import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        simulation.loadItems("phase-1.txt"); //loading item lists for phase one from text file
        ArrayList rocketsU1 = simulation.loadU1(simulation.itemArrayList); // loading U1 rocket
        ArrayList rocketsU2 = simulation.loadU2(simulation.itemArrayList); // loading U1 rocket

        System.out.println("u1 rockets: "+rocketsU1);
        System.out.println("u2 rockets: "+rocketsU2);
        System.out.println();

        simulation.runSimulationU1(rocketsU1);
        simulation.runSimulationU2(rocketsU1);


        simulation = new Simulation();
        simulation.loadItems("phase-2.txt"); //loading item lists for phase one from text file
        rocketsU1 = simulation.loadU1(simulation.itemArrayList); // loading U1 rocket
        rocketsU2 = simulation.loadU2(simulation.itemArrayList); // loading U1 rocket

        System.out.println("u1 rockets: "+rocketsU1);
        System.out.println("u2 rockets: "+rocketsU2);
        System.out.println();

        simulation.runSimulationU1(rocketsU1);
        simulation.runSimulationU2(rocketsU1);




    }
}
