package HW1;

public class University {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        Teacher teacher1=new Teacher();
        Teacher teacher2=new Teacher();

        Student one=new Student(true,15,193,"Дима");
        Student two=new Student(true,15,193,"Данил");
        Student three=new Student(true,15,193,"Артемий");
        Student[] group1={one,two,three};
        teacher.setStudents(group1);
        teacher.setName("Игнат");
        System.out.println("Группа учителя "+teacher.getName());
        teacher.info(group1);

        Student four=new Student(true,15,193,"Артем");
        Student five=new Student(true,15,193,"Александр");
        Student six=new Student(true,15,193,"Некита");
        Student[] group2={four,five,six};
        teacher1.setStudents(group2);
        teacher1.setName("Obama");
        System.out.println("Группа учителя по имени "+teacher1.getName());
        teacher1.info(group2);

        Student seven=new Student(true,15,193,"Семен");
        Student eight=new Student(true,15,193,"Владимир");
        Student nine=new Student(true,15,193,"Владислав");
        Student[] group3={seven,eight,nine};
        teacher2.setStudents(group3);
        teacher2.setName("Пудж");
        System.out.println("Группа учителя "+teacher2.getName());
        teacher2.info(group3);
        System.out.println("Что умеют ученики?");
        teacher1.studentMethods(four);
        System.out.println("Вот это у "+teacher1.getName()+" ученики!");
    }
}
