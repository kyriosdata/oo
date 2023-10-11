package com.github.kyriosdata;

public class ExampleMain {

    public static void main(String[] args) {
        MudancaEmDiretorioObservable observable = new MudancaEmDiretorioObservable();

        observable.registraInteressadoEmMudancas(new NomeArquivoAlterado());
        observable.registraInteressadoEmMudancas(new TamanhoNomeArquivoAlterado());

        observable.simulaMudancas();
    }
}

