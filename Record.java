package com.company.aneesh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Record {
    List<Student> students = new ArrayList<>();
    public String addStudent(Student student){
        if (isAlpha(student)==false){
            return "invalid";
        }
        students.addAll((Collection<? extends Student>) student);
        return "added";
    }
    public static boolean isAlpha(Student s){
        if(s==null){
            return  false;
        }
        String name = s.getName();
         int l= name.length();
        for (int i=0;i<l;i++){
            char c=name.charAt(i);
            if(!(c>='A'&& c<='Z')&&!(c>='a'&&c<='z')){
                return  false;
            }
        }
        return true;
    }
}
