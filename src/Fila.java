public class Fila {

    private Integer[] vetor;
    private int tamanho;

    public Fila(int capacidade) {
        this.vetor = new Integer[capacidade];
        this.tamanho = 0;
    }

    public void enfileirar(int valor) {
        if (tamanho >= vetor.length) {
            throw new IllegalStateException("fila cheia!");
        }
        // insere no final da fila
        vetor[tamanho] = valor;
        tamanho++;
    }

    public Integer desenfileirar() {
        if (filaVazia()) {
            throw new IllegalStateException("Fila vazia!");
        }
        Integer valor = vetor[0];

        // move todos os elementos uma posicao para a esquerda
        // para manter o inicio sempre no indice 0
        for (int i = 1; i < tamanho; i++) {
            vetor[i - 1] = vetor[i];
        }

        vetor[tamanho - 1] = null; //
        tamanho--;

        return valor;
    }

    public boolean filaVazia() {
        return tamanho == 0;
    }
}

