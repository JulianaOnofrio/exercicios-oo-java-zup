package br.com.zup.domain.builder;
import br.com.zup.domain.Empresa;
import java.time.LocalDate;

public class EmpresaBuilder{

    private static EmpresaBuilder uniqueInstance = new EmpresaBuilder();

    public static EmpresaBuilder getInstance() {
        return uniqueInstance;
    }
        public EmpresaBuilder() {

        }

    public Empresa build() {
        Empresa empresa = new Empresa();
        empresa.setNomeFantasia("ZUP INNOVATION");
        empresa.setDataAbertura(LocalDate.of(2000,10,10));
        empresa.setUnidades(UnidadeBuilder.getInstance().buildUnidades());
        empresa.setFuncionarios(FuncionarioBuilder.getInstance().buildFuncionarios(empresa));
        return empresa;
    }
}



