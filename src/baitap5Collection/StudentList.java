package baitap5Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class StudentList {
    private String studentId;
    private String studentName;
    private String classId;

    public StudentList(String studentId, String studentName, String classId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.classId = classId;
    }

    public static void main(String[] args) {

        List<StudentList> studentLists = new ArrayList<>();
        studentLists.add(new StudentList("01", "Son", "01"));
        studentLists.add(new StudentList("02", "Hau", "01"));
        studentLists.add(new StudentList("03", "Huu", "01"));
        studentLists.add(new StudentList("01", "Quan","02"));
        studentLists.add(new StudentList("02", "Dat","02"));
        studentLists.add(new StudentList("03", "Truong", "02"));
        studentLists.add(new StudentList("01", "Tan", "03"));

        String[] newClassIds = new String[studentLists.size()];
        for(int i = 0; i < studentLists.size(); i++){
            newClassIds[i] = studentLists.get(i).classId;
        }
        HashSet<String> countClassId = new HashSet<>();
        for(String newClassId: newClassIds){
            countClassId.add(newClassId);
        }
        System.out.println("number of class is: " + countClassId.size());


        List<String> listClassId = new ArrayList<>();

        for(String newClassId: newClassIds){
            listClassId.add(newClassId);
        }


        HashMap<String, Integer> count = new HashMap();
        for(String classId: listClassId){
            if(count.containsKey(classId)){
                count.put(classId, count.get(classId) + 1);

            }
            else {
                count.put(classId, 1);

            }




        }
        for(String countClass: count.keySet()){
            System.out.println("class " + countClass + " " + count.get(countClass) );
        }





    
       }








    }

