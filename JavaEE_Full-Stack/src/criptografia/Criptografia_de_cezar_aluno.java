package criptografia;

public class Criptografia_de_cezar_aluno {
	public static String Encrypt (String message, int shift){
        String messageCrypt = "";
        int asc = 0;
        char ch2 = ' ';
        for(int i = 0; i < message.length(); i++){
            if(message.charAt(i) != 32){
                asc = (message.charAt(i) + shift);           
                ch2 = (char)asc;
                messageCrypt += ch2;
            }
            else{
                ch2 = ' ';
                messageCrypt += ch2;
            }
        }
        return messageCrypt;
    } 
}
