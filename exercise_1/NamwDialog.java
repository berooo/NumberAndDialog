/*����:NameDialog.java*
*����:�Ի���Ļ�������*/

//������JOptionPane
import javax.swing.JOptionPane;

public class NamwDialog {

	public static void main(String[] args)
	{
		//��ʾ�û���������
		String name=
				JOptionPane.showInputDialog("What is your name?");
		
		//������Ϣ
		String message=
				String.format("Welcome,%s, to Java Programming.", name);
		
		//չʾ����������Ϣ�Ļ�ӭ����
		JOptionPane.showMessageDialog(null, message);
	}//����������

}//������NameDialog
