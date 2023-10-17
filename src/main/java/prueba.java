

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.client.RestTemplate;
/**
 * Servlet implementation class prueba
 */
@WebServlet("/inicio")
public class prueba extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public prueba() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();

		response.getWriter().append("Served at: ").append(request.getContextPath());


		final String uriGetUsers= "https://jsonplaceholder.typicode.com/posts";
		// https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/web/client/RestTemplate.html
		RestTemplate restTemplate = new RestTemplate();

		String users= restTemplate.getForObject(uriGetUsers, String.class);
		System.out.println(users);


		request.setAttribute("data", users);


	    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/Inicio.jsp");
        dispatcher.forward(request, response);

	}

}
