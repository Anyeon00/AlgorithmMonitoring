package config;

import application.domain.ProblemBox;
import application.service.ApplicationManager;
import application.service.ApplicationManagerImpl;
import presentation.ConsoleStatusBoard;

public class ProgramConfig {

    //** singleton **//
    private static final ProgramConfig instance = new ProgramConfig();
    private ProgramConfig() {
    }

    public static ProgramConfig getInstance() {
        return instance;
    }

    //** aggregation **//
    public ConsoleStatusBoard makeUpPresentation() {
        return ConsoleStatusBoard.getInstance(applicationManager());
    }

    private ApplicationManager applicationManager() {
        return ApplicationManagerImpl.getInstance(problemBox());
    }

    private ProblemBox problemBox() {
        return ProblemBox.getInstance();
    }


}
