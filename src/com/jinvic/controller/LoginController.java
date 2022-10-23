package com.jinvic.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jinvic.bean.ResultData;
import com.jinvic.bean.SlideVerifyToolkit;


public class LoginController {

	/**
     * 默认的用户认证信息
     */
    private Map<String,String> userAuthInfo = new HashMap<String,String>();
    
    {
    	userAuthInfo.put("test", "test");
    	userAuthInfo.put("admin", "admin");
    }
    
    public ResultData initSlideVerifyImage(HttpServletRequest request, HttpServletResponse response) {
    	ResultData result = new ResultData ();
    	 Map<String,String> slideVerifyInfo = null;
         SlideVerifyToolkit toolkit = new SlideVerifyToolkit();
         
         
    	return result;
    	
    }
}
