
package cosc2436.minrectanglesat;

/**
 *
 * @author Alex
 */
public class Search {
    //method to get count of groups using recursion
    public int groupCount(int[][] arr){
        int count = 0;
        
            for(int a = 0; a < arr.length; a++)
            {
                for(int b = 0; b < arr[a].length; b ++){
                    if(arr[a][b] == 1){
                        count++;
                        searchNear(arr, a, b);
                    }
                }
            }
            return count;
    }
    
    private void searchNear(int[][] arr, int i, int j){
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[i].length || arr[i][j] == 0) return;
        
        arr[i][j] = 0;
        searchNear(arr, i+1, j);
        searchNear(arr, i-1, j);
        searchNear(arr, i, j+1);
        searchNear(arr, i, j-1);
        return;
    }
}
