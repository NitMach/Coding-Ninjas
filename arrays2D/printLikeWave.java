
public class Solution {

	public static void wavePrint(int arr[][]){
		//Your code goes here
		int rows = arr.length;
		if (rows == 0) {
			return;
		}
		int cols = arr[0].length;
		for(int j=0;j<cols;j++){
            //for all even cols i is toptodown for all odd cols i is bottom to up use that
            if(j%2==0){ //for even cols i is from 0 to rows, top to down
              for(int i=0;i<rows;i++){
                  System.out.print(arr[i][j]+ " ");
              }
            }else{ //in odd cases i is from rows-1 to 0 from bottom to up
              for(int i=rows-1;i>=0;i--){
                  System.out.print(arr[i][j]+ " ");
              }
            } 
        }
	}

}
