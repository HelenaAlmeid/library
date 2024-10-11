package Hash;

public class Hash {
    private int tamanho;
    private int[] num;
    
    public Hash(int tamanho){
        this.tamanho = tamanho;
        this.num = new int[tamanho];
    }

    public int hash(int valor){
        if(valor < tamanho  && valor > 0){
            return valor;
        }
        boolean verificar = false;
        int valorMudificado = valor;
        while(verificar){
            if(valorMudificado % 2 == 0){
                valorMudificado = valor /2;
                if(valorMudificado < tamanho && valorMudificado > 0){
                    verificar = true;
                }
            }
            else{
                valorMudificado = valor / 3;
                if(valorMudificado < tamanho && valorMudificado > 0){
                    verificar = true;
                }
            }
        }
        return valorMudificado;
    }

    public void adicionarNumero(int valor){
        int chave = hash(valor);
        if(num[chave] != 0){


        }
    }
    
}
