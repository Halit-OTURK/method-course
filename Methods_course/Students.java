package Methods_course;

public class Students {
    Course c1;
    Course c2;
    Course c3;


    String name;
    String number;
    String classes;
    double avarage;
    boolean isPass;

    Students(String name, String number, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.number = number;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;// starting value is false

    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if(note1>=0&&note1<=100){
            c1.note = note1;}

        if (note2>=0&&note2<=100){
        c2.note = note2;}

        if(note3>=0&&note3<=100){
        c3.note = note3;}
    }

     void isPassed(){
        this.avarage=(this.c1.note+this.c2.note+this.c3.note)/3.0;

         printNote();

        if (this.avarage>55){
            System.out.println("you passed");
        }else{
            System.out.println("you failed!");
        }
         System.out.println("your avarage: "+ this.avarage);


     }
    void printNote(){

        System.out.println(c1.name+" : "+c1.note);
        System.out.println(c2.name+" : "+c2.note);
        System.out.println(c3.name+"\t\t"+" : "+c3.note);
    }
}
