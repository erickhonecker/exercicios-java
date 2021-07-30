package br.com.matrizes;

import java.math.BigInteger;

public class solucaoParaOmundo {

	public static void main(String[] args) {
		BigInteger x = new BigInteger("121212");
		BigInteger y = new BigInteger("121212");
		BigInteger z = new BigInteger("121212");
		
		BigInteger soma = new BigInteger("0");
		BigInteger soma2 = new BigInteger("0");
		
		x = x.pow(3);
		y = y.pow(3);
		z = z.pow(3);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		soma = x.add(y);
		soma2 = soma.add(z);
		System.out.println(soma2);
		
	}

}
