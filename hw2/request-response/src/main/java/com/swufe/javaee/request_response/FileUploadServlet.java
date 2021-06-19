package com.swufe.javaee.request_response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FileUploadServlet", value = "/FileUploadServlet")
@MultipartConfig
public class FileUploadServlet extends HttpServlet {
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Part part = request.getPart("avatar");
    part.write("C:\\Users\\满\\Pictures\\Saved Pictures\\2.jpg");
    response.sendRedirect("fileupload.html");
    }
}