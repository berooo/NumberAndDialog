/*********名称:InAndOut.java*********
*功能:System.out和System.in的基本使用*/

import java.io.IOException;
import java.util.Scanner;

public class InAndOut {

	public static void main(String[] args) throws IOException 
	{
		//建立一个Scanner
		Scanner input=new Scanner(System.in); 
		
		
		System.out.print("请输入一个带四位小数的数字:");
		//读取浮点数字符串
		double normalfloat=input.nextDouble();
		//用printf输出浮点数
		System.out.printf("保留两位小数为： %.2f\n", normalfloat);
		
		
		System.out.print("请输入一个数：");
		//读取整数字符串
		int normalint=input.nextInt();
		//用printf输出整数
		System.out.printf("你输入的数为 %d\n",normalint);
		
		
		System.out.print("请输入一个整数，它将变成浮点数：");
		//用nextInt读浮点数字符串
		double a =input.nextInt();
		//用printf输出浮点数
		System.out.printf("你的输入为：%f\n", a);
		
		
		System.out.print("请输入一个浮点数，它将变为一个整数");
		//nextDouble读整数字符串
		int b=(int) input.nextDouble();
		//用printf输出整数
		System.out.printf("你的输入为：%d\n", b);
		
		
		System.out.print("请输入5个数：");
		int cout=0;
		//.hasNext()的使用
		while(input.hasNext())
		{
			cout++;
			//.next()的使用
			String number=input.next();
			//println的使用
			System.out.println("第"+cout+"个数是："+number+"\n");
			if(cout>=5)
				break;
		}
		
		try{
			//关闭输入流
			System.in.close();
			
			//测试输入流的关闭是否会影响外层Scanner
			String test="The function of Scanner has not been intervened";
			input.useDelimiter(test);
			System.out.println(input.next());
			
		}
		//用来捕获可能的IOException错误
		catch(IOException ex)
		{
			System.out.println("Error!");
		}//结束测试
		input.close();
		
	}//结束主函数

}//结束InAndOut类

