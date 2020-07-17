package com.base.other;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xsm
 * @date 2020/7/14 16:45
 * @description
 */
public class Test {
    public static void main(String[] args) {
        int num = 1;
        String str = "old";
        List<String> list = new ArrayList<String>();
        list.add("1");
        Object o = 1;
        int[] nums = new int[3];
        nums[0]  = 1;
        StringBuffer stringBuffer = new StringBuffer("aaa");
        Test.swap(num,str,list,o,nums,stringBuffer);
        System.out.println(num);
        System.out.println(str);
        System.out.println(list.size());
        System.out.println(o.toString());
        System.out.println(nums[1]);
        System.out.println(stringBuffer);
    }

    public static void swap(int num, String str, List<String> list,Object o,int[] nums,StringBuffer stringBuffer){
        num = 2;
        str = "new";
        list.add("2");
        o = "2";
        stringBuffer.append("bbb");
        nums[1] = 2;
    }
}
