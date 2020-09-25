package br.com.zup.domain.builder;
import br.com.zup.domain.Empresa;
import java.time.LocalDate;

public class EmpresaBuilder{

    private static Empresa empresa;
    private static EmpresaBuilder uniqueInstance = new EmpresaBuilder();

    public static EmpresaBuilder getInstance() { return uniqueInstance; }
    public Empresa getEmpresa() {
        return empresa;
    }

        public EmpresaBuilder() {this.build();}

    public void build() {
        empresa = new Empresa();
        empresa.setNomeFantasia("ZUP INNOVATION");
        empresa.setDataAbertura(LocalDate.of(2000,10,10));
        empresa.setUnidades(UnidadeBuilder.getInstance().buildUnidades());
        empresa.setFuncionarios(FuncionarioBuilder.getInstance().buildFuncionarios(empresa.getUnidades()));

    }
}



