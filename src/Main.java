public class Main {
    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        simulation.loadItems("phase-1.txt"); //loading item lists for phase one from text file
        simulation.loadU1(simulation.itemArrayList); // loading U1 rocket
        simulation.loadU2(simulation.itemArrayList); // loading U2 rocket
        simulation.loadItems("phase-2.txt"); //loading item lists for phase one from text file
        simulation.loadU1(simulation.itemArrayList); // loading U1 rocket
        simulation.loadU2(simulation.itemArrayList); // loading U2 rocket


    }
}
