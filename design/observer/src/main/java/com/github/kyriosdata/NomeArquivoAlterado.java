package com.github.kyriosdata;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Um simples interessado em mudanças em um diretório que, neste caso,
 * limita-se a exibir o nome do arquivo que foi alterado.
 */
public class NomeArquivoAlterado implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(evt.getNewValue());
    }
}
