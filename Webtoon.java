

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

@WebServlet("/Webtoon")
public class Webtoon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// DB�� �ִ� ���� �����͸� WebtoonInfo ��ü�� ����
		// Webtoon.html�� ����
		
		// DB�� �ִ� ������ ����
		// ������ο� ������ �����
		// ���������̽��� �ڿ��� �ݿ���
		// ����ž SIU ������
		WebtoonInfo wt1 = new WebtoonInfo("������ο�", "������", "�����");
		WebtoonInfo wt2 = new WebtoonInfo("������", "�ڿ���", "�ݿ���");
		WebtoonInfo wt3 = new WebtoonInfo("����ž", "SIU", "������");
		
		ArrayList<WebtoonInfo> wtList = new ArrayList<WebtoonInfo>();
		wtList.add(wt1);
		wtList.add(wt2);
		wtList.add(wt3);
		
		// DB�� �ִ� �����͸� �����Դٰ� ����
		System.out.println("��û�� ���Դ�.");
		// �����͸� json Ÿ������ �ٲ۵� ��ȯ ���������
		// �ܺ� ���̺귯�� Gson �ʿ�
		
		// Gson��ü ����� --> �ڹ��� �����͸� json Ÿ������ �ٲپ� �ִ� ����
		Gson gson = new Gson();
		// JsonArray ��ü --> json Ÿ������ �ٲ� �����͸� ������ �� �ִ� ����
		JsonArray jarray = new JsonArray();
		
		for (int i = 0; i < wtList.size(); i++) {
			jarray.add(gson.toJson(wtList.get(i)));
			// gson ��ü�� ����Ѵٸ� Ű���� �˾Ƽ� ��������
			// Ű�� --> �ش��ϴ� ������
		}
		response.setContentType("text/plain; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.print(jarray);
		
	}

}
