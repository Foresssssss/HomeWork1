package HW1;

public class Student {
    //Поля класса Student
    private boolean excellentStudent;//отличник или нет
    private int age;//возраст студента
    private int height;//рост
    private String name;
    //конструктор для удобства
    Student(boolean excellentStudent,int age,int height,String name){
        this.excellentStudent=excellentStudent;
        this.age=age;
        this.height=height;
        this.name=name;
    }
    //private чтоб студенту не было 540 лет и его рост не был 100500 см
    //сеттеры и геттеры

    public void setAge(int age) {
        if(0<=age&&age<=150) {//человеку не может быть -14 или 500 лет
            this.age = age;
        }
    }

    public void setExcellentStudent(boolean excellentStudent) {
        this.excellentStudent = excellentStudent;//тут проверка не нужна
    }

    public void setName(String name) {
        if(name.length()>0){//имя же не может быть таким?
            this.name = name;
        }
    }

    public void setHeight(int height) {
        if(100<=height&&height<=253){
            this.height = height;//проверка
        }
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
    public boolean getExcellentStudent(){
        return excellentStudent;
    }
    public void benchPress(){
        System.out.println("Студент "+name+" сделал ДЗ!");
    }
    public void toStudy(){
        if(excellentStudent==true){
            System.out.println(name+" не учится!");
        }else{
            System.out.println(name+" учится ;)");
        }
    }
    public void showInfo(){//метод для вывода информации о студенте
        System.out.println("Отличник или нет - "+excellentStudent);
        System.out.println("Возраст - "+age);
        System.out.println("Рост - "+height);
        System.out.println("Имя - "+name);
        System.out.println();
    }
}