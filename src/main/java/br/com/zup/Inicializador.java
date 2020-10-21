package br.com.zup;

import br.com.zup.domain.Empresa;
import br.com.zup.domain.builder.EmpresaBuilder;

public class Inicializador {

    public static void main(String[] args) {
        Empresa empresa = EmpresaBuilder.getInstance().build();
        System.out.println(empresa);
        System.out.println(EmpresaBuilder.getInstance());
        System.out.println(EmpresaBuilder.getInstance());
        System.out.println(EmpresaBuilder.getInstance());

        //  TODO pesquisar sobre SOLID
        //  TODO verificar a estrutura de pastas, todas estão dentro de domain.
    }
}



