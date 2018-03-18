package cn.string;

import org.junit.Test;

public class STRINGTEST {
	@Test
	public void Test() {
		String s0="helloworld";
	    String s1="helloworld";
	    String s2="hello"+"world";
	    System.out.println("===========test3============");
	    System.out.println(s0==s1); //true 可以看出s0跟s1是指向同一个对象 
	    System.out.println(s0==s2); //true 可以看出s0跟s2是指向同一个对象 
	}

}
