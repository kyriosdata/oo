package com.github.kyriosdata;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Um simples interessado ou observador (Observer) de mudanças
 * em um objeto observável (Observable). Neste caso, este
 * interessado limita-se a exibir o tamanho do nome do arquivo
 * alterado.
 */
public class TamanhoNomeArquivoAlterado implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(evt.getNewValue().toString().length());
    }
}
