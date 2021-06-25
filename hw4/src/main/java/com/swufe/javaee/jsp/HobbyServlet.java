package com.swufe.javaee.jsp;

import com.swufe.javaee.jsp.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.*;

@WebServlet(urlPatterns = "/hobbyFind")
public class HobbyServlet extends HttpServlet {
    private Map<String, List<String>> userHobby;
    @Override
    public void init() {
       userHobby = new HashMap<>();

       userHobby.put("Bob", Arrays.asList("skiing","extreme"));
       userHobby.put("Tom", Arrays.asList("skiing", "dating"));
       userHobby.put("James", Arrays.asList("scuba", "dating"));
       userHobby.put("Jone", Arrays.asList("scuba", "extreme"));
       userHobby.put("Fei", Arrays.asList("skiing", "dating"));
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String hobby = request.getParameter("hobby");
       List<String> names = new ArrayList<>();
       userHobby.forEach((k, v) -> {
           if (v.contains(hobby)) {
               names.add(k);
           }
       });
       request.setAttribute("names", names);
       request.setAttribute("hobby", hobby);
       request.getRequestDispatcher("hobbyResult.jsp").forward(request, response);
    }
}
