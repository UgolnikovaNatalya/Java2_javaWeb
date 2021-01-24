package ru.specialist.java.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Locale;

/**
 * Класс для создания сервлета
 * resp.setContentType("text/html; charset = UTF-8") - важно! используется для
 * правильного отображения страницы. (тело ответа будет html и кодировка UTF-8
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset = UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("<h1>Hello<br/><h1>");
        out.print("Current time: " + LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss:SSS")));
        out.print("</br>");
        HttpSession session = req.getSession();
        out.print("Session ID: " + session.getId());
        out.print("</br>");
        out.print(session.isNew()?"New ": "Old " + "Session");
        out.print("</br>");
        out.print("Method: " + req.getMethod());
        out.print("</br>");
        out.print("Context Path: " + req.getContextPath());
        out.print("</br>");
        out.print("Servlet Path: " + req.getServletPath());
        out.print("</br>");


        out.print("</br>");
        out.print("<h>Headers<h4>");
        Iterator<String> iter = req.getHeaderNames().asIterator();
        while (iter.hasNext()){
            String name = iter.next();
            out.print(name + " = " + req.getHeader(name));
            out.print("</br>");
        }
    }
}
//3.00
