//���󣺴���һ��������С��Ϸ��
/*������1�������һ��0-100�����֡�
		2����¼��һ������
		3���������ݽ��бȽϣ����������
		a����
		bС��
		c�����ˡ�
		4���ִ�У�ֱ�����С�
*/
import java.util.Scanner;
class shuzhi{
	public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			
			
			int m=(int)(Math.random()*100)+1;
		
			while(true){
				System.out.println("��������һ������");
				int n=sc.nextInt();
				if(n<m){
					System.out.println("С��");
				}
				else if(n==m){
					System.out.println("��ϲ�㣬�¶���");
					break;
				}
				else{
					System.out.println("����");
				}
				
				
			}
	}
}