import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

public class UploadServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException
	{
		System.out.println("-----------------------------------------");
		System.out.println(" Init method is called in "
				+ this.getClass().getName());
		System.out.println("--------------------------------------");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
//String a=request.getParameter("demo");
		
		
		//System.out.println(a);
		MultipartRequest multipartRequest = new MultipartRequest(request,"D:\\uploaded_files");

		out.print("successfully uploaded");
		
		
//		String file="D:\\uploaded_files\\"+a;
//		BufferedReader reader=null;
//		String line="";
//		try {
//			reader=new BufferedReader(new FileReader(file));
//			while((line=reader.readLine()) != null)
//			{
//				String[] row=line.split(",");
//				for(String index:row) {
//					System.out.printf("%-10s", index);
//				}
//				System.out.println();
//			}
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		System.out.println("Success");


	}

	public void destroy()
	{
		System.out.println("-----------------------------------------");
		System.out.println(" destroy method is called in "
				+ this.getClass().getName());
		System.out.println("-----------------------------------------");
	}

}