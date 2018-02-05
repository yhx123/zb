package com.lsjs.zb.util;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

@Slf4j
public class SendMsgUtil {
    /**
     * @return
     * @throws IOException
     * @作用 使用urlconnection
     */

    public static String sendSCode(String phone) throws IOException {
        Random ne = new Random();
        //为变量赋随机值1000-9999
        int x = ne.nextInt(9999 - 1000 + 1) + 1000;
        String code = String.valueOf(x);
        String url = "http://139.196.243.110:8080/syw-api/system/dx";
        OutputStreamWriter out = null;
        BufferedReader reader = null;
        String response = "";
        try {
            URL httpUrl = new URL(url);
            //建立连接
            HttpURLConnection conn = (HttpURLConnection) httpUrl.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("CreateMessage-Type", "application/json");
            conn.setRequestProperty("connection", "keep-alive");
//            conn.setRequestProperty("phone",phone);
//            conn.setRequestProperty("msg","亲爱的用户感谢您注册众帮，您的验证码是"+code+",1分钟内有效。");
            conn.setUseCaches(false);//设置不要缓存
            conn.setInstanceFollowRedirects(true);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.connect();
            //POST请求
            out = new OutputStreamWriter(
                    conn.getOutputStream());
            out.write("phone="+phone+"&msg="+"亲爱的用户感谢您注册众帮，您的验证码是"+code+",1分钟内有效。");
            out.flush();
            //读取响应
            reader = new BufferedReader(new InputStreamReader(
                    conn.getInputStream()));
            String lines;
            while ((lines = reader.readLine()) != null) {
                lines = new String(lines.getBytes(), "utf-8");
                response += lines;

            }
            reader.close();
            // 断开连接
            conn.disconnect();

            log.info(response.toString());

        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();

        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();

                }
                if (reader != null) {
                    reader.close();

                }

            } catch (IOException ex) {
                ex.printStackTrace();

            }

        }
        return code;
    }
}

