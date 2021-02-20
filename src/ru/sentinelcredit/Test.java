package ru.sentinelcredit;

import ru.sentinelcredit.PdfMerger;

public class Test {

    public static void main(String[] args) {
        //String sourceUrl = ";http://prodbi12:9502/xmlpserver/ДД/Notice Of Transfer Report.xdo?_sTkn=8be04e9b175f12f5141&_xpf=&_xpt=1&_dFlag=false&_edIndex=0&_dIndex=0&_rToken=&_ranDiag=false&_xdo=%2F%D0%94%D0%94%2FNotice%20Of%20Transfer%20Report.xdo&_xmode=3&_paramsBalMode=SIEBEL&_paramsRegVal=&_paramsIdAsset=1-FRVVBL&_xt=RTF&_xf=pdf&_xautorun=true;http://prodbi12:9502/xmlpserver/ДД/Notice Of Transfer Report.xdo?_sTkn=8be04e9b175f12f5141&_xpf=&_xpt=1&_dFlag=false&_edIndex=0&_dIndex=0&_rToken=&_ranDiag=false&_xdo=%2F%D0%94%D0%94%2FNotice%20Of%20Transfer%20Report.xdo&_xmode=3&_paramsBalMode=SIEBEL&_paramsRegVal=&_paramsIdAsset=1-FRVWDG&_xt=RTF&_xf=pdf&_xautorun=true;http://srv1c?Stamp=true&Agree1=625/0303-0004112";
        //String sourceUrl = "http://srv1c?Stamp=true&agree=625/0303-0004112,0";
        //String sourceUrl = "http://srv1c?Stamp=true&agree=1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1";
        String sourceUrl = "http://prodobiee:9704/xmlpserver/HARD+Templates/справка-уведомление_cession.xdo?_xpf=&_xpt=0&_xdo=/HARD+Templates/справка-уведомление_cession.xdo&facsimile_flg=N&contr_id=1-UHE1E5B&_xt=справка-уведомление_cession&_xf=pdf&_xautorun=true&_xmode=3";

        try {
            PdfMerger pdfMerger = new PdfMerger();
            String s = pdfMerger.process(sourceUrl.split(";"));
            System.out.println(s);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
