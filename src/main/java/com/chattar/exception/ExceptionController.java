package com.chattar.exception;

import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	Logger logger = Logger.getLogger(ExceptionController.class);
	@ExceptionHandler(value=Exception.class)
	String handleException(HttpServletRequest req, Exception ex) {
		logger.error("Request "+req.getRequestURL() + "threw an error"+ ex);
		return "error";
	}
}
