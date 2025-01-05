package application.service;

import application.domain.ProblemBox;

import java.util.List;

public class ApplicationManagerImpl implements ApplicationManager {

    //** singleton **//
    private static ApplicationManagerImpl instance;
    private final ProblemBox problemBox;

    private ApplicationManagerImpl(ProblemBox problemBox) {
        this.problemBox = problemBox;
        init();
    }
    private void init() {
        //runtime시 자동으로
        // 1. 문제등록
//        setProblemBox();
        // 2. 각 문제들 실행
        //대강스트림으로스레드로돌리는코드
        // 3. 문제 성공/실패 집계
        //위 스트림에서 끝난 후에 성공여부 바로 data member에 저장
    }

    public static ApplicationManagerImpl getInstance(ProblemBox problemBox) {
        if (instance == null) {
            ApplicationManagerImpl.instance = new ApplicationManagerImpl(problemBox);
        }
        return instance;
    }

    //** business logic **//
    @Override
    public void presentOverallStatus() {
//        problemBox
    }

    @Override
    public List<ProblemBox> presentUnsolved() {
        return null;
    }
}
