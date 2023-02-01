package rozarpay;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Admin extends BaseEntity {
    List<Questions> questions;

    public List<Questions> getQuestions() {
        return questions;
    }

    public Admin setQuestions(List<Questions> questions) {
        this.questions = questions;
        return this;
    }
    public Questions createQuestionAndAnswer() {
        Questions questions = new Questions();
        questions.setName("How well did you do this round?");
        questions.setId(1);
        Answers answers1 = new Answers();
        answers1.setName("Very Poor");
        answers1.setId(1);
        Answers answers2 = new Answers();
        answers1.setName("Poor");
        answers1.setId(2);
        Answers answers3 = new Answers();
        answers1.setName("Average");
        answers1.setId(3);
        Answers answers4 = new Answers();
        answers1.setName("Good");
        answers1.setId(4);
        Answers answers5 = new Answers();
        answers1.setName("Very Poor");
        answers1.setId(5);
        List<Answers> answersList = Arrays.asList(answers1,answers2,answers3,answers4,answers5);
        questions.setAnswers(answersList);
        return questions;
    }
    //showQuestionOverAllRating(Question);

}
