package guyue.hu;
/**
 * @author guyue
 * @date 2017年11月23日 下午9:42:01
 * @class describ:
 */
public class TestSingle {
	//饿汉模式
/*	private static TestSingle ts = new TestSingle();
	private TestSingle() {}
	public static TestSingle getInstance() {
		return ts;
	}*/
	
	//懒汉模式
	private static volatile TestSingle ts = null;
	private TestSingle() {}
	public static TestSingle getInstance() {
		if(null == ts) {
			synchronized(TestSingle.class) {
				if(null == ts) {
					ts = new TestSingle();
				}
			}
		}
		return ts;
	}
}