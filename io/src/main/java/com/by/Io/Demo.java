package com.by.Io;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        InputStream in =null;
        //inputStream
        try {
            //实例化文件输入流 （参数是一个文件）
             in = new FileInputStream(new File("F:\\by\\io\\AAA.txt"));
            //把文件读成流 硬盘中的文件读到程序中,
            try {
                //读取数据  返回10进制的整数,没有会返回-1
                int read = in.read();
                while (read!=-1){
                    System.out.print((char) read);
                    read = in.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        //文件丢失异常
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
