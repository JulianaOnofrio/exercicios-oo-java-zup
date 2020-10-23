package br.com.zup.builder;

import br.com.zup.domain.Empresa;
import br.com.zup.utils.FuncionarioUtils;
import br.com.zup.utils.UnidadeUtils;

import java.time.LocalDate;

public class EmpresaBuilder {

    private static EmpresaBuilder uniqueInstance = new EmpresaBuilder();

    public static EmpresaBuilder getInstance() {
        return uniqueInstance;
    }

    private EmpresaBuilder() {

    }

    public Empresa build() {
        Empresa empresa = new Empresa();
        empresa.setNomeFantasia("ZUP INNOVATION");
        empresa.setDataAbertura(LocalDate.of(2000, 10, 10));
        empresa.setUnidades(UnidadeUtils.gerarUnidades(6));
        empresa.setFuncionarios(FuncionarioUtils.gerarFuncionarios(empresa.getUnidades(),3));
        return empresa;
    }
}



