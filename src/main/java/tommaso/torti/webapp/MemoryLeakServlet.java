package tommaso.torti.webapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemoryLeakServlet extends HttpServlet {

	private List list = new ArrayList();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		for (int i = 0; i < 100; i++) {
			Random random = new Random();
			list.add(random.nextInt());
		}
		response.getWriter().print("Now list contains " + list.size() + " elements");
	}

}
