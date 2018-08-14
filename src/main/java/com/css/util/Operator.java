package com.css.util;


import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Operator {
    /*
         单例枚举类实现操作
     */
    public enum OperatorSingle {
        INSTANCE;

        private OperatorSingle() {

        }

        public String operator(String instaceId, String operatorType) throws Exception {
            String caseType = null;
            switch (operatorType) {
                case "0":
                    caseType = "/kill?";
                    break;
                case "1":
                    caseType = "/setSuccess?";
                    break;
                case "2":
                    caseType = "/rerun?";
                    break;
                case "3":
                    caseType = "/runMultiple?";
                    break;
            }
            System.out.println(caseType);
            long timestamp = System.currentTimeMillis();
            // String
            String token = BaseConfig.token;

            String queryString = null;
            String s = null;
            queryString = String.format("baseKey=%s&timestamp=%s", BaseConfig.baseKey, timestamp);

            String signature = TokenSignature.getSignature(token, queryString);

            CloseableHttpClient client = HttpClients.createDefault();
            CloseableHttpResponse response = null;

            String url = Encode.encode("http://99.12.128.145/v2.0/nodeIns/" + instaceId + caseType + queryString,
                    "utf-8");

            System.out.println(url);
            HttpPut put = new HttpPut(url);

            put.setHeader("local_name", "zh_CN");
            put.setHeader("Content-Type", "application/json");
            put.setHeader("base_id", "11204677127065735");
            put.setHeader("tenant_id", "10000");
            put.setHeader("signature", signature);
            try {
                response = client.execute(put);
                BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));


                while ((s = br.readLine()) != null) {
                    s = br.readLine().toString();
                    System.out.println(s);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    response.close();
                    client.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return s;
        }


        public String getLog(String instaceId) throws Exception {
            StringBuffer logMessage = new StringBuffer();
            long timestamp = System.currentTimeMillis();
            // String
            String token = BaseConfig.token;

            String queryString = null;

            queryString = String.format("baseKey=%s&timestamp=%s", BaseConfig.baseKey, timestamp);

            String signature = TokenSignature.getSignature(token, queryString);

            CloseableHttpClient client = HttpClients.createDefault();
            CloseableHttpResponse response = null;

            String url = Encode.encode("http://99.12.128.145/v2.0/nodeIns/" + instaceId + "/log?" + queryString,
                    "utf-8");

            System.out.println(url);
            HttpGet get = new HttpGet(url);

            get.setHeader("local_name", "zh_CN");
            get.setHeader("Content-Type", "application/json");
            get.setHeader("base_id", "11204677127065735");
            get.setHeader("tenant_id", "10000");
            get.setHeader("signature", signature);
            try {
                response = client.execute(get);
                BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                String s = null;
                while ((s = br.readLine()) != null) {
                    logMessage.append(s);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    response.close();
                    client.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return logMessage.toString();
        }
    }


}
