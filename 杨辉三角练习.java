/*�����������
1
11
121
1331
14641
*/
//ÿ�еĵ�һ�к����һ�ж���һ
//ÿ������������һ�е�������ǰ��һ����֮�͡�
import java.util.Scanner;
class yanghui{
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			System.out.println("��������n��ֵ");
			int n=sc.nextInt();
	
		
	
				int[][] a=new int[n][n];
				for(int x=0;x<a.length;x++){
					a[x][0]=1;
					a[x][x]=1;
					
				}
		
			for(int x=2;x<a.length;x++){
				for(int y=1;y<a[x].length-1;y++){
					a[x][y]=a[x-1][y-1]+a[x-1][y];
					
				}
					
			}
			for(int x=0;x<a.length;x++){
				for(int y=0;y<=x;y++){
					System.out.print(a[x][y]+"\t");
				
				}
				System.out.println();
			}
			for(int x=0;x<a.length;x++){
				for(int y=0;y<a[x].length;y++){
					System.out.print(a[x][y]+"\t");
				}
				System.out.println();
			}
		}
}

