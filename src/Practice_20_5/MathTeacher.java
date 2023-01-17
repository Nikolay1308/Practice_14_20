package Practice_20_5;

public class MathTeacher extends Teacher{
    protected int math_skills;

    public MathTeacher(String name, int number_id, int math_skills) {
        super(name, number_id);
        this.math_skills = math_skills;
    }
}
