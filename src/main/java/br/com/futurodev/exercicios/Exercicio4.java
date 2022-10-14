package br.com.futurodev.exercicios;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Exercicio4 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("modelo_formulario_post.html").forward(req, resp);

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

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

        Double media = ((nota1dbl+nota2dbl+nota3dbl+nota4dbl)/4);

        if (media > 7){
            writer.println("<h3>"+nome+" foi aprovado em "+disciplina+"! :D</h3>");
        }else if (media <=6.9 || media >6.0){
            writer.println("<h3>"+nome+", em recuperação em "+disciplina+"! :/ </h3>");
        }else{
            writer.println("<h3>"+nome+", reprovado em "+disciplina+"! =(</h3>");
        }
    }
}
