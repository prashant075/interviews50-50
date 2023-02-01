package z_lld.serveyRatingService;

import java.util.Arrays;
import java.util.Map;

public class SurveyMain {
    public static void main(String[] args) {
        SuveryService service = new SuveryService();
        Admin admin= SuveryService.admin;
        Survey survey = new Survey(1,"new Surevy");
        Questions questions1 = admin.createQuestions(1,"What is FeedBack");
        Answers answers1 = new Answers(1,"Good",1);
        Answers answers2 = new Answers(2,"Bad",2);
        questions1.addAnswers(answers1);
        questions1.addAnswers(answers2);
        survey.setQuestions(Arrays.asList(questions1));
        User user = new User(1,"Prashant");
        service.createSuvery(survey.id, survey);
        service.assigneSurvey(1,1);
        service.printServeyforUser(1);
        Map<Integer, Answers> answersList= user.submitFeedback(survey);
        System.out.println(answersList);

    }
}
