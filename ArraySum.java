package test;

public class ArraySum {
	 public static void main(String[] args) {

	        int[][] arr = new int[3][4];
	        int sum = 0;

	        // 랜덤 숫자 넣기
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 4; j++) {
	                arr[i][j] = (int)(Math.random() * 10);
	            }
	        }

	        // 출력하면서 합계 구하기
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print(arr[i][j] + "\t");
	                sum = sum + arr[i][j];
	            }
	            System.out.println();
	        }

	        System.out.println("합은 " + sum);
	    }
	
}
