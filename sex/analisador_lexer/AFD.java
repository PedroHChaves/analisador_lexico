package analisador_lexer;

import java.util.ArrayList;

public class AFD {
    
    ArrayList<String> caracEspec = new ArrayList();
    
    public boolean verificaID(String id){        
        int valor, pos = 1, i = 0;
        
        caracEspec.add("ç");
        caracEspec.add("á");
        caracEspec.add("à");
        caracEspec.add("â");
        caracEspec.add("ã");
        caracEspec.add("é");
        caracEspec.add("è");
        caracEspec.add("ê");
        caracEspec.add("í");
        caracEspec.add("ì");
        caracEspec.add("î");
        caracEspec.add("ó");
        caracEspec.add("ò");
        caracEspec.add("ô");
        caracEspec.add("õ");
        caracEspec.add("ú");
        caracEspec.add("ù");
        caracEspec.add("û");
        
        try {//Verifica o primeiro digito é numero
            valor = (Integer.parseInt(id.substring(0, 1)));
            pos = 0;            
        } catch (NumberFormatException e) {
            while(i < id.length()){
                if(caracEspec.contains(id.substring(i, i+1))){
                   pos = 0; 
                   break;
                }else{
                    pos = 1;
                }
                i++;
            }
            
        }
        if(pos == 0){
            return false;
        }else{
            return true;
        }
    }
}
