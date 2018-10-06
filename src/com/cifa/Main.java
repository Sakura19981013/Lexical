package com.cifa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import com.*;

public class Main {
    static char optSingle[]={'+','-','*','/','<','>'};//单目运算符

    analyse i=new analyse();

    /**

     * 读取一个文件的内容，分行将所有的内容保存到一个list集合中
     * @param filename
     * @return
     * @return
     * @throws IOException
     */

    public  List<String> readTestFile(String filename) throws IOException{

        List<String >list=new ArrayList<String>();
        String fileContent="";
        FileReader fread = new FileReader(filename);
        BufferedReader bf=new BufferedReader(fread);
        String strLine=bf.readLine();
        while(strLine!=null){
            System.out.println("算术表达式:"+strLine);
            list.add(strLine);
            strLine=bf.readLine();
        }
        bf.close();
        fread.close();
        return list;
    }



    public String[] Divide(String str){
        String[] list;
        list=str.split(" ");
        return list;
    }

    /**

     * 根据输入的list进行划分和判断，并将判断的结果输出

     * @param list

     */

    public void Sort(String[] list){
        //map里面的key有word,sortclass
        List<Map> mList=new ArrayList<Map>();
        //获取经过处理的种别和关键字系列集合
        mList=i.GetStringAndSortNum(list);
        for(Map m0:mList){
            String keyword=(String) m0.get("keyword");
            String sortclass1=(String) m0.get("sortclass");
            System.out.println("("+sortclass1+","+keyword+")");
        }
    }
}
