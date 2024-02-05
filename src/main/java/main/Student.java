package main;
import java.util.HashMap;

public class Student {
    HashMap<String, String> students = new HashMap<String, String>();
    public void addStudent(String name, String snum) {
        students.put(snum,name);
    }
    public void listStudent(){
        System.out.println("Opiskelijat:");
        for (String i : students.keySet()) {
            System.out.println( i + ": " + students.get(i));}
    }
}


