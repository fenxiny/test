package ms.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hellojava.business.UserService;
import com.hellojava.entity.User;


@WebServlet(name = "loginServlet", urlPatterns = { "/loginServlet" })
public class LoginServlet extends HttpServlet {

       

    public LoginServlet() {
        super();
    }
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String result="login.jsp";
		String userName=request.getParameter("userName");
		String userPwd=request.getParameter("userPwd");
		if(userName!=null && userPwd!=null) {
			Admin user=new Admin();
			adminUser.setAid(userName);
			adminUser.setApwd(userPwd);
			Employee employeeUser=new Employee();
			employeeUser.setAid(userName);
			employeeUser.setApwd(userPwd);
			AdminService userService=new AdminService();
			boolean bool1=userService.checkUser(adminUser);
			EmployeeService employeeService=new EmployeeService();
			boolean bool2=userService.checkUser(employeeUser);
			if(bool1) {
				result="admin.jsp";
				//request.getSession().setAttribute("user", user);
			}else if(bool2) {
				result="employee.jsp";
			}
			else {
				result="error.jsp";
			}
		}
	}

}
