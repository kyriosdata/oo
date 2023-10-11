package com.github.kyriosdata;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Classe que representa um observável para eventuais
 * mudanças que ocorrem num diretório. Apenas simula
 * mudanças em arquivos com o método {@link #simulaMudancas()}.
 */
public class MudancaEmDiretorioObservable {
    private final PropertyChangeSupport support =
            new PropertyChangeSupport(this);

    public void detectadaMudancaEm(String arquivo) {
        PropertyChangeEvent evento = new PropertyChangeEvent("dir",
                "arquivo",
                null, arquivo);
        support.firePropertyChange(evento);
    }

    public void registraInteressadoEmMudancas(PropertyChangeListener observer) {
        support.addPropertyChangeListener("arquivo", observer);
    }

    /**
     * Simula mudanças em arquivos.
     */
    public void simulaMudancas() {
        detectadaMudancaEm("a.txt");
        detectadaMudancaEm("b.txt");
        detectadaMudancaEm("c.txt");
    }
}
