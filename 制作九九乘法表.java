//制作九九乘法表
/*1*1=1
  1*2=2 2*2=4
  1*3=3 2*3=4 3*3=9
  ...
  1*9=9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81
  */
  class Test{
		public static void main(String[]args){
				for(int x=1;x<=9;x++){
					for(int y=1;y<=x;y++){
						System.out.print(y+"*"+x+"="+y*x+"\t");
					}
					System.out.println();
				}
		}
		
  }