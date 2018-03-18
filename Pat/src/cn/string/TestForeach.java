package cn.string;

import java.util.Iterator;
import java.util.List;

public class TestForeach {
	  List<String> strings; 
	  
	  /**
	   * 我是文档注释哦
	   * 
	   * @return 没有return啦
	   */
	  public void display(){
		  Iterator<String> iterator = strings.iterator();  
      while(iterator.hasNext()){  
          String s = iterator.next();  
          System.out.println(s);  
      } 
	  }
	   

}