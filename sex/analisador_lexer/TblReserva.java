package analisador_lexer;

import java.util.ArrayList;

public class TblReserva {
    
    private int i;
    private ArrayList<String> palavras = new ArrayList();
    private ArrayList<String> operadores = new ArrayList();
    private ArrayList<String> delimitadores = new ArrayList();

    public void setPalavras(ArrayList<String> palavras, ArrayList<String> tokensPal) {
        i = 0;
        while(i < palavras.size()){
            this.palavras.add(palavras.get(i));
            this.palavras.add(tokensPal.get(i));
            i++;
        }
    }

    public void setOperadores(ArrayList<String> operadores, ArrayList<String> tokensOpe) {
        i = 0;
        while(i < operadores.size()){
            this.operadores.add(operadores.get(i));
            this.operadores.add(tokensOpe.get(i));
            i++;
        }
    }

    public void setDelimitadores(ArrayList<String> delimitadores, ArrayList<String> tokensDel) {
        i = 0;
        while(i < delimitadores.size()){
            this.delimitadores.add(delimitadores.get(i));
            this.delimitadores.add(tokensDel.get(i));
            i++;
        }
    }
    
    public String getToken(String palavra){
        int index = 0;
        if(palavras.contains(palavra)){
            index = palavras.indexOf(palavra);
            return palavras.get(index+1);
        }else if(operadores.contains(palavra)){
            index = operadores.indexOf(palavra);
            return operadores.get(index+1);
        }else if(delimitadores.contains(palavra)){
            index = delimitadores.indexOf(palavra);
            return delimitadores.get(index+1);
        } 
        return null;
    }
        
    public void mostraTabelas(){
        i = 0;
        while(i < palavras.size()){
            System.out.println(palavras.get(i));
            i++;
        }
        i = 0;
        while(i < operadores.size()){
            System.out.println(operadores.get(i));
            i++;
        }
        i = 0;
        while(i < delimitadores.size()){
            System.out.println(delimitadores.get(i));
            i++;
        }
    }
    
    public boolean verificaReserva(String palavra){
        if(palavras.contains(palavra)){
            return true;
        }else if(operadores.contains(palavra)){
            return true;
        }else if(delimitadores.contains(palavra)){
            return true;
        }
        return false;
    }
    
    public boolean verificaExistencia(String palavra){
        for(int i = 0; i < operadores.size(); i++){
            if(palavra.contains(operadores.get(i))){
                return true;
            }
        }
        for(int i = 0; i < delimitadores.size(); i++){
            if(palavra.contains(delimitadores.get(i))){
                return true;
            }
        }
        return false;
    }
}
