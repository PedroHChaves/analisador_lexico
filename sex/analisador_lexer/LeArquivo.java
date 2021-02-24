package analisador_lexer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeArquivo {
    
    ArrayList<String> palavras = new ArrayList();
    ArrayList<String> tokensPal = new ArrayList();
    ArrayList<String> operadores = new ArrayList();
    ArrayList<String> tokensOpe = new ArrayList();
    ArrayList<String> delimitadores = new ArrayList();
    ArrayList<String> tokensDel = new ArrayList();
    
    public void leArq() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("arquivo.txt")); 

	while(br.ready()){ 
            String linha = br.readLine();
            if(linha.equals("")){
                break;
            }
            palavras.add(linha);
	}
        while(br.ready()){ 
            String linha = br.readLine();
            if(linha.equals("")){
                break;
            }
            operadores.add(linha);
	}     
        while(br.ready()){ 
            String linha = br.readLine();
            if(linha.equals("")){
                break;
            }
            delimitadores.add(linha);
	}
        while(br.ready()){ 
            String linha = br.readLine();
            if(linha.equals("")){
                break;
            }
            tokensPal.add(linha);
	}
        while(br.ready()){ 
            String linha = br.readLine();
            if(linha.equals("")){
                break;
            }
            tokensOpe.add(linha);
	}     
        while(br.ready()){ 
            String linha = br.readLine();
            if(linha.equals("")){
                break;
            }
            tokensDel.add(linha);
	}
        
	br.close();
    }

    public ArrayList<String> getPalavras() {
        return palavras;
    }

    public ArrayList<String> getTokensPal() {
        return tokensPal;
    }

    public ArrayList<String> getOperadores() {
        return operadores;
    }

    public ArrayList<String> getTokensOpe() {
        return tokensOpe;
    }

    public ArrayList<String> getDelimitadores() {
        return delimitadores;
    }

    public ArrayList<String> getTokensDel() {
        return tokensDel;
    }
    
    
}
