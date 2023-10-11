package com.github.kyriosdata;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class NomeArquivoAlterado implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(evt.getNewValue());
    }
}
