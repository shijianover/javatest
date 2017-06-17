/**
 * 
 */
package shijiantest;

/**
 * @author Timesupsj
 *下午9:09:28
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	int	intArr[] = new int[]{1,345,2354,6752,423,65,423};
	quickSorted(intArr,0,intArr.length-1);
	for(int x:intArr)
		System.out.println(x);

	}
	public static void quickSorted(int intArr[],int lowindex,int highindex){
		int low = lowindex;
		int high  = highindex;
		int mid;
		if(highindex>lowindex){
			mid = intArr[(highindex+lowindex)/2];
			while(low<=high){
				while((low<highindex)&&(intArr[low]<mid))
					++low;
				while((high>lowindex)&&(intArr[high]>mid))
					--high;
				if(low<=high){
					swap(intArr,low,high);
					++low;
					--high;
				}
			}
			if(lowindex<high)
				quickSorted(intArr,lowindex,high);
			if(low<highindex)
				quickSorted(intArr,low,highindex);
			
		}
		
		
		
		
		
	}
	public static void swap(int intArr[],int i,int j){
		int tmp = intArr[i];
		intArr[i] = intArr[j];
		intArr[j] = tmp;
	}

	
}
