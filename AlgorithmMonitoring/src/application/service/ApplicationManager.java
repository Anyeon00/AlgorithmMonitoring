package application.service;

import application.domain.ProblemBox;

import java.util.List;

public interface ApplicationManager {

    // 1. 현황 보기 총 푼 문제, 총 못푼 문제 _전체&유형별
    void presentOverallStatus();

    // 2. 유형별로 못 푼 문제 보기
    List<ProblemBox> presentUnsolved();

}
