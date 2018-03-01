/*名称:NameDialog.java*
*功能:对话框的基本输入*/

//导入类JOptionPane
import javax.swing.JOptionPane;

public class NamwDialog {

	public static void main(String[] args)
	{
		//提示用户输入姓名
		String name=
				JOptionPane.showInputDialog("What is your name?");
		
		//创建信息
		String message=
				String.format("Welcome,%s, to Java Programming.", name);
		
		//展示带有姓名信息的欢迎界面
		JOptionPane.showMessageDialog(null, message);
	}//结束主函数

}//结束类NameDialog
