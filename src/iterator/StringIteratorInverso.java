package iterator;

import java.util.Iterator;
import java.util.List;

public class StringIteratorInverso implements Iterator<String> {

	List<String> itens;
	int posicao = 0; // 0 caso seja uma lista normal, itens.size() - 1 pois é a inversa e começará de trás para frente

	public StringIteratorInverso(List<String> itens) {
		this.itens = itens;
		this.posicao = itens.size() - 1;
	}

	@Override
	public boolean hasNext() {
		if(this.posicao < 0 || this.itens.get(this.posicao) == null){//se for o último (itens.size()) não haverá proximo, se for o primeiro (0) não haverá próximo
			return false;
		}
		return true;
	}

	@Override
	public String next() {
		String item = this.itens.get(this.posicao);
		this.posicao--; //++ caso fosse uma lista normal, -- pois é a inversa
		return item;
	}

}
