package rozarpay;

import java.util.List;

public class SuerveyService {
    List<Questions> questionsList;

    public List<Questions> getQuestionsList() {
        return questionsList;
    }

    public SuerveyService setQuestionsList(List<Questions> questionsList) {
        this.questionsList = questionsList;
        return this;
    }
}
