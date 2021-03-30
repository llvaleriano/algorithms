package pesquisa;

public class PesquisaBinaria {

    private int pesquisar(Integer[] dados, int valor) {
        int inferior = 0;
        int superior = dados.length;
        int iteracoes = 0;

        while (superior  >= 1) {
            System.out.println("Iteracao: " + ++iteracoes);
            int chute = (superior + inferior)/2;

            if (dados[chute] == valor) {
                return chute;
            }

            if (dados[chute] < valor) {
                inferior = chute;
            }

            if (dados[chute] > valor) {
                superior = chute;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        PesquisaBinaria pb = new PesquisaBinaria();
        Integer[] dados = pb.criarArray(100000000);
        String msg = "O dado procurado está na posição: ";
        System.out.println(msg + pb.pesquisar(dados, 2));
    }

    private Integer[] criarArray(int tamanho) {
        long horaInicio = System.currentTimeMillis();
        Integer[] dados = new Integer[tamanho];
        for (int i = 0; i < tamanho; i++) {
            dados[i] = i;
        }
        long horaFim = System.currentTimeMillis();
        long duracao = horaFim-horaInicio;
        System.out.println("Tempo para inicialização do array: " + duracao + " milisegundos");

        return dados;
    }
}
