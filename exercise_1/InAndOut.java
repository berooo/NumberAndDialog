/*********����:InAndOut.java*********
*����:System.out��System.in�Ļ���ʹ��*/

import java.io.IOException;
import java.util.Scanner;

public class InAndOut {

	public static void main(String[] args) throws IOException 
	{
		//����һ��Scanner
		Scanner input=new Scanner(System.in); 
		
		
		System.out.print("������һ������λС��������:");
		//��ȡ�������ַ���
		double normalfloat=input.nextDouble();
		//��printf���������
		System.out.printf("������λС��Ϊ�� %.2f\n", normalfloat);
		
		
		System.out.print("������һ������");
		//��ȡ�����ַ���
		int normalint=input.nextInt();
		//��printf�������
		System.out.printf("���������Ϊ %d\n",normalint);
		
		
		System.out.print("������һ��������������ɸ�������");
		//��nextInt���������ַ���
		double a =input.nextInt();
		//��printf���������
		System.out.printf("�������Ϊ��%f\n", a);
		
		
		System.out.print("������һ����������������Ϊһ������");
		//nextDouble�������ַ���
		int b=(int) input.nextDouble();
		//��printf�������
		System.out.printf("�������Ϊ��%d\n", b);
		
		
		System.out.print("������5������");
		int cout=0;
		//.hasNext()��ʹ��
		while(input.hasNext())
		{
			cout++;
			//.next()��ʹ��
			String number=input.next();
			//println��ʹ��
			System.out.println("��"+cout+"�����ǣ�"+number+"\n");
			if(cout>=5)
				break;
		}
		
		try{
			//�ر�������
			System.in.close();
			
			//�����������Ĺر��Ƿ��Ӱ�����Scanner
			String test="The function of Scanner has not been intervened";
			input.useDelimiter(test);
			System.out.println(input.next());
			
		}
		//����������ܵ�IOException����
		catch(IOException ex)
		{
			System.out.println("Error!");
		}//��������
		input.close();
		
	}//����������

}//����InAndOut��

