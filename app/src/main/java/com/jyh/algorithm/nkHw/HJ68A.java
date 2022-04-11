package com.jyh.algorithm.nkHw;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//成绩排序
public class HJ68A {
    public static void  main(){
        Scanner scanner=new Scanner("3\n" +
                "0\n" +
                "fang 90\n" +
                "yang 50\n" +
                "ning 70\n" +
                "复制");
        while (scanner.hasNext()){
            int count=scanner.nextInt();
            int type=scanner.nextInt();
            ArrayList<Student> list=new ArrayList<>();

            for (int i=0;i<count;i++){

                list.add(new Student(scanner.next(),scanner.nextInt()));
            }

            if (type==1){
                Collections.sort(list, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.score-o2.score;
                    }
                });
            }else {
                Collections.sort(list, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o2.score-o1.score;
                    }
                });
            }
            for (Student s:
                 list) {
                System.out.println(s.name + " " + s.score);
            }
        }
    }
    public static class Student{
        String name;
        int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
}
