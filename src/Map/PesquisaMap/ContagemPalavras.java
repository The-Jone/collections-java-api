package Map.PesquisaMap;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String linguagem, Integer contagem){
        contagemPalavrasMap.put(linguagem, contagem);
    }

    public void removerPalavra(String palavra){
        if(!contagemPalavrasMap.isEmpty()){
            contagemPalavrasMap.remove(palavra);
        }else{
            System.out.println("A Map está vazia!");
        }
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for(int contagem : contagemPalavrasMap.values()){
            contagemTotal =+ contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for(Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()){
            if(entry.getValue() > maiorContagem){
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }

    
}
