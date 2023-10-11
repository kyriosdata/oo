package com.github.kyriosdata;

import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

import static java.nio.file.StandardWatchEventKinds.*;

public class MonitorarMudancasEmUmDiretorio {
    public static void main(String[] args) throws Exception {
        Path diretorio = Paths.get(args[0]);
        WatchService watcher = FileSystems.getDefault().newWatchService();

        diretorio.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);

        while (true) {
            // Aguarda até que algum evento ocorra
            WatchKey key = watcher.take();

            Path whatchablePath = (Path) key.watchable();
            for (WatchEvent<?> event : key.pollEvents()) {
                WatchEvent.Kind<?> kind = event.kind();
                Path pathRelativo = (Path) event.context();
                Path pathAbsoluto = whatchablePath.resolve(pathRelativo);

                if (kind == ENTRY_CREATE) {
                    System.out.println("Arquivo criado: " + pathAbsoluto);
                } else if (kind == ENTRY_DELETE) {
                    System.out.println("Arquivo removido: " + pathAbsoluto);
                } else if (kind == ENTRY_MODIFY) {
                    // Abaixo segue estratégia para evitar eventos duplicados
                    if (foiProcessadoRecentemente(pathAbsoluto)) {
                        System.out.println("Já foi processado. Inorando " + pathAbsoluto);
                    } else {
                        marcaProcessadoRecentemente(pathAbsoluto);
                        System.out.println("Arquivo modificado: " + pathAbsoluto);
                    }
                }
            }

            key.reset();
        }
    }

    private static final Map<Path, Long> processadosRecentemente = new HashMap<>();
    private static final long TEMPO_LIMITE = 1000; // 1 segundo

    private static boolean foiProcessadoRecentemente(Path arquivo) {
        Long tempoUltimoProcessamento = processadosRecentemente.get(arquivo);
        if (tempoUltimoProcessamento == null) {
            return false;
        }
        long tempoAtual = System.currentTimeMillis();
        return (tempoAtual - tempoUltimoProcessamento) < TEMPO_LIMITE;
    }

    private static void marcaProcessadoRecentemente(Path arquivo) {
        processadosRecentemente.put(arquivo, System.currentTimeMillis());
    }
}