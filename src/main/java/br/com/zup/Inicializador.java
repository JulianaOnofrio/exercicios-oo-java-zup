package br.com.zup;

import br.com.zup.domain.Empresa;
import br.com.zup.domain.builder.EmpresaBuilder;

public class Inicializador {

    public static void main(String[] args) {
        EmpresaBuilder empresaBuilder = new EmpresaBuilder();
        empresaBuilder.build();
        Empresa empresa = empresaBuilder.getEmpresa();
        System.out.println(empresa);
        System.out.println(EmpresaBuilder.getInstance());
        System.out.println(EmpresaBuilder.getInstance());
        System.out.println(EmpresaBuilder.getInstance());

    }
}



