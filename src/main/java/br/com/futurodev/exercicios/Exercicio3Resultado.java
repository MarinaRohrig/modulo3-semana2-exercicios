package br.com.futurodev.exercicios;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Exercicio3Resultado extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<h1> Cadastro Preenchido!</h1>");

        String nome = req.getParameter("nome");
        String disciplina = req.getParameter("disciplina");
        String nota1 = req.getParameter("nota1");
        String nota2 = req.getParameter("nota2");
        String nota3 = req.getParameter("nota3");
        String nota4 = req.getParameter("nota4");

        Double nota1dbl = Double.parseDouble(nota1);
        Double nota2dbl = Double.parseDouble(nota2);
        Double nota3dbl = Double.parseDouble(nota3);
        Double nota4dbl = Double.parseDouble(nota4);


        writer.println("<h3><b>"+nome+"</b></h3>");
        writer.println("<ul>");
        writer.println("<li>Disciplina: <b>"+disciplina+"</b></li>");
        writer.printf("</br><li>Nota 1:   <b>%.2f</b></li>",nota1dbl,"");
        writer.printf("<li>Nota 2:   <b>%.2f</b></li>",nota2dbl,"");
        writer.printf("<li>Nota 3:   <b>%.2f</b></li>",nota3dbl,"");
        writer.printf("<li>Nota 4:   <b>%.2f</b></li>",nota4dbl,"");
        writer.printf("</br><li>Média:     <b>%.2f</b></li>",((nota1dbl+nota2dbl+nota3dbl+nota4dbl)/4),"");
        writer.println("</ul>");
    }
}
