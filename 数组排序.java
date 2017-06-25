/**
 * 
 */
package test625;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Timesupsj
 *下午8:02:22
 */
//生成十个0~100之间的随机数，放到数组中，然后排序输出。（知识点：Math类取整,获得随机数等） [必做题]

public class SortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r1  = new Random();
		int []intArray = new int[10];
		for(int i = 0;i<intArray.length;i++){
			intArray[i] = r1.nextInt(100);
		}
		Arrays.sort(intArray);
		for(int x:intArray)
			System.out.println(x);
		

	}

}
