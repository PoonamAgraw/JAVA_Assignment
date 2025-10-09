import java.util.Scanner;

public class ArrayService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void acceptData(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Element:");
		for(int i=0;i <arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
	}

	public static void displayData(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print((arr)[i][j]+"\t");
		}
			System.out.println();
		}
		
	}

	public static int addAllElement(int[][] arr) {
		int sum =0;
		for(int i=0;i <arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum = sum +arr[i][j];
			}
		}
		return sum;
	}

	public static int[] rowWiseAddition(int[][] arr) {
		int [] temp = new int [arr.length];
		for(int i=0;i <arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				temp[i] = temp[i] +arr[i][j];
			}
		}
		return temp;
	}

	public static int[] columnWiseAddition(int[][] arr) {
		int [] temp = new int [arr[0].length];
		for(int i=0;i <arr[0].length;i++) {
			for(int j=0;j<arr.length;j++) {
				temp[i] = temp[i] +arr[j][i];
			}
		}
		return temp;
	}

	public static int maxOfAllElement(int[][] arr) {
		int max =arr[0][0];
		for(int i=0;i <arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(max <arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}

	public static int[] maxOfRowWise(int[][] arr) {
	    int [] max = new int [arr.length]; 
	    for(int i = 0; i < arr.length; i++) {
	        int rowMax = arr[i][0];
	        for(int j = 1; j < arr[i].length; j++) {
	            if (arr[i][j] > rowMax) {
	                rowMax = arr[i][j]; 
          }
	        }
	        max[i] = rowMax;
	    }
	    return max;
	}

	public static int[] maxOfColumnWise(int[][] arr) {
	    int [] max = new int [arr[0].length]; 
	    for (int col = 0; col < arr[0].length; col++) {
	        max[col] = arr[0][col];
	    }
	    for(int i = 1; i < arr.length; i++) { 
	        for(int j = 0; j < arr[i].length; j++) {
	            if (arr[i][j] > max[j]) {
	                max[j] = arr[i][j];
	            }
	        }
	    }
	    return max;
	}

	public static int[][] addTwoArray(int[][] arr, int[][] arr1) {
		int [][] temp = new int [arr.length][arr[0].length];
		for(int i=0;i <arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				temp[i][j] = arr[i][j] +arr1[i][j];
			}
		}
		return temp;
	}

	public static int[][] multiplyTwoArray(int[][] arr, int[][] arr1) {
		int [][] temp = new int [arr.length][arr[0].length];
		for(int i=0;i <arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				for(int k=0;k<arr[0].length;k++) {
				temp[i][j] = arr[i][k] +arr1[k][j];
			}
		}
		}
		return temp;
	}

	public static int[][] transpose(int[][] arr) {
		int [][] temp = new int [arr.length][arr[0].length];
		for(int i=0;i <arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				temp[i][j] = arr[j][i] ;
			}
		}
		return temp;
	}

	public static boolean identityMatrix(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if((i==j) && (arr[i][j]!=1)){
					return false;
				}else if((i!=j)&&(arr[i][j]!=0)){
					return false;
				}
			}
		}
		return true;
	}

	public static int[][] rotateRowWise(int[][] arr, int n) {
//		int[][] temp=new int[arr.length][arr[0].length];
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[0].length;j++) {
//				temp[i][j]=arr[i][j];
//			}
//		}
		int[] temp1 = arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp1;
		return arr;
	}

	public static int[][] rotateColumnWise(int[][] arr, int n) {
//		int[][] temp=new int[arr.length][arr[0].length];
//		for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr[0].length;j++) {
//			temp[i][j]=arr[i][j];
//		}
//		}
		int[] temp1=new int[arr.length];
		for(int i=0;i<temp1.length;i++) {
			temp1[i]=arr[i][arr[0].length-1];
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[0].length-2;j>=0;j--) {
				arr[i][j+1]=arr[i][j];
			}
		}
		for(int i=0;i<arr.length;i++) {
			arr[i][0]=temp1[i];
		}
		return arr;
	}


	public static int[] oneDArray(int[][] arr) {
		int[] temp=new int[arr.length*arr[0].length];
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				temp[cnt]=arr[i][j];
				cnt++;
			}
		}
		return temp;
	}

}
