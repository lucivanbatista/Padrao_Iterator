# Padrao_Iterator
Exemplo do Padrão Iterator - Lista String Invertendo e Normal

Exercício
1. Implemente uma nova coleção baseada na Interface List<E> que ao ser percorrida retorna os
elementos inseridos em ordem reversa. Sugestão: usar uma
  ◦ Sua nova lista deve poder ser usada da seguinte maneira:
      List<String> lista = new ListaReversa<String>();
      lista.add(“a”);
      lista.add(“b”);
      lista.add(“c”);
      for(String e: lista){
        System.out.println(e);
      }
  
      Saída esperada:
      c
      b
      a

  ◦ Escreva testes unitários (jUnit) que contemplem os seguintes cenários:
  ◦ Lista vazia
  ◦ Lista com apenas 1 elemento
  ◦ Lista com dois elementos
  ◦ Lista com cinco elementos
  ◦ Dois laços (foreach) em sequencia (verificar se ambos funcionam)
