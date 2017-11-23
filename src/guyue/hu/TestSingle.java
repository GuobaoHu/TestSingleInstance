package guyue.hu;
/**
 * @author guyue
 * @date 2017��11��23�� ����9:42:01
 * @class describ:
 */
public class TestSingle {
	//����ģʽ
/*	private static TestSingle ts = new TestSingle();
	private TestSingle() {}
	public static TestSingle getInstance() {
		return ts;
	}*/
	
	//����ģʽ
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