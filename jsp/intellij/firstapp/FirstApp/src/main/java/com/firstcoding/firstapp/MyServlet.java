package com.firstcoding.firstapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="myServlet", urlPatterns = "/my") // 하나만할땐 "", 여러개 들어갈땐 {}
public class MyServlet extends HttpServlet {

    @Override // Alt+Insert
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.setStatus(500);  // 응답상태 지정

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>MyServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>MyServlet</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
