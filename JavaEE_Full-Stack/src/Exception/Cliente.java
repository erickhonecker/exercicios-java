package Exception;





public class Cliente {
	private int codigo;
	private String nome;
	private String CPF;
	public Cliente (int c, String n, String cpf) {
		setCodigo(c);
		setNome(n);
		setCPF(cpf);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) throws IllegalArgumentException {
		if (codigo <=0)
			throw new IllegalArgumentException("código inválido: "+codigo);
		this.codigo = codigo;
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) throws IllegalArgumentException {
		if (nome == null)
			throw new IllegalArgumentException("nome inválido! ");
		if (nome.equals(""))
			throw new IllegalArgumentException("nome vazio! ");

		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) throws IllegalArgumentException {
		if (cPF == null)
			throw new IllegalArgumentException("CPF inválido! ");
		if (cPF.equals(""))
			throw new IllegalArgumentException("CPF vazio! ");

		CPF = cPF;
	}

	// MAIN
	public static void main(String[] args) {
		Cliente c = new Cliente(14, "Beatriz Arruda", "");
		System.out.println(c);
	
		Produto p = new Produto(78, "TV 50 polegadas", -5000);
		System.out.println(p);
	}
	
	
	//Class Produto
		}

		class Produto {
		private int codigo;
		private String nome;
		private double preço;
		public Produto (int c, String n, double p) {
		setCodigo(c);
		setNome(n);
		setPreço(p);
		}

		 public int getCodigo() {
		return codigo;
		}

		 public void setCodigo(int codigo) throws IllegalArgumentException {
		if (codigo <=0)
		throw new IllegalArgumentException("código inválido: "+codigo);

		 this.codigo = codigo;
		}

		 public String getNome() {
		return nome;
		}

		 public void setNome(String nome) throws IllegalArgumentException {
		if (nome == null)
		throw new IllegalArgumentException("nome inválido! ");
		if (nome.equals(""))
		throw new IllegalArgumentException("nome vazio! ");
		this.nome = nome;
		}

		 public double getPreço() {
		return preço;
		}

		 public void setPreço(double preço) throws IllegalArgumentException {
		if (preço <=0)
		throw new IllegalArgumentException("Preço inválido: "+preço);

		 this.preço = preço;
		}


		}
	

