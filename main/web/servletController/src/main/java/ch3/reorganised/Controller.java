package ch3.reorganised;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by bkv on 10.11.2014.
 */
@WebServlet(urlPatterns = {"/ch3/reorganised/Controller"})
public class Controller extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ControllerHelper helper = new ControllerHelper(request, response, this);
        helper.doGet();
    }
}
