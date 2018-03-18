package pat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test1005 {

	public static void main(String[] args) {  
	    Scanner scan = new Scanner(System.in);  
	    int i = scan.nextInt();  
	    scan.nextLine();  
	    String strii = scan.nextLine();  
	    scan.close();  
	    String[] striiArr = strii.split(" ");      
	    int intArr[] = new int[i];  
	    for (int j = 0; j < i; j++) {  
	      intArr[j] = Integer.valueOf(striiArr[j]);  
	    }  
	    ArrayList<Integer> intArrList = new ArrayList<>();  
	    for (int eachInt : intArr) {  
	  
	      while (eachInt != 1) {  
	        if (eachInt % 2 == 0) {  
	          eachInt = eachInt / 2;  
	        } else {  
	          eachInt = (eachInt * 3 + 1) / 2;  
	        }  
	        intArrList.add(eachInt);  
	      }  
	  
	    }    
	    ArrayList<Integer> intArrListTwo = new ArrayList<>();  
	      
	    for(int intArrEle:intArr){  
	      if(!intArrList.contains(intArrEle)){  
	        intArrListTwo.add(intArrEle);  
	      }  
	    }      
	  
	    int[] IntegerToInt = new int[intArrListTwo.size()];  
	    int m = intArrListTwo.size();  
	    for(Integer ii:intArrListTwo){  
	      IntegerToInt[--m] = ii.intValue();  
	    }  
	    Arrays.sort(IntegerToInt);  
	    for(int n=intArrListTwo.size()-1;n>=1;n--){  
	      System.out.print(IntegerToInt[n]+" ");  
	    }  
	    System.out.println(IntegerToInt[0]);  
	  }  
	


}
