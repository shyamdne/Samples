
public class StringBufferTest {
	
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		
		// CONstructors in string buffer class
		
		// stringbuffer class create 16 elements value empty object created	

		System.out.println(stringBuffer);
		System.out.println(stringBuffer.capacity());
		
		// only specified element value  capacity(int value);
		System.out.println();
		StringBuffer stringBuffer1 = new StringBuffer(10);
		System.out.println(stringBuffer1);
		System.out.println(stringBuffer1.capacity());
		
		System.out.println();
		// with specified data means abc+16 elements =19
		StringBuffer stringBuffer2 = new StringBuffer("abc");
		System.out.println(stringBuffer2);
		System.out.println(stringBuffer2.capacity());
		
			}
	
}
