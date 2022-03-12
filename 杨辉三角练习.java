/*杨辉三角如下
1
11
121
1331
14641
*/
//每行的第一列和最后一列都是一
//每个数等于它上一行的数和其前面一个数之和。
import java.util.Scanner;
class yanghui{
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			System.out.println("请你输入n的值");
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

