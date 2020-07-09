/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionoflist.get_set;

import java.util.Scanner;

/**
 *
 * @author Shiplu L
 */
public class main {

    public static void main(String[] args) {
        student obj = new student();
        Scanner out = new Scanner(System.in);
        String a;
        int a1, a2;
        System.out.print("name of student : ");
        a = out.next();
        obj.setNameOfstudent(a);
        System.out.print("student age : ");
        a1 = out.nextInt();
        obj.setAge(a1);
        System.out.print("student ID : ");
        a2 = out.nextInt();
        obj.setId(a2);
        System.out.println("student name : "+obj.getNameOfstudent());
        System.out.println("student age : "+obj.getAge());
        System.out.println("student ID : "+obj.getId());
    }
}
