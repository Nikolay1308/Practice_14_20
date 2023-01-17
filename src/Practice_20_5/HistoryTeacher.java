package Practice_20_5;

public class HistoryTeacher extends Teacher{
    protected String field_of_profession;

    public HistoryTeacher(String name, int number_id, String field_of_profession) {
        super(name, number_id);
        this.field_of_profession = field_of_profession;
    }
}
