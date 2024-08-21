class Example7 {
	public static void main(String[]args){
		System.out.println("10+20+30"); 				//Line1 10+20+30
		System.out.println("10+20"+"30");     			//Line2 10+2030
		System.out.println("10"+"20+30");     			//Line3 1020+30
		System.out.println("10"+"20"+"30");   			//Line4 102030
		System.out.println(10+"20"+"30");   			//Line5 102030
		System.out.println("10"+20+"30");     			//Line6 102030
		System.out.println("10"+"20"+30);     			//Line7 102030
		System.out.println(10+"20"+30);     			//Line8 102030
		System.out.println("10"+20+30);     			//Line9 102030
		System.out.println(10+20+"30");     			//Line10 3030
		System.out.println(10+20+30);					//Line11 60
		System.out.println("10"+(20+30));     			//Line12 1050
		     	
		
	}
}

