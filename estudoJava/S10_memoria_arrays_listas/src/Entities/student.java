package Entities;

public class student {
    public String name;
    public int age;
    public double height;
    public int mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
        mark = 0;
    }

    public void printMarked(){
        if(mark != 0){
            System.out.println(name);
        }
    }


}
