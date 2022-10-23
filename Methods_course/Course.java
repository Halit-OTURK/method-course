package Methods_course;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course (String name, String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;

        int note=0;

    }
    void addTeacher(Teacher teacher){

        if (teacher.branch.equalsIgnoreCase(this.prefix)){
        this.teacher=teacher;
        } else System.err.println("teacher's branch and prefix didn't match");


    }
    void printTeacher(){
        this.teacher.print();

    }

}
