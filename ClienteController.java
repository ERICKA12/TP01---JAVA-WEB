package ericka.oliveira.model.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ericka.oliveira.model.domain.Aluno;


public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ClienteController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("home.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		Aluno aluno = new Aluno(request.getParameter("nome"), request.getParameter("email"));
		aluno.setSenha(request.getParameter("senha"));
		aluno.impressao();
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Cadastro de Usuario - Confirma</title>\r\n"
				+ "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "		<div class=\"container\">\r\n"
				+ "		 <h2> O aluno " + aluno.getNome()+ " foi cadastrado com sucesso!!"
				+ "<h4>"
				+ "Nome: " + aluno.getNome() + "\r\n"
				+ "<h4>" 
				+ " \r\nEmail: " + aluno.getEmail()
				+ "<h4>" 
				+"</h2>\r\n"
				+ "		 <form action=\"aluno\" method = \"get\"> \r\n"
				+ "		    <button type=\"submit\" class=\"btn btn-default\">Voltar</button>\r\n"
				+ "		  </form> \r\n"
				+ "		</div>\r\n"
				+ "</body>\r\n"
				+ "</html> ");
		
		
		
		
	//	request.getRequestDispatcher("confirmacao.html").forward(request, response);
		
	}

}
