//需求：创建一个猜数字小游戏。
/*分析：1随机生成一个0-100的数字。
		2键盘录入一个数字
		3将两个数据进行比较，给出结果。
		a大了
		b小了
		c猜中了。
		4多次执行，直到猜中。
*/
import java.util.Scanner;
class shuzhi{
	public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			
			
			int m=(int)(Math.random()*100)+1;
		
			while(true){
				System.out.println("请你输入一个数据");
				int n=sc.nextInt();
				if(n<m){
					System.out.println("小了");
				}
				else if(n==m){
					System.out.println("恭喜你，猜对了");
					break;
				}
				else{
					System.out.println("大了");
				}
				
				
			}
	}
}