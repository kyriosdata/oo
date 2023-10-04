package com.github.kyriosdata;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * Aplicação que implementa solução proposta. O design, contudo,
 * não contempla adequadamente as questões abaixo:
 * <ul>
 *     <li>Arquivo de entrada pode ser "muito grande"</li>
 *     <li>Arquivo de entrada não existe</li>
 *     <li>Arquivo de saída não pode ser criado</li>
 *     <li>Arquivo de saída já existe</li>
 *     <li>Arquivo de entrada está em outro formato</li>
 *     <li>Arquivo de saída não pode ser escrito</li>
 *     <li>Arquivo de saída não pode ser fechado</li>
 *     <li>Arquivo de entrada não pode ser lido</li>
 *     <li>O separador não é ,</li>
 *     <li>Pelo menos um dos dois primeiros campos não é numérico</li>
 *     <li>Os valores podem ser reais e não inteiros</li>
 *     <li>Outras operações podem ser requisitadas no futuro sobre uma linha.</li>
 *     <li>Reúne questões da operação desejada e a interface com o usuário</li>
 *     <li>Dificuldade para testar (veja CsvTest)</li>
 * </ul>
 */
public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Forneça csv de entrada e csv de saída.");
            return;
        }

        String saida = Files.lines(Paths.get(args[0]))
                .map(Main::processaLinha)
                .collect(Collectors.joining());

        String out = args.length > 1 ? args[1] : args[0] + "_out.csv";
        Files.write(Paths.get(out), saida.getBytes());
    }

    public static String processaLinha(String linha) {
        String[] campos = linha.split(",");
        int soma = Integer.parseInt(campos[0]) + Integer.parseInt(campos[1]);
        return linha + "," + soma + "\n";
    }
}