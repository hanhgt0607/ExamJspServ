package exam.controller;

import com.googlecode.objectify.ObjectifyService;
import exam.entity.employee;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class employeeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/employee.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectifyService.register(employee.class);
        String fullName = req.getParameter("fullName");
        String birthday = req.getParameter("birthday");
        String address = req.getParameter("address");
        String position = req.getParameter("position");
        String deparment = req.getParameter("deparment");
        employee ee = new employee();
        ee.setFullName(fullName);
        ee.setAddress(address);
        ee.setBirthday(birthday);
        ee.setDepartment(deparment);
        ee.setPosition(position);
        ofy().save().entity(ee).now();

        resp.getWriter().println("thanh cong ");



    }
}
