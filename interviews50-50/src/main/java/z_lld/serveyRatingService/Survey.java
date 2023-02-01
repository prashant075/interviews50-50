package z_lld.serveyRatingService;

import java.util.List;

public class Survey extends BaseEntity {
    List<Questions> questions;
    int overAllRating;

    public Survey(int id, String name){
        this.id = id;
        this.name = name;
    }

    public List<Questions> getQuestions() {
        return questions;
    }

    public Survey setQuestions(List<Questions> questions) {
        this.questions = questions;
        return this;
    }

    public int getOverAllRating() {
        return overAllRating;
    }

    public Survey setOverAllRating(int overAllRating) {
        this.overAllRating = overAllRating;
        return this;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "questions=" + questions +
                ", overAllRating=" + overAllRating +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
