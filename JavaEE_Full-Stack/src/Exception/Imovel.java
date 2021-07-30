package Exception;

public class Imovel {

	private int cod_imovel;
	private String endereco_imovel;
	private double preco_imovel;

	public Imovel(int cod_imovel, String endereco_imovel, double preco_imovel) {
		this.setCod_Imovel(cod_imovel);
		this.setEnd_Imovel(endereco_imovel);
		this.setPreco_Imovel(preco_imovel);
	}

	public int getCod_Imovel() {
		return cod_imovel;
	}

	public void setCod_Imovel(int cod_imovel) throws IllegalArgumentException {
		if (cod_imovel <= 0)
			throw new IllegalArgumentException("Tipo de Código inválido, deve ser maior que zero: " + cod_imovel);
		this.cod_imovel = cod_imovel;
	}

	public String getEnd_Imovel() {
		return endereco_imovel;
	}

	public void setEnd_Imovel(String endereco_imovel) throws IllegalArgumentException {
		if (endereco_imovel.equals(""))
			throw new IllegalArgumentException("Invalido, o campo está vazio!");
		this.endereco_imovel = endereco_imovel;
	}

	public double getPreco_Imovel() {
		return preco_imovel;
	}

	public void setPreco_Imovel(double preco_imovel) throws IllegalArgumentException {
		if (preco_imovel <= 0)
			throw new IllegalArgumentException("Este tipo preço inválido: " + preco_imovel);
		this.preco_imovel = preco_imovel;
	}
}