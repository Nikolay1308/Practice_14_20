package Practice_20_5;

 public class Teacher {
    protected String name;
    protected int number_id;

     public Teacher(String name, int number_id) {
         this.name = name;
         this.number_id = number_id;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setNumber_id(int number_id) {
         this.number_id = number_id;
     }

     public String getName() {
         return name;
     }

     public int getNumber_id() {
         return number_id;
     }

     @Override
     public String toString() {
         return "Teacher{" +
                 "name='" + name + '\'' +
                 ", number_id=" + number_id +
                 '}';
     }
 }
