
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.dilshada123.respository.StudentRespository;

/**
 * Servlet implementation class StudentController
 */

@SuppressWarnings("serial")
public class StudentController extends HttpServlet {
	private StudentRespository studentRespository;

	private static String guest_details = "content/guestdetails.jsp";
	private static String LOGIN_SUCCESS = "content/success.jsp";
	private static String LOGIN_FAILURE = "content/failure.jsp";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentController() {
		super();
		studentRespository = new StudentRespository();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {	
		String forward = STUDENT_SIGNUP;
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String pageName = request.getParameter("pageName");
		String forward = "";		
		
	

				studentRepository.save(
						request.getParameter("first_name"),
						request.getParameter("last_name"),
						request.getParameter("date_of_birth"),
						request.getParameter("email_ID"));
				forward = guest_details;
			} 
		}
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
	}
}
