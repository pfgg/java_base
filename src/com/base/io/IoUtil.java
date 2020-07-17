package com.base.io;

import java.io.*;

/**
 * @author xsm
 * @date 2020/7/17 10:45
 * @description
 */
public class IoUtil {

    //读取中文
    public static StringBuffer getOutStreamReader(File file){
        StringBuffer stringBuffer = new StringBuffer();  //存放中文
        if (file.exists()){
            try {
                InputStream is =  new FileInputStream(file);
                InputStreamReader isr = new InputStreamReader(is,"gbk");
                char[] chars = new char[12];
                int len = 0;
                while ((len = isr.read(chars))!= -1){
                    stringBuffer.append(new String(chars));
                }
                isr.close();
                is.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            stringBuffer.append("文件不存在");
        }
        return stringBuffer;
    }

    //读取图片
    public static StringBuffer getImage(File file){
        StringBuffer stringBuffer = new StringBuffer();
        if (file.exists()){
            try {
                InputStream is =  new FileInputStream(file);   //746705
                byte[] bytes = new byte[1024];
                int len = 0;
                while ((len = is.read(bytes)) !=-1){
                    stringBuffer.append(new String(bytes));
                }
                System.out.println(bytes.length);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            stringBuffer.append("文件不存在");
        }
        return stringBuffer;
    }

    public static void printFile(File file,byte[] bytes){
        try {
            OutputStream os = new FileOutputStream(file);
            os.write(bytes);
            os.flush();
            os.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

}
