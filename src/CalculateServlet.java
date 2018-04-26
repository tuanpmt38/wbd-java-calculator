import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateServlet", urlPatterns = "/calculator")
public class CalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double number_1 = Double.parseDouble(request.getParameter("first_number"));
        double number_2 = Double.parseDouble(request.getParameter("second_number"));
        char operator = request.getParameter("operator").charAt(0);

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>  Result calculator : </h1>");
        try {
            double result = Calculate.calculator(number_1, number_2, operator);
            printWriter.println(number_1 + " " + operator + " " + number_2 + "=" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
