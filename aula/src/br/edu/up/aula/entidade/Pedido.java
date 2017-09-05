package br.edu.up.aula.entidade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToMany(mappedBy="pedido",cascade=CascadeType.ALL)
	private List<ItemPedido> itemPedidos = new ArrayList<ItemPedido>();

	/*public static void main(String[] args) {
		Pedido p = new Pedido();
		p.setId(null);
		p.setItemPedidos(new ArrayList<ItemPedido>());
		
		ItemPedido ip = new ItemPedido();
		ip.setId(null);
		ip.setPedido(p);
		ip.setQtde(2);
		ip.setProduto(produtoA);
		
		p.getItemPedidos().add(ip);
		
		new PedidoDao().salvar(p);
		
	}*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ItemPedido> getItemPedidos() {
		return itemPedidos;
	}

	public void setItemPedidos(List<ItemPedido> itemPedidos) {
		this.itemPedidos = itemPedidos;
	}

}
