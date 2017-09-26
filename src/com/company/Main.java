package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class Main {


    public static void main(String[] args) {
        // write your code here

        ArrayList<Student> al = new ArrayList<>();

        Student Josh = new Student("Josh", "May", 1, 1);
        Student Vijay = new Student("Vijay", "Smith", 2, 1);
        Student Ravi = new Student("Ravi", "Elway", 3, 1);
        Student Ajay = new Student("Ajay", "Brown", 4, 1);
        Student Bill = new Student("Bill", "Murray", 5, 1);
        Student Jeff = new Student("Jeff", "Avery", 6, 1);
        Student Sarah = new Student("Sarah", "Mean", 7, 1);
        Student Kathleen = new Student("Kathleen", "Burns", 8, 1);
        Student Tara = new Student("Tara", "Smith", 9, 1);
        Student Aaron = new Student("Aaron", "Maast", 10, 1);
        Student Cash = new Student("Cash", "May", 11, 1);
        Student Erika = new Student("Erika", "Dolens", 12, 1);
        Student Erik = new Student("Erik", "Morris", 13, 1);
        Student Penny = new Student("Penny", "Brown", 14, 1);
        Student Bernice = new Student("Bernice", "Wot", 15, 1);

        al.add(Josh);
        al.add(Vijay);
        al.add(Ravi);
        al.add(Ajay);
        al.add(Bill);
        al.add(Jeff);
        al.add(Sarah);
        al.add(Kathleen);
        al.add(Tara);
        al.add(Aaron);
        al.add(Cash);
        al.add(Erika);
        al.add(Erik);
        al.add(Penny);
        al.add(Bernice);


        System.out.println(al);


        List<Teacher> ta = new ArrayList<>();

        Teacher Billy = new Teacher("Billy", "Keyserling", 21, 1);
        Teacher Jimmy = new Teacher("Jimmy", "Brown", 22, 1);
        Teacher Langois = new Teacher("Langois", "Cos'Reil", 23, 1);

        ta.add(Billy);
        ta.add(Jimmy);
        ta.add(Langois);

        Set<Student> teacherSetOne = new HashSet<>();

        teacherSetOne.add(Josh);
        teacherSetOne.add(Vijay);

        teacherSetOne.add(Ravi);
        teacherSetOne.add(Ajay);
        teacherSetOne.add(Bill);

        System.out.println("List:" + teacherSetOne);
//        System.out.println("Set:" + );



        //////////////////

        Set<Student> teacherSetTwo = new HashSet<>();

        teacherSetTwo.add(Jeff);
        teacherSetTwo.add(Sarah);

        teacherSetTwo.add(Kathleen);
        teacherSetTwo.add(Tara);
        teacherSetTwo.add(Aaron);

        System.out.println("List:" + teacherSetTwo);

        ///////////////

        Set<Student> teacherSetThree = new HashSet<>();

        teacherSetThree.add(Cash);
        teacherSetThree.add(Erika);

        teacherSetThree.add(Erik);
        teacherSetThree.add(Penny);
        teacherSetThree.add(Bernice);

        System.out.println("List:" + teacherSetThree);


        ////////////////


        HashMap <Teacher, HashSet>newmap = new HashMap();

        // populate hash map
        newmap.put(Billy, (HashSet) teacherSetOne);
        newmap.put(Jimmy, (HashSet) teacherSetTwo);
        newmap.put(Langois, (HashSet) teacherSetThree);

        // get keyset value from map
        Set keyset=newmap.keySet();

        // check key set values
        System.out.println("Key set values are: " + keyset);

        //////

        // you don't need a forloop, they print all without the loop!
    }
}



