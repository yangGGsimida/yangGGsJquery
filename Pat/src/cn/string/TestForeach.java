package cn.string;

import java.util.Iterator;
import java.util.List;

public class TestForeach {
	  List<String> strings; 
	  
	  /**
	   * �����ĵ�ע��Ŷ
	   * 
	   * @return û��return��
	   */
	  public void display(){
		  Iterator<String> iterator = strings.iterator();  
      while(iterator.hasNext()){  
          String s = iterator.next();  
          System.out.println(s);  
      } 
	  }
	   

}