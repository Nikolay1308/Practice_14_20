package Practice_20_5;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher mathTeacher = new MathTeacher("T1", 565955, 9);
        Teacher historyTeacher = new HistoryTeacher("T2", 562145, "History");
        //System.out.println(mathTeacher.math_skills);//protected
        IdentifyTeacher(mathTeacher);
        IdentifyTeacher(historyTeacher);
        TeacherInfo(mathTeacher);
        TeacherInfo(historyTeacher);
    }
    public static void IdentifyTeacher(Teacher teacher) {
        if (teacher instanceof MathTeacher) {
            System.out.println("I'm math teacher");
        }else if (teacher instanceof HistoryTeacher) {
            System.out.println("I'm history teacher");
        }
    }
    public static void TeacherInfo(Teacher teacher) {
        if (teacher instanceof MathTeacher) {
            MathTeacher mathTeacher = (MathTeacher) teacher;
            System.out.println("Math skills : " + mathTeacher.math_skills);
        } else if (teacher instanceof HistoryTeacher) {
            HistoryTeacher historyTeacher = (HistoryTeacher) teacher;
            System.out.println("Field of profession : " + historyTeacher.field_of_profession);
        }
    }
}
