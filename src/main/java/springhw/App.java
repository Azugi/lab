package springhw;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhw.beans.HelloBean;

public class App {

	public static void main(String[] args) {
		// ������� �������� ���������� �� xml �����("src/main/resources/applicationContext.xml")
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // ��������� ��� (������)
        HelloBean hb = ctx.getBean("firstBean", HelloBean.class);
        // �������� ������ � �������
        System.out.println(hb);
        // ��������� �������� ���������� 
        ctx.close();
	}

}
