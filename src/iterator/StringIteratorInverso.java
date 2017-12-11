package iterator;

import java.util.Iterator;
import java.util.List;

public class StringIteratorInverso implements Iterator<String> {

	List<String> itens;
	int posicao = 0; // 0 caso seja uma lista normal, itens.size() - 1 pois � a inversa e come�ar� de tr�s para frente

	public StringIteratorInverso(List<String> itens) {
		this.itens = itens;
		this.posicao = itens.size() - 1;
	}

	@Override
	public boolean hasNext() {
		if(this.posicao < 0 || this.itens.get(this.posicao) == null){//se for o �ltimo (itens.size()) n�o haver� proximo, se for o primeiro (0) n�o haver� pr�ximo
			return false;
		}
		return true;
	}

	@Override
	public String next() {
		String item = this.itens.get(this.posicao);
		this.posicao--; //++ caso fosse uma lista normal, -- pois � a inversa
		return item;
	}

}
