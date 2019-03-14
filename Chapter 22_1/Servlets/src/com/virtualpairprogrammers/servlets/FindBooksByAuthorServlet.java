package com.virtualpairprogrammers.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtualpairprogrammers.domain.Book;
import com.virtualpairprogrammers.services.BookService;

public class FindBooksByAuthorServlet extends HttpServlet
{
	public void service (HttpServletRequest request, 
						 HttpServletResponse response) 
			throws ServletException,IOException
	{
		// do the work - find all books by the supplied author
		BookService service = BookService.getService();
		
		// form handling - extracting a parameter from the form
		String author = request.getParameter("AUTHOR");
		String targetPage;
		
		if (author.trim().equals(""))
		{
			request.setAttribute("message", "Please fill in a name for the author");
			targetPage = "/findByAuthor.jsp";
		}
		else
		{
			List<Book> allBooks = service.getAllBooksByAuthor(author);	
			request.setAttribute("allBooks", allBooks);
			targetPage = "/find-books-results.jsp";
		}
		
		RequestDispatcher dispatch = getServletContext().getRequestDispatcher(targetPage);
		dispatch.forward(request, response);		
	}
}
