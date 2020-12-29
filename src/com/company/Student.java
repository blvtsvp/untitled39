package com.company;

import java.util.Scanner;

public class Student {
    public static int[] marks = new int[5];
    String name;
    int group;


    public Student(String nextLine, int nextInt, int[] m) {
        this.name = nextLine;
        this.group = nextInt;
        this.marks = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] ttt = new int[10];

        Student[] a = new Student[10];
        for (int i = 0; i < 10; ++i) {

            String s = in.nextLine();
            int num = in.nextInt();

            a[i].name = s;
            a[i].group = num;

            for (int j = 0; i < 5; ++i) {
                int x = in.nextInt();
                a[i].marks[j] = x;
                if (x > 8) ttt[i] = 1;

            }
        }

        for (int i = 0; i < 10; ++i) {
            if (ttt[i] == 1) {
                System.out.print(a[i].name + ' ' + a[i].group);
            }

        }
        in.close();
    }

    }



