
package ch3.startExample;

import ch3.dataBean.RequestData;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/ch3/startExample/Controller"})
public class Controller extends HttpServlet
{

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException
    {

        RequestData data = new RequestData();
        request.getSession().setAttribute("refData", data);

        data.setHobby(request.getParameter("hobby"));
        data.setAversion(request.getParameter("aversion"));

        incrementSharedVariable();

        String address = "Edit.jsp";

        if (request.getParameter("processButton") != null)
        {
            address = "Process.jsp";
        }
        else if (request.getParameter("confirmButton") != null)
        {
            address = "Confirm.jsp";
        }

        RequestDispatcher dispatcher =
                request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
    }

    public int accessCount = 0;

    public void incrementSharedVariable() {
        int temp = accessCount;
        temp++;
        System.out.println(temp);
        try{
            Thread.sleep(3000);
        } catch (InterruptedException ie) {

        }
        accessCount = temp;
    }
}