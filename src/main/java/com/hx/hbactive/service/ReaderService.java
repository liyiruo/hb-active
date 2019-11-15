package com.hx.hbactive.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
public class ReaderService {


    public String getDataViaRead(HttpServletRequest req) throws IOException {

        /**读取req中的json*/
        BufferedReader br = null;
        br = new BufferedReader(new InputStreamReader(req.getInputStream(), "utf-8"));
        StringBuffer sb = new StringBuffer("");
        String temp;
        while ((temp = br.readLine()) != null) {
            sb.append(temp);
        }
        br.close();

        String a = sb.toString();
        return a;
    }

}
