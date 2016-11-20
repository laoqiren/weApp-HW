package com.umis.interceptor;
/*
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.umis.util.ExceptionCode;
import com.umis.util.JsonError;
import com.umis.util.TokenManager;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView mv)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
//		TokenManager tokenManager = TokenManager.getInstance();
//        String token = httpServletRequest.getHeader("Access_Token");
//        if (tokenManager.isTokenValid(token))
//            return true;
//        httpServletResponse.addHeader("Content-Type", "application/json;charset=UTF-8");
//        PrintWriter printWriter = httpServletResponse.getWriter();
//        printWriter.append(new JsonError(ExceptionCode.Invalid_Token, "Invalid Access_Token").toJsonString());
//        printWriter.close();
        return true;
	}

}
*/