package Methods_course;

public class Teacher {

    String name;
    String no;
    String branch;

    Teacher(String name, String no, String branch){

        this.name= name;
        this.no= no;
        this.branch= branch;

    }

    void print () {

        System.out.println("name = " + this.name);
        System.out.println("tel no = " + this.no);
        System.out.println("branch = " + this.branch);

    }
}
