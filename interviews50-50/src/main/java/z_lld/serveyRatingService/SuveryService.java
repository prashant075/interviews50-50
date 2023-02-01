package z_lld.serveyRatingService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuveryService {
    public static Map<Integer, Survey> surveyMap;
    public static Admin admin;
    public static Map<Integer, List<Survey>>  userSurveyList;

    public SuveryService(){
        admin = new Admin();
        userSurveyList  = new HashMap<>();
        surveyMap = new HashMap<>();
    }
    public void createSuvery(Integer id, Survey survey){
        surveyMap.put(id, survey);
    }
    public void assigneSurvey(Integer userId, Integer suerveyId){
       Survey survey = surveyMap.get(suerveyId);
       if(survey!=null){
           userSurveyList.computeIfAbsent(userId, k -> new ArrayList<>());
           userSurveyList.get(userId).add(survey);
       }
    }
    public void printServeyforUser(Integer userId){
        List<Survey> survey = userSurveyList.get(userId);
        System.out.println(survey);
    }

}
