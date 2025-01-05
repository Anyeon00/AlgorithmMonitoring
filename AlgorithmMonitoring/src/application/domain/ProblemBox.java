package application.domain;

import java.util.ArrayList;
import java.util.HashSet;

public class ProblemBox {
    //** singleton **//
    private static ProblemBox instance;

    private ProblemBox() {
    }

    public static ProblemBox getInstance() {
        if (instance == null) {
            ProblemBox.instance = new ProblemBox();
        }
        return instance;
    }

    //** data member **//
    ArrayList<Problem> problems = new ArrayList<>();
    // 탐색 기준 : type, result
    // -> 나중에 반정규화해놓기(분류해서 따로 저장)
    // -> SQL쓰면 index 걸기

    //** business logic **//
    //ProblemBox에 Problem 넣기
    //reflection으로 찾아서 넣기?
    //어떻게 넣을지

    //1. 해당 문제에서 직접 넣는다
    //2. Box가 찾아서 넣는다
    //3. ApplicationManager가 찾아서 넣는다.

    //1. reflection으로 찾아서 넣는다.
    //2. 문제가 직접 들어간다.
}
