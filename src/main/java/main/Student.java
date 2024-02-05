package main;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Student {
    HashMap<String, String> students = new LinkedHashMap<String, String>();
    public void addStudent(String name, String snum) {
        students.put(name,snum);
    }
    public void listStudent(){
        System.out.println("Opiskelijat:");
        for (String i : students.keySet()) {
            System.out.println( students.get(i) + ": " +i );}
    }
}


