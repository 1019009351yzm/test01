import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld extends HttpServlet {
    private  String message;
    private  String name;
    private  int age;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h1>"+message+"<h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    public void init() throws ServletException {
       message="Hello World,this messages from servlet!";

    }

    @java.lang.Override
    public java.lang.String toString() {
        return "HelloWorld{" +
                "message='" + message + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

