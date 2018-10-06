package com.cifa;

import java.io.IOException;

import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {
        Main m=new Main();
        List<String>strList= m.readTestFile("D:/1.txt");
        String [] list=null;
        for(int i=0;i<strList.size();i++){
            System.out.println("进行第"+(i+1)+"行的判断：");
            list=m.Divide(strList.get(i));
            m.Sort(list);
        }
    }
}
