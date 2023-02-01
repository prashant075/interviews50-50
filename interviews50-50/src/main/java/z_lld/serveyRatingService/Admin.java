package z_lld.serveyRatingService;

public class Admin extends BaseEntity{

    public Admin() {
        this.id =1;
        this.name = "Admin";
    }

    public void createServey(){

    }
    public Questions createQuestions(int id, String name){
        Questions questions = new Questions(id,name);
        return questions;
    }
    public void addQuestiontoServey(){

    }
    public void addServeytoUser(){

    }
}
