package iterator;

import java.util.Iterator;
import java.util.List;

public class StringIteratorNormal implements Iterator<String> {

	List<String> itens;
	int posicao = 0;
	
	public StringIteratorNormal(List<String> itens) {
		this.itens = itens;
	}
	
	@Override
	public boolean hasNext() {
		if(this.posicao >= itens.size() || this.itens.get(this.posicao) == null){//Se a posicao for igual ao tamanho da lista, não haverá próximo, pois estará no último
			return false;
		}
		return true;
	}

	@Override
	public String next() {
		String item = this.itens.get(this.posicao);
		this.posicao++;
		return item;
	}
}