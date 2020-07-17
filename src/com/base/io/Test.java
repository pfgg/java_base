package com.base.io;

import java.io.*;

/**
 * @author xsm
 * @date 2020/7/17 10:40
 * @description
 */
public class Test {
    public static void main(String[] args) throws IOException {
        StringBuffer buffer = new StringBuffer();
        //读取e:/test.txt    e:/2016072808334793.jpg
        File chainFile = new File("e:/test.txt");   //中文 标点
        //String chainString = IoUtil.getOutStreamReader(chainFile).toString();

        //读取 图片
        File imgFile = new File("e:/2016072808334793.jpg");   //中文 标点
        File imgPrintFile = new File("e:/test.jpg");
        String imgString = IoUtil.getImage(imgFile).toString();
        System.out.println(imgString.getBytes().length);
        IoUtil.printFile(imgPrintFile,imgString.getBytes());
    }

}
