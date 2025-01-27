package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");//setting the content type
        PrintWriter pw = res.getWriter();//get the stream to write the data

        //writing html in the stream
        pw.println("<html><body>");
        pw.println("Welcome to servlet");
        pw.println("</body></html>");

        pw.close();//closing the stream
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        // Example: Reading data from the request
        String name = req.getParameter("name"); // Reads "name" parameter from the POST body

        pw.println("<html><body>");
        pw.println("<h1>Welcome to servlet (POST)</h1>");
        if (name != null && !name.isEmpty()) {
            pw.println("<p>Hello, " + name + "!</p>");
        } else {
            pw.println("<p>Name not provided!</p>");
        }
        pw.println("</body></html>");
        pw.close();
    }
}
