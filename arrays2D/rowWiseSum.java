
public class Solution {

	public static void rowWiseSum(int[][] mat) {
		//Your code goes here
		int r = mat.length;
		if(r==0){
			return;
		}
		int c = mat[0].length;
		
		for(int i = 0;i<r;i++){
			int s = 0;
			for(int j = 0;j<c;j++){
				s = s + mat[i][j];
			}
			System.out.print(s + " ");
		} 
	}

}
