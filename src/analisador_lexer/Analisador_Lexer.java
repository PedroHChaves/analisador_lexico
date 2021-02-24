package analisador_lexer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Pedro Henrique Moreira Chaves
 */
public class Analisador_Lexer {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        int i = 0;
        ArrayList<String> palavras = new ArrayList();
        ArrayList<String> tokensPal = new ArrayList();
        ArrayList<String> operadores = new ArrayList();
        ArrayList<String> tokensOpe = new ArrayList();
        ArrayList<String> delimitadores = new ArrayList();
        ArrayList<String> tokensDel = new ArrayList();
        //LeArquivo leArquivo = new LeArquivo();
        TblReserva tblReserva = new TblReserva();
        
        //Le um arquivo contendo as palavras reservadas e seus tokens        
        /*leArquivo.leArq();
        palavras = leArquivo.getPalavras();
        tokensPal = leArquivo.getTokensPal();
        operadores = leArquivo.getOperadores();
        tokensOpe = leArquivo.getTokensOpe();
        delimitadores = leArquivo.getDelimitadores();
        tokensDel = leArquivo.getTokensDel();*/
        palavras.add("programa");
        palavras.add("utilize");
        palavras.add("bibIO");
        palavras.add("const");
        palavras.add("inicio");
        palavras.add("fim");
        palavras.add("inteiro");
        palavras.add("real");
        palavras.add("caractere");
        palavras.add("palavra");
        palavras.add("logico");
        palavras.add("var");
        palavras.add("arranjo");
        palavras.add("leia");
        palavras.add("leialn");
        palavras.add("escreva");
        palavras.add("escrevaln");
        palavras.add("se");
        palavras.add("entao");
        palavras.add("senao");
        palavras.add("para");
        palavras.add("de");
        palavras.add("ate");
        palavras.add("faca");
        palavras.add("enquanto");
        palavras.add("repita");
        palavras.add("procedimento");
        palavras.add("funcao");
        
        tokensPal.add("INICIO_PROG");
        tokensPal.add("UTIL_BIB");
        tokensPal.add("BIB_IO");
        tokensPal.add("CONSTANTE");
        tokensPal.add("INICIO_BLOCO");
        tokensPal.add("FIM_BLOCO");
        tokensPal.add("INTEIRO_T");
        tokensPal.add("REAL_T");
        tokensPal.add("CARACTERE_T");
        tokensPal.add("PALAVRA_T");
        tokensPal.add("LOGICO_T");
        tokensPal.add("VARIAVEL");
        tokensPal.add("ARRAY");
        tokensPal.add("LER");
        tokensPal.add("LER_LN");
        tokensPal.add("ESCREVER");
        tokensPal.add("ESCREVER_LN");
        tokensPal.add("IF");
        tokensPal.add("THEN");
        tokensPal.add("ELSE");
        tokensPal.add("FOR");
        tokensPal.add("DE");
        tokensPal.add("ATE");
        tokensPal.add("FACA");
        tokensPal.add("WHILE");
        tokensPal.add("DO_WHILE");
        tokensPal.add("PROC");
        tokensPal.add("FUNC");
        
        operadores.add("=");
        operadores.add("==");
        operadores.add("<>");
        operadores.add("<");
        operadores.add("<=");
        operadores.add(">");
        operadores.add(">=");
        operadores.add("||");
        operadores.add("&&");
        operadores.add("!");
        operadores.add("+");
        operadores.add("-");
        operadores.add("*");
        operadores.add("/");
        operadores.add("%");
        operadores.add("^");
        operadores.add(":");
        
        tokensOpe.add("ATRIB");
        tokensOpe.add("COMPARE");
        tokensOpe.add("DIFERENTE");
        tokensOpe.add("MENOR");
        tokensOpe.add("MENOR_IGUAL");
        tokensOpe.add("MAIOR");
        tokensOpe.add("MAIOR_IGUAL");
        tokensOpe.add("OU");
        tokensOpe.add("E");
        tokensOpe.add("NOT");
        tokensOpe.add("MAIS");
        tokensOpe.add("MENOS");
        tokensOpe.add("MULT");
        tokensOpe.add("DIV");
        tokensOpe.add("MOD");
        tokensOpe.add("EXP");
        tokensOpe.add("DOIS_P");
        
        delimitadores.add("(");
        delimitadores.add(")");
        delimitadores.add("\"");
        delimitadores.add("'");
        delimitadores.add(".");
        delimitadores.add("..");
        delimitadores.add(",");
        delimitadores.add("{");
        delimitadores.add("}");
        delimitadores.add("[");
        delimitadores.add("]");
        delimitadores.add(";");
        
        tokensDel.add("ABRE_P");
        tokensDel.add("FECHA_P");
        tokensDel.add("ASPAS_DUPLA");
        tokensDel.add("ASPAS");
        tokensDel.add("PONTO");
        tokensDel.add("INTERVALO");
        tokensDel.add("VIRGULA");
        tokensDel.add("ABRE_CHA");
        tokensDel.add("FECHA_CHA");
        tokensDel.add("ABRE_COL");
        tokensDel.add("FECHA_COL");
        tokensDel.add("PV");
        
        //Cria um array para as palavras, operadores e delimitadores com os tokens
        tblReserva.setPalavras(palavras, tokensPal);
        tblReserva.setOperadores(operadores, tokensOpe);
        tblReserva.setDelimitadores(delimitadores, tokensDel);
        //tblReserva.mostraTabelas();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interface_Analisador frame = new Interface_Analisador(tblReserva);
                frame.setVisible(true);
            }
        });
    }
}
