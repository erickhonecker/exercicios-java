package br.com.mini_curso;

public class par_ou_impa {

	public static void main(String[] args) {
	
	 String s = (100 & 1) == 0? "par": "impar";	
	 	System.out.println(s);
      	
	 	double i = 100;
       if(i%2 == 0) {
    	   System.out.println("par");
       }else {
    	   System.out.println("impar");
       }
       
       
	}

}
