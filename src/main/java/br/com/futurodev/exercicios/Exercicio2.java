package br.com.futurodev.exercicios;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Exercicio2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();

        String login = req.getParameter("login");
        String senha = req.getParameter("senha");

        if (login.equalsIgnoreCase("admin")&&(senha.equalsIgnoreCase("password"))){
            writer.println("Bem-vindo usuário admin! :) ");
        }else{
            writer.println("Usuário e/ou senha inválidos! :( ");
        }

    }
}
