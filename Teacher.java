package HW1;

public class Teacher {
    private String name;
    private Student[] students=new Student[3];

    public void setStudents(Student[] student) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    void info(Student[] students){//вы меня знатно помучали с этим методом
        for(Student student: students){
            System.out.println("Отличник или не отличник - "+student.getExcellentStudent());
            System.out.println("Возраст - "+student.getAge());
            System.out.println("Рост - "+student.getHeight());
            System.out.println("Имя - "+student.getName());
            System.out.println();
        }
    }
    void studentMethods(Student student){
        student.toStudy();
        student.benchPress();
    }
}


