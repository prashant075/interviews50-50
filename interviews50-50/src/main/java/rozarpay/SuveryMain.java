package rozarpay;

import java.util.*;

public class SuveryMain {
    public void test(){
        Admin admin = new Admin();
        Questions questions= admin.createQuestionAndAnswer();
        Survey survey = new Survey();
        survey.setQuestion(Collections.singletonList(questions));
        User user = new User();
        Map<User, List<Survey>> userSueryMap = new HashMap<>();
        userSueryMap.put(user,Collections.singletonList(survey));
        Map<Integer, List<Integer>> answersForQuestion = new HashMap<>();
        answersForQuestion.put(1, Arrays.asList(1,4));

    }
}

/*
* I need to prepare more for this round many basic feature I am missing which I don't think I can complete in 20 min time frame
* */