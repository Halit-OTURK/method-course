package Methods_course;

public class Main {

    public static void main(String[] args) {
        // Scanner class same logic

        Teacher t1 = new Teacher("Gülcan Oturak", "505501", "Math");
        Teacher t2 = new Teacher("Yusuf Tekin", "551178", "Volley");
        Teacher t3 = new Teacher("Ayşe Hoca", "0551123", "Turkish");
        Course Math = new Course("mathematic", "501", "Math");
        Course Volley = new Course("volleyball", "601", "Volley");
        Course Turkish = new Course("Turkish", "101", "Turkish");

        Math.addTeacher(t1);

        Volley.addTeacher(t2);

        Turkish.addTeacher(t3);


        Students s1 = new Students("Hamza", "138", "1/D", Math, Volley, Turkish);

        s1.addBulkExamNote(100,98,97);
        s1.isPassed();

        Students s2 = new Students("Ali Osman", "135","11/C",Math,Volley,Turkish);
        s2.addBulkExamNote(90,60,10);
        s2.isPassed();



        }


    }

