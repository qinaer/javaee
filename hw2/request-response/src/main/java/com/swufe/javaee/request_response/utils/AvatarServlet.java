package com.swufe.javaee.request_response.utils;
import com.talanlabs.avatargenerator.Avatar;
import com.talanlabs.avatargenerator.TriangleAvatar;

import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet(name = "AvatarServlet", value = "/AvatarServlet")
public class AvatarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Avatar avatar = TriangleAvatar.newAvatarBuilder().build();

        response.setContentType("image/png");
        BufferedImage image = avatar.create(123456L);
        OutputStream out = response.getOutputStream();
        ImageIO.write(image, "png", out);
    }
}