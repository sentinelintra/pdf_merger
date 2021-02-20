package ru.sentinelcredit;

/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static javax.xml.bind.DatatypeConverter.printBase64Binary;
import static javax.xml.bind.DatatypeConverter.parseBase64Binary;

// import Siebel dependencies
import com.siebel.data.SiebelPropertySet;
import com.siebel.eai.SiebelBusinessServiceException;

//import oracle.apps.xdo.common.pdf.util.PDFDocMerger;
import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.multipdf.PDFMergerUtility;

import javax.swing.*;

public class PdfMerger extends com.siebel.eai.SiebelBusinessService  {

    private static String[] customParams11 = {"cess_flg", "facsimile_flg", "contr_id"};
    private static String[] customParams12 = {"_paramsIdAsset", "_paramsDocId", "_paramsDiscMode", "_paramsDiscountId", "_paramsidCont", "_paramsRegVal"};
    private String returnData = "";
    private String userName11 = "weblogic";
    private String userPass11 = "sentinel12";
    private String userName12 = "weblogic";
    private String userPass12 = "sentineL19";
    private String userName1C = "1cWebService";
    private String userPass1C = "Rv%9liNJ";

    private static Map<String, String> getQueryMap(String query) {

        String[] params = query.split("&");
        Map<String, String> map = new HashMap<String, String>();

        for (String param : params) {
            int idx = param.indexOf("=");
            if (idx > -1) {
                String name = param.substring(0, idx);
                String value = param.substring(idx+1);
                map.put(name, value);
            }
        }
        return map;
    }

    private InputStream process11(Map map) throws Exception {
        ru.sentinelcredit.bi.ArrayOfParamNameValue arrayOfParamNameValue = new ru.sentinelcredit.bi.ArrayOfParamNameValue();

        for (String docParam: customParams11) {

            if (map.containsKey(docParam)) {
                ru.sentinelcredit.bi.ArrayOfString values = new ru.sentinelcredit.bi.ArrayOfString();
                values.getItem().add((String) map.get(docParam));

                ru.sentinelcredit.bi.ParamNameValue paramNameValue = new ru.sentinelcredit.bi.ParamNameValue();
                paramNameValue.setUIType("Text");
                paramNameValue.setDataType("dataType");
                paramNameValue.setValues(values);
                //paramNameValue.setDefaultValue((String)map.get(docParam));
                paramNameValue.setName(docParam);
                arrayOfParamNameValue.getItem().add(paramNameValue);
            }
        }

        ru.sentinelcredit.bi.ParamNameValues paramNameValues = new ru.sentinelcredit.bi.ParamNameValues();
        paramNameValues.setListOfParamNameValues(arrayOfParamNameValue);

        ru.sentinelcredit.bi.ReportRequest biRequest = new ru.sentinelcredit.bi.ReportRequest();
        biRequest.setReportAbsolutePath((String)map.get("_xdo"));
        biRequest.setSizeOfDataChunkDownload(-1);
        biRequest.setAttributeFormat("pdf");
        biRequest.setParameterNameValues(paramNameValues);

        ru.sentinelcredit.bi.ReportService biService = new ru.sentinelcredit.bi.ReportService_Service().getReportService();
        ru.sentinelcredit.bi.ReportResponse biresponse = biService.runReport(biRequest, userName11, userPass11);

        return new ByteArrayInputStream(biresponse.getReportBytes());
    }

    private InputStream process12(Map map) throws Exception {
        ru.sentinelcredit.bi12.ArrayOfParamNameValue arrayOfParamNameValue = new ru.sentinelcredit.bi12.ArrayOfParamNameValue();

        for (String docParam: customParams12) {

            if (map.containsKey(docParam)) {
                ru.sentinelcredit.bi12.ArrayOfString values = new ru.sentinelcredit.bi12.ArrayOfString();
                values.getItem().add((String) map.get(docParam));

                ru.sentinelcredit.bi12.ParamNameValue paramNameValue = new ru.sentinelcredit.bi12.ParamNameValue();
                paramNameValue.setUIType("Text");
                paramNameValue.setDataType("dataType");
                paramNameValue.setValues(values);
                //paramNameValue.setDefaultValue((String)map.get(docParam));
                paramNameValue.setName(docParam.replace("_params", ""));
                arrayOfParamNameValue.getItem().add(paramNameValue);
            }
        }

        ru.sentinelcredit.bi12.ParamNameValues paramNameValues = new ru.sentinelcredit.bi12.ParamNameValues();
        paramNameValues.setListOfParamNameValues(arrayOfParamNameValue);

        ru.sentinelcredit.bi12.ReportRequest bi12Request = new ru.sentinelcredit.bi12.ReportRequest();
        bi12Request.setReportAbsolutePath((String)map.get("_xdo"));
        bi12Request.setSizeOfDataChunkDownload(-1);
        bi12Request.setAttributeFormat("pdf");
        bi12Request.setParameterNameValues(paramNameValues);

        ru.sentinelcredit.bi12.ReportService bi12Service = new ru.sentinelcredit.bi12.ReportService_Service().getReportService();
        ru.sentinelcredit.bi12.ReportResponse bi12response = bi12Service.runReport(bi12Request, userName12, userPass12);

        return new ByteArrayInputStream(bi12response.getReportBytes());
    }

    private void process1c(Map<String, String> map, PDFMergerUtility pdfMerger) throws Exception {
        if (map.containsKey("agree")) {
            ru.sentinelcredit.exchange.ArrayOfAgreements arrayOfAgreements = new ru.sentinelcredit.exchange.ArrayOfAgreements();
            String[] agreeArr = map.get("agree").split(",");

            if (agreeArr.length <= 50) {
                for (String entry : agreeArr) {
                    if (entry.length() > 0) arrayOfAgreements.getIdAgreements().add(entry);
                }

                Boolean stamp = false;
                if (map.containsKey("stamp"))
                    stamp = Boolean.valueOf(map.get("stamp"));

                Authenticator myAuth = new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(userName1C, userPass1C.toCharArray());
                    }
                };
                Authenticator.setDefault(myAuth);

                ru.sentinelcredit.exchange.MxsExchangePortType mxsExchangePortType = new ru.sentinelcredit.exchange.MxsExchange().getMxsExchangeSoap();
                ru.sentinelcredit.exchange.GetReferenceResponse2 getReferenceResponse2 = mxsExchangePortType.getReference("FIO", arrayOfAgreements, stamp);

                for (ru.sentinelcredit.exchange.GetReferenceResponse2.Return entry : getReferenceResponse2.getReturn()) {
                    byte[] form = entry.getForm();
                    if (form != null)
                        pdfMerger.addSource(new ByteArrayInputStream(form));
                    else
                        returnData += entry.getIdAgreements() + ": " + entry.getMessage() + ";";
                }
            }
            else
                returnData += "1C: Пакетный режим позволяет печатать не более 50ти документов в одной пачке!;";
        }
    }

    public String process(String[] sourceUrls) throws Exception {
        PDFMergerUtility pdfMerger = new PDFMergerUtility();
        returnData = "";

        if (sourceUrls.length <= 50)
            for (String sourceUrl : sourceUrls) {
                if (sourceUrl.length() > 0) {
                    URL url = new URL(java.net.URLDecoder.decode(sourceUrl, Charset.forName("UTF-8").name()));
                    Map map = getQueryMap(url.getQuery());

                    if (url.getHost().toLowerCase().contains("prodbi12"))
                        pdfMerger.addSource(process12(map));
                    else if (url.getHost().toLowerCase().contains("prodobiee"))
                        pdfMerger.addSource(process11(map));
                    else if (url.getHost().toLowerCase().contains("srv1c"))
                        process1c(map, pdfMerger);
                }
            }
        else
            returnData = "Пакетный режим позволяет печатать не более 50ти документов в одной пачке!;";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        pdfMerger.setDestinationStream(outputStream);
        pdfMerger.mergeDocuments(MemoryUsageSetting.setupTempFileOnly());

        return printBase64Binary(outputStream.toByteArray());
    }

    public void doInvokeMethod(String methodName, SiebelPropertySet input, SiebelPropertySet output) throws SiebelBusinessServiceException {

	    if (!methodName.equals("Merge"))
		    throw new SiebelBusinessServiceException("NO_SUCH_METHOD", methodName + ": no such method");

        String sourceUrl = input.getProperty("Url");

        if (input.getProperty("Username11") != null &&
                input.getProperty("Password11") != null &&
                input.getProperty("Username11").length() > 0) {
            userName11 = input.getProperty("Username11");
            userPass11 = input.getProperty("Password11");
        }

        if (input.getProperty("Username12") != null &&
                input.getProperty("Password12") != null &&
                input.getProperty("Username12").length() > 0) {
            userName12 = input.getProperty("Username12");
            userPass12 = input.getProperty("Password12");
        }

        if (input.getProperty("Username1C") != null &&
                input.getProperty("Password1C") != null &&
                input.getProperty("Username1C").length() > 0) {
            userName1C = input.getProperty("Username1C");
            userPass1C = input.getProperty("Password1C");
        }

        try {
            output.setValue(process(sourceUrl.split(";")));
            output.setProperty("ReturnData", returnData);
        }
	    catch (Exception e) {
            throw new SiebelBusinessServiceException("WRONG_MERGE", e.getLocalizedMessage());
        }
	}
}