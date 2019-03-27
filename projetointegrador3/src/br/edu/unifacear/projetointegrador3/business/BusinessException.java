package br.edu.unifacear.projetointegrador3.business;

public class BusinessException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BusinessException(String erro) {
		super(erro);
	}

}
