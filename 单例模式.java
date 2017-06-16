/**
 * 
 */
package shijiantest;

/**
 * @author Timesupsj
 *下午10:01:24
 */
public class SingleMode {
	private static SingleMode instance;
	private SingleMode(){
		
	}
	public static SingleMode getSingleMode(){
		if(instance !=null){
			instance = new SingleMode();
		}
		return instance;
		
	}

}
