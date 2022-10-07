package br.com.futurodev.exercicios;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Application extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();

        String nome = req.getParameter("nome");
        String idade = req.getParameter("idade");
        String cidade = req.getParameter("cidade");

        writer.println("<h3> Exercício 1</h3>");
        writer.println("Olá "+nome+" você tem "+idade+" anos de idade e mora em: "+cidade+".");


    }
}
