package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        File f= new File("demo.txt");
//        FileOutputStream fos=new FileOutputStream(f);
//        DataOutputStream dos= new DataOutputStream(fos);
//        dos.writeUTF("Hello World");
//
//        FileInputStream fis=new FileInputStream(f);
//        DataInputStream dis = new DataInputStream(fis);
//        String str=dis.readUTF();
//        System.out.println(str);
//        PrintWriter output=new PrintWriter(f);
//        output.print("hell yo world");
//        output.close();
//        Scanner input=new Scanner(f);
//        String str=input.nextLine();
//        System.out.println(str);
        ArrayList<student> students=new ArrayList<student>();
        students.add(new student("Shafayat",2.6));
        students.add(new student("Sanya",3));
        FileOutputStream fo=new FileOutputStream(f);
        ObjectOutputStream output=new ObjectOutputStream(fo);
        for (student s:
             students) {
            output.writeObject(s);
        }
        output.close();

        FileInputStream fi=new FileInputStream(f);
        ObjectInputStream input=new ObjectInputStream(fi);
        ArrayList<student> students2=new ArrayList<student>();
        try {
            while (true) {
                student s = (student) input.readObject();
                students2.add(s);
            }
        }
        catch (EOFException ex)
        {

        }
        for (student ss:
             students2) {
            ss.get();
        }
    }
}
