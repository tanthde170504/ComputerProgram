package ComputerProgram;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        //loop until user want to exit
        while (true) {
            int choice = manager.mennu();
            switch (choice) {
                case 1:
                    manager.normalCalculator();
                    break;
                case 2:
                    manager.BMICalculator();
                    break;
                case 3:
                    return;
            }
        }

    }
}