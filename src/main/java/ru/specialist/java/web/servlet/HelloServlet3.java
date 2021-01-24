package ru.specialist.java.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

/**
 * Чтобы не прописывать развертывание в web.xml можно указать через аннотацию
 * указав адрес сервлета
 */

@WebServlet("/servlet3")
public class HelloServlet3 extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html; charset=UTF-8");
            PrintWriter out = resp.getWriter();
            out.print("<h1>Hello Servlet 3! Method 'GET'</h1><br/>");
            out.print("Username = " + req.getParameter("username"));
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html; charset=UTF-8");
            PrintWriter out = resp.getWriter();
            out.print("<h1>Hello Servlet 3! Method 'POST'</h1><br/>");
            out.print("Username = " + req.getParameter("username"));
        }
}
//3.55

