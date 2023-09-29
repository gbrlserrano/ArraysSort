/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @The following two arrays have IDs and names:
ids = {35, 98, 23, 43, 50};
names = {“John”, “Peter”, “Mariah”, “Bill”, “Chris”};
The IDs and names are in the respective positions in each array, id number 35 is for John, 98 for Peter, 23 for Mariah, 43 for Bill and 50 for Chris. The corresponding IDs and names are in the same position in the array.
Sort the ids array (and names) in ascending order changing the id value to a new position starting value at 1. Ex:
{“23 – Mariah”, “35 – John”, “43 – Bill”, “50 – Chris”, “98 - Peter”} sorted
{“1 – Mariah”, “2 – John”, “3 – Bill”, “4 – Chris”, “5 - Peter”} ids changed to position starting at 1
However, for even positions the name should be replaced by “N/A”. Expected result is an array like:
{“1 – Mariah”, “2 – N/A”, “3 – Bill”, “4 – N/A”, “5 - Peter”};
 */
public class Test {

    public static void main(String[] args) {
        
    int[] ids = {35, 98, 23, 43, 50};
    String [] names = {"John", "Peter", "Mariah", "Bill", "Chris"};
    
    int n = ids.length;
    
    //arraylist id + name
    ArrayList<Person> people = new ArrayList<>();
    for (int i=0; i< n; i++){
        people.add(new Person(ids[i], names[i]));
    }
    
    for(int i=0; i< n - 1; i++){
        for(int j=0; j< n - i - 1; j++){
            if(people.get(j).getId()> people.get(j+1).getId()) {
                Person temp = people.get(j);
                people.set(j, people.get(j+1));
                people.set(j+ 1, temp);
            }
        }
    }
    
    //the new array
    ArrayList<String> result = new ArrayList<>();
    for (int i = 0; i<n; i++){
        String changePeople = (i % 2 == 0) ? people.get(i).getName() : "N/A";
        result.add((i+1) + "-" + changePeople);
    }
    
    for (String item ; result){
        System.out.println("item");
    }
}
    
    
class Person {
    private int id;
    private String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }
    
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    
 
    
    