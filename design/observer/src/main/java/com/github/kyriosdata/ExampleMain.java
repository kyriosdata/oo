package com.github.kyriosdata;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ExampleMain {

    public static void main(String[] args) {
        MudancaEmDiretorio observable = new MudancaEmDiretorio();

        observable.adicionaObserver(new NomeArquivoAlterado());
        observable.adicionaObserver(new TamanhoNomeArquivoAlterado());

        observable.geraMudanca("um novo arquivo");
    }
}

class MudancaEmDiretorio {
    private final PropertyChangeSupport support =
            new PropertyChangeSupport(this);

    public void geraMudanca(String arquivo) {
        support.firePropertyChange("arquivo", null, arquivo);
    }

    public void adicionaObserver(PropertyChangeListener observer) {
        support.addPropertyChangeListener("arquivo", observer);
    }
}

class NomeArquivoAlterado implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(evt.getNewValue());
    }
}

class TamanhoNomeArquivoAlterado implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(evt.getNewValue().toString().length());
    }
}
