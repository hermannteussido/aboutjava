package ch3.reorganised;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by bkv on 10.11.2014.
 */
public class HelperBase {

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpServlet servlet;


    public HelperBase(HttpServletRequest request,
                      HttpServletResponse response,
                      HttpServlet servlet) {
        this.request = request;
        this.response = response;
        this.servlet = servlet;
    }
}
