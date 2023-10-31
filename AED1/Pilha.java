/*

Stack (Pilha) é uma estrutura de dados LIFO (Last-In, First- Out)
ou seja, o ultimo a entrar é o primeiro a sair.

guarda os itens numa especie de torre vertical, como uma torre de livros
ou uma pilha de livros.

push() para colocar um item no topo.
pop() para remover um item do topo.

 */

package AED1;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> jogos = new Stack<>();
        jogos.push("Minecraft");
        jogos.push("Skyrim");
        jogos.push("DOOM");
        jogos.push("Borderlands 3");
        jogos.push("Starfield");
        // jogos.pop(); //remove Starfield (o ultimo a entrar)
        String Goty = jogos.pop();
        System.out.println("O GOTY desse ano será " + Goty);
        System.out.println(jogos);
        System.out.println(jogos.search("Skyrim"));
    }
}
