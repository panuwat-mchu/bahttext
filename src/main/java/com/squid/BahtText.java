package com.squid;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BahtText {

    public static final Map<String, String> numberTextMap;

    static {
        numberTextMap = new HashMap();
        numberTextMap.put("0","ศูนย์");
        numberTextMap.put("1","หนึ่ง");
        numberTextMap.put("2","สอง");
        numberTextMap.put("3","สาม");
        numberTextMap.put("4","สี่");
        numberTextMap.put("5","ห้า");
        numberTextMap.put("6","หก");
        numberTextMap.put("7","เจ็ด");
        numberTextMap.put("8","แปด");
        numberTextMap.put("9","เก้า");
        numberTextMap.put("10","สิบ");
        numberTextMap.put("11","สิบเอ็ด");
        numberTextMap.put("20","ยี่สิบ");
    }

    public static String parseText(double number) {
        String numberStr = String.valueOf(number);

        String integerStr = numberStr.split("\\.")[0];
        System.out.println(integerStr);

        String integerText = numberTextMap.get(integerStr);
        System.out.println("integerText:"+integerText);

        if(integerText==null){
            if(integerStr.length()==2){
                if(integerStr.startsWith("1")){
                    integerText=numberTextMap.get("10")+numberTextMap.get(String.valueOf(integerStr.charAt(1)));
                }else if(integerStr.startsWith("2")){
                    integerText=numberTextMap.get("20");
                    String secondChar = String.valueOf(integerStr.charAt(1));
                    if(secondChar.equals("1")){
                        integerText += "เอ็ด";
                    }else{
                        integerText += numberTextMap.get(secondChar);
                    }
                }else {
                    String firstChar = String.valueOf(integerStr.charAt(0));
                    integerText = numberTextMap.get(firstChar)+"สิบ";
                    String secondChar = String.valueOf(integerStr.charAt(1));
                    if(secondChar.equals("1")){
                        integerText += "เอ็ด";
                    }else if(!secondChar.equals("0")) {
                        integerText += numberTextMap.get(secondChar);
                    }
                }
            }
        }

        return integerText;
    }
}
