package br.edu.up.aula4etapa.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import br.edu.up.aula4etapa.dao.JogoDao;
import br.edu.up.aula4etapa.dao.PedidoDao;
import br.edu.up.aula4etapa.entity.Item;
import br.edu.up.aula4etapa.entity.Jogo;
import br.edu.up.aula4etapa.entity.Pedido;
import br.edu.up.aula4etapa.entity.Usuario;

@ManagedBean(name = "mBeanCarrinho")
@SessionScoped
public class MBeanCarrinho {
	
	private ArrayList<Item> itens = new ArrayList<Item>();
	
	public String salvarPedido() {
		HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		Usuario u = (Usuario) req.getSession().getAttribute("usuario");
		
		Pedido p = new Pedido();
		p.setData(new Date());
		p.setItens(itens);	
		p.setUsuario(u);
		
		for (Item i : itens) {
			i.setPedido(p);
		}		
		
		new PedidoDao().inserir(p);
		
		return "";
	}
	
	public void adicionar(Integer idJogo) throws IOException {
		Jogo jogo = new JogoDao().buscar(idJogo);
		
		Item item = new Item();
		item.setJogo(jogo);
		item.setQuantidade(1);
		
		itens.add(item);
		
		FacesContext.
			getCurrentInstance().
			getExternalContext().redirect("telaCarrinhoDeCompras.jsf");	
		
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}	

}
