package ch3.reorganised;

import ch3.dataBean.RequestData;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by bkv on 10.11.2014.
 */

public class ControllerHelper extends HelperBase {
    protected RequestData data;
     public ControllerHelper(HttpServletRequest request,
                             HttpServletResponse response,
                             HttpServlet servlet) {
         super(request, response, servlet);
         data = new RequestData();
     }

    public RequestData getData() {
        return data;
    }

    public void doGet() throws ServletException, IOException {
        request.getSession().setAttribute("helper", this);
        data.setHobby(request.getParameter("hobby"));
        data.setAversion(request.getParameter("aversion"));

        String address;
        if(request.getParameter("processButton") != null) {
            address = "Process.jsp";
        } else if(request.getParameter("confirmButton") != null) {
            address = "Confirm.jsp";
        } else {
            address = "Edit.jsp";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);

    }
}
