package com.virtualpairprogrammers.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtualpairprogrammers.domain.Book;
import com.virtualpairprogrammers.services.BookService;

public class AddNewBookServlet extends HttpServlet
{
	public void doPost (HttpServletRequest request, 
					     HttpServletResponse response) 
			throws ServletException,IOException
	{
		// do the work and render a response.
		BookService service = BookService.getService();
		String isbn = request.getParameter("ISBN");
		String title = request.getParameter("TITLE");
		String author = request.getParameter("AUTHOR");		
		double price = new Double(request.getParameter("PRICE"));
		
		Book newBook = new Book(isbn, title, author, price);
		service.registerNewBook(newBook);
		
		// Forward to a JSP page to inform the user all is well
		ServletContext context = getServletContext();
		RequestDispatcher dispatch = context.getRequestDispatcher("/book-added.jsp");
		dispatch.forward(request,response);
	}
}
