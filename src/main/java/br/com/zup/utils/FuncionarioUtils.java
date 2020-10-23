package br.com.zup.utils;

import br.com.zup.builder.FuncionarioBuilder;
import br.com.zup.domain.Funcionario;
import br.com.zup.domain.Unidade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FuncionarioUtils {
    private static List<String> nomes = new ArrayList<String>(Arrays.asList("João", "Maurício", "Francisco", "Caio", "Roberto", "Vitor"));
    private static List<String> sobrenomes = new ArrayList<String>(Arrays.asList("Alves", "Oliveira", "Guedes", "Marcos", "Onofrio", "Salles"));


    public static String geraNome() {
        int indice = new Random().nextInt(nomes.size());
        String nome = nomes.get(indice);
        return nome;
    }

    public static String geraSobrenome() {
        int indice = new Random().nextInt(sobrenomes.size());
        String sobrenome = sobrenomes.get(indice);
        return sobrenome;
    }
    public static List<Funcionario> gerarFuncionarios(List<Unidade> unidades, int quantidade) {
        List<Funcionario> funcionarios = new ArrayList<>();
        while (quantidade > 0) {

            Unidade unidade = unidades.get(GerarInteiroAleatorioUtils.gerarInteiro(unidades.size()));
            Funcionario funcionario = FuncionarioBuilder.getInstance()
                    .random()
                    .nome(FuncionarioUtils.geraNome())
                    .sobrenome(FuncionarioUtils.geraSobrenome())
                    .endereco(EnderecoUtils.gerarEndereco())
                    .unidade(unidade)
                    .dataAdmissao(DataUtils.geraDataAdmissao())
                    .dataNascimento(DataUtils.geraDataNascimento())
                    .beneficios(BeneficioUtils.gerarBeneficios(unidade.getEndereco().getEstado()))
                    .build();

            unidade.getFuncionarios().add(funcionario);
            funcionarios.add(funcionario);

            quantidade--;
        }

        return funcionarios;
    }
}

//TODO fazer testes dos utils e ver se os testes estão em lugares certos
//TODO usar os faker para gerar os nomes