package presentation;

import application.service.ApplicationManager;
import application.domain.ProblemBox;

import java.util.List;

public class ConsoleStatusBoard {

    //** singleton **//
    //** dependency injection **//
    private static ConsoleStatusBoard instance;
    private final ApplicationManager applicationManager;

    private ConsoleStatusBoard(ApplicationManager applicationManager) {
        this.applicationManager = applicationManager;
    }

    public static ConsoleStatusBoard getInstance(ApplicationManager applicationManager) {
        if (instance == null)
            ConsoleStatusBoard.instance = new ConsoleStatusBoard(applicationManager);
        return instance;
    }

    /** business logic **/
    public void printOverallStatus() {
        System.out.println("ConsoleStatusBoard.printOverallStatus");
        applicationManager.presentOverallStatus();
    }

    public void printUnsolved() {
        System.out.println("ConsoleStatusBoard.printUnsolved");
        List<ProblemBox> problemBoxList = applicationManager.presentUnsolved();
//        problemList.stream().forEach(System.out::println);
    }
}
