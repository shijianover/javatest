/**
 * 
 */
package shijiantest;

/**
 * @author Timesupsj
 *下午9:27:07
 */
public class Bubblesort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] test = new int[] {1,43,43,675,23,65,867};
		bubbleSort(test);
		for(int x:test)
			System.out.println(x);
	}
	static void bubbleSort(int intArr[]){
		for(int i=0;i<intArr.length-1;i++){
			for(int j=0;j<intArr.length-i-1;j++){
				if(intArr[j]>intArr[j+1]){
					int temp = intArr[j];
					intArr[j]=intArr[j+1];
					intArr[j+1] = temp;
				}
					
			}

		}
		
	}

}
