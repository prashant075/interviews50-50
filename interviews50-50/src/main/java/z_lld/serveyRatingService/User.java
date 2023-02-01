package z_lld.serveyRatingService;

import java.util.*;

public class User extends BaseEntity{

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Map<Integer, Answers> submitFeedback(Survey survey){
        List<Questions> questions = survey.getQuestions();
        Map<Integer, Answers> answers =new HashMap<>();
        for(Questions _question:questions){
            for(Answers _ans:_question.getAnswersList()){
                answers.put(_question.getId(), _ans);
                break;
            }
        }
        return answers;
    }
}
