package com.ohgiraffers.section00.login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/forward")
public class RecieveLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userId = req.getParameter("userId");
        String password = req.getParameter("password");

        if(userId.equals(userId)){
            System.out.println("로그인이 성공했습니다. ");
        }

        System.out.println("userId = " + userId);
        System.out.println("password = " + password);

        req.setAttribute("userId", userId);

        RequestDispatcher rd = req.getRequestDispatcher("print");

        rd.forward(req, resp);

    }
}
