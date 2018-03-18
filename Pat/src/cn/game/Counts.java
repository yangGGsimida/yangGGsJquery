package cn.game;


public enum Counts {
	 ACE("A"), NUM2("2"), NUM3("3"), NUM4("4"),NUM5("5"),NUM6("6"),NUM7("7"),NUM8("8"),NUM9("9"),NUM10("10"),J("J"),Q("Q"),K("K");  
    
    String value;  
      
    Counts(String value) {  
        this.value = value;  
    }  
      
    public String getValue() {  
        return value;  
    }  

}
