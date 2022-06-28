package com.example.homeworkdemo;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "homeworkServlet", value = "/homework-servlet")
public class HomeworkServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello Halyk Academy!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String job = request.getParameter("job");

        response.getWriter().println("Worker's name: " + name + ", job position: " + job);

    }

    public void destroy() {
    }
}