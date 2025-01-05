import config.ProgramConfig;
import presentation.ConsoleStatusBoard;
import problem.dp.Backjoon1003;

public class Main {
    public static void main(String[] args) {
        ProgramConfig config = ProgramConfig.getInstance();

        ConsoleStatusBoard board = config.makeUpPresentation();

        Backjoon1003 backjoon1003 = new Backjoon1003();

        board.printOverallStatus();
        board.printUnsolved();
//        System.out.println(new DP().getType());
    }

}
