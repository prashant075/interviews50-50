package rozarpay;

import java.util.List;
import java.util.Map;

public class User extends BaseEntity {

    Map<Integer, List<Answers>> answersList;
    public void  sunbmitSuvery(Survey survey){
        for(Questions _questions : survey.getQuestion()){
            for(Answers answers: _questions.getAnswers()){

            }
        }
    }

}
