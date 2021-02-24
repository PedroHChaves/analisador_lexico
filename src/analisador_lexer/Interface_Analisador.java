
package analisador_lexer;

import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Interface_Analisador extends javax.swing.JFrame {

    Connection conexao;
    private TblReserva tblReserva = new TblReserva();
    private int id = 1;
    private AFD afd = new AFD();

    public Interface_Analisador() {
        initComponents();
    }

    public Interface_Analisador(TblReserva tblReserva) {
        initComponents();
        this.tblReserva = tblReserva;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCodigo = new javax.swing.JTextArea();
        btnExecutar = new javax.swing.JButton();
        lblErro = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSaida = new javax.swing.JTable();
        btnFechar = new javax.swing.JButton();

        jButton1.setText("Fechar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código Fonte");

        txtCodigo.setColumns(20);
        txtCodigo.setRows(5);
        jScrollPane1.setViewportView(txtCodigo);

        btnExecutar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExecutar.setText("Executar");
        btnExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarActionPerformed(evt);
            }
        });

        lblErro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblErro, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Executar", jPanel2);

        tblSaida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Lexema", "Token", "Valor Inicial", "Escopo", "Linha"
            }
        ));
        jScrollPane2.setViewportView(tblSaida);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Saída", jPanel3);

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFechar)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void btnExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecutarActionPerformed
        
        DefaultTableModel dtmTabela = (DefaultTableModel) tblSaida.getModel();
        String codigo, erro = "", escopoAux = "";
        dtmTabela.setNumRows(0);
        id = 1;
        int cont = 0, comentario = 0;
        ArrayList<String> escopo = new ArrayList();
         
        codigo = txtCodigo.getText();
                  
        String linhas[] = codigo.split("\n");     
        
        while(escopo.size() < linhas.length){//Pega o escopo de cada linha do código
            for(int i = 0; i < linhas.length; i++){
                String aux[] = linhas[i].split(" ");
                if(aux[0].equals("procedimento")){//Caso encontre um procedimento o escopo da linha muda pro nome do procedimento e só para quando acha o fim
                    escopoAux = aux[1].substring(0, aux[1].indexOf("("));
                    while((!aux[0].equals("fim;")) && (!aux[0].equals("fim"))){
                        escopo.add(escopoAux);
                        i++;
                        aux = linhas[i].split(" ");
                    }
                }else if(aux[0].equals("funcao")){//Caso encontre uma funcao o escopo da linha muda pro nome da funcao e só para quando acha o fim
                    escopoAux = aux[1].substring(0, aux[1].indexOf("("));
                    while((!aux[0].equals("fim;")) && (!aux[0].equals("fim"))){
                        escopo.add(escopoAux);
                        i++;
                        aux = linhas[i].split(" ");
                    }
                }else{
                    escopo.add("Global");
                }
            }            
        }               
        
        for(int i = 0; i < linhas.length; i++){ //Percorre as linhas
            ArrayList<String> palavras = new ArrayList();
            linhas[i] = linhas[i].trim();
            String aux[] = linhas[i].split(" ");
            
            if((!aux[0].equals(""))&&(!aux[0].equals("\t"))){//Ignora tabulação
                for(int j = 0; j < aux.length; j++){//Percorre as palavras
                                        
                    if((!tblReserva.verificaExistencia(aux[j])) && (comentario == 0)){//Adiciona as palavras solitarias
                        palavras.add(aux[j]);
                    }

                    int posAux = -1, inicioAspas = 0;
                    String strAux = "";
                    if(aux[j].contains("'")){//Adiciona aspas
                        inicioAspas = j;
                        posAux = aux[j].indexOf("'");
                        cont++;
                        palavras.add("'");
                        strAux = aux[j].substring(posAux +1, aux[j].length());
                    }
                    
                    if(cont > 0){//Executada até encontrar o fecha aspas
                        while(cont < 2){
                            j++;
                            if(aux[j].contains("'")){
                                strAux = strAux + " " + aux[j].substring(0, (aux[j].indexOf("'")));
                                aux[inicioAspas] = aux[inicioAspas].substring(0, posAux).concat(aux[j].substring(aux[j].indexOf("'")+1, aux[j].length()));
                                aux[j] = "";
                                palavras.add(strAux);
                                palavras.add("'");
                                j = inicioAspas;
                                cont++;
                            }else{
                                strAux = strAux + " " + aux[j];
                                aux[j] = "";
                            }
                             
                        }
                    }
                    cont = 0;                                                            
                    
                    posAux = -1;
                    inicioAspas = 0;
                    strAux = "";
                    if(aux[j].contains("\"")){//Verifica aspas dupla                         
                        inicioAspas = j;
                        posAux = aux[j].indexOf("\"");
                        cont++;
                        palavras.add("\"");
                        strAux = aux[j].substring(posAux +1, aux[j].length());
                    }
                    
                    if(cont > 0){//Executada até encontrar o fecha aspas dupla
                        while(cont < 2){
                            j++;
                            if(aux[j].contains("\"")){
                                strAux = strAux + " " + aux[j].substring(0, (aux[j].indexOf("\"")));
                                aux[inicioAspas] = aux[inicioAspas].substring(0, posAux).concat(aux[j].substring(aux[j].indexOf("\"")+1, aux[j].length()));
                                aux[j] = "";
                                palavras.add(strAux);
                                palavras.add("\"");
                                j = inicioAspas;
                                cont++;
                            }else{
                                strAux = strAux + " " + aux[j];
                                aux[j] = "";
                            }
                             
                        }
                    }
                    cont = 0;
                    
                    if(aux[j].contains("{")){//Verifica comentario                                             
                        aux[j] = aux[j].substring(aux[j].indexOf("{"), aux[j].indexOf("{")+1);
                        if(j < aux.length -1){
                           j++; 
                        }                        
                        
                        comentario = 1;
                    }
                    
                    if(comentario == 1){
                        if(aux[j].contains("}")){
                            aux[j] = aux[j].substring(aux[j].indexOf("}"), aux[j].indexOf("}")+1);
                            if(j < aux.length -1){
                               j++; 
                            }
                            
                            comentario = 0;
                        }
                    }else{//Caso nao for comentario verifica palavras reservadas
                        while(aux[j].contains(";")){
                            int pos = aux[j].indexOf(";");
                            if(pos == aux[j].length() -1){//Tira o ponto e vírgula do final
                                aux[j] = aux[j].substring(0, pos);
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                                palavras.add(";");
                            }else if(pos == 0){//Tira do começo
                                aux[j] = aux[j].substring(1, aux[j].length());
                                palavras.add(";");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{//Tira do meio da string
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +1, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add(";");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }
                        }
                        
                        while(aux[j].contains(")")){
                            int pos = aux[j].indexOf(")");
                            if(pos == aux[j].length() -1){
                                aux[j] = aux[j].substring(0, pos);
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                                palavras.add(")");
                            }else if(pos == 0){
                                aux[j] = aux[j].substring(1, aux[j].length());
                                palavras.add(")");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +1, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add(")");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }
                        }
                        
                        while(aux[j].contains("]")){
                            int pos = aux[j].indexOf("]");
                            if(pos == aux[j].length() -1){
                                aux[j] = aux[j].substring(0, pos);
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                                palavras.add("]");
                            }else if(pos == 0){
                                aux[j] = aux[j].substring(1, aux[j].length());
                                palavras.add("]");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +1, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add("]");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }
                        }
                        
                        while(aux[j].contains(":")){
                            int pos = aux[j].indexOf(":");
                            if(pos == aux[j].length() -1){
                                aux[j] = aux[j].substring(0, pos);
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                                palavras.add(":");
                            }else if(pos == 0){
                                aux[j] = aux[j].substring(1, aux[j].length());
                                palavras.add(":");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{                                
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +1, aux[j].length());
                                System.out.println(aux[j]);
                                if(!tblReserva.verificaExistencia(aux2)){
                                    palavras.add(aux2);
                                }
                                palavras.add(":");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    System.out.println("");
                                    palavras.add(aux[j]);
                                    aux[j] = aux2;
                                }
                            }
                        }

                        while(aux[j].contains("!")){
                            int pos = aux[j].indexOf("!");
                            if(pos == aux[j].length() -1){
                                aux[j] = aux[j].substring(0, pos);
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                                palavras.add("!");
                            }else if(pos == 0){
                                aux[j] = aux[j].substring(1, aux[j].length());
                                palavras.add("!");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +1, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add("!");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }
                        }

                        while(aux[j].contains("+")){
                            int pos = aux[j].indexOf("+");
                            if(pos == aux[j].length() -1){
                                aux[j] = aux[j].substring(0, pos);
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                                palavras.add("+");
                            }else if(pos == 0){
                                aux[j] = aux[j].substring(1, aux[j].length());
                                palavras.add("+");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +1, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add("+");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }
                        }

                        while(aux[j].contains("-")){
                            int pos = aux[j].indexOf("-");
                            if(pos == aux[j].length() -1){
                                aux[j] = aux[j].substring(0, pos);
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                                palavras.add("-");
                            }else if(pos == 0){
                                aux[j] = aux[j].substring(1, aux[j].length());
                                palavras.add("-");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +1, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add("-");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }
                        }

                        while(aux[j].contains("*")){
                            int pos = aux[j].indexOf("*");
                            if(pos == aux[j].length() -1){
                                aux[j] = aux[j].substring(0, pos);
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                                palavras.add("*");
                            }else if(pos == 0){
                                aux[j] = aux[j].substring(1, aux[j].length());
                                palavras.add("*");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +1, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add("*");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }
                        }

                        while(aux[j].contains("/")){
                            int pos = aux[j].indexOf("/");
                            if(pos == aux[j].length() -1){
                                aux[j] = aux[j].substring(0, pos);
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                                palavras.add("/");
                            }else if(pos == 0){
                                aux[j] = aux[j].substring(1, aux[j].length());
                                palavras.add("/");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +1, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add("/");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }
                        }

                        while(aux[j].contains("%")){
                            int pos = aux[j].indexOf("%");
                            if(pos == aux[j].length() -1){
                                aux[j] = aux[j].substring(0, pos);
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                                palavras.add("%");
                            }else if(pos == 0){
                                aux[j] = aux[j].substring(1, aux[j].length());
                                palavras.add("%");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +1, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add("%");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }
                        }

                        while(aux[j].contains("^")){
                            int pos = aux[j].indexOf("^");
                            if(pos == aux[j].length() -1){
                                aux[j] = aux[j].substring(0, pos);
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                                palavras.add("^");
                            }else if(pos == 0){
                                aux[j] = aux[j].substring(1, aux[j].length());
                                palavras.add("^");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +1, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add("^");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }
                        }                       

                        while(aux[j].contains("(")){
                            int pos = aux[j].indexOf("(");
                            if(pos == aux[j].length() -1){
                                aux[j] = aux[j].substring(0, pos);
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                                palavras.add("(");
                            }else if(pos == 0){
                                aux[j] = aux[j].substring(1, aux[j].length());
                                palavras.add("(");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +1, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add("(");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }
                        }                        

                        while(aux[j].contains(",")){
                            int pos = aux[j].indexOf(",");
                            if(pos == aux[j].length() -1){
                                aux[j] = aux[j].substring(0, pos);
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                                palavras.add(",");
                            }else if(pos == 0){
                                aux[j] = aux[j].substring(1, aux[j].length());
                                palavras.add(",");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +1, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add(",");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }
                        }                                        

                        while(aux[j].contains("[")){
                            int pos = aux[j].indexOf("[");
                            if(pos == aux[j].length() -1){
                                aux[j] = aux[j].substring(0, pos);
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                                palavras.add("[");
                            }else if(pos == 0){
                                aux[j] = aux[j].substring(1, aux[j].length());
                                palavras.add("[");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +1, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add("[");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }
                        }                       

                        while(aux[j].contains("<")){
                            int pos = aux[j].indexOf("<");
                            if(pos == aux[j].length() -1){
                                aux[j] = aux[j].substring(0, pos);
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                                palavras.add("<");
                            }else if((pos == 0) && (aux[j].charAt(pos+1) == '=')){
                                aux[j] = aux[j].substring(2, aux[j].length());
                                palavras.add("<=");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else if((pos == 0) && (aux[j].charAt(pos+1) == '>')){
                                aux[j] = aux[j].substring(2, aux[j].length());
                                palavras.add("<>");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else if((pos == 0) && (aux[j].charAt(pos+1) != '>')){
                                aux[j] = aux[j].substring(1, aux[j].length());
                                palavras.add("<");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else if((pos != 0) && (aux[j].charAt(pos+1) == '=')){
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +2, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add("<=");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else if((pos != 0) && (aux[j].charAt(pos+1) == '>')){
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +2, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add("<>");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +1, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add("<");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }
                        }

                        while(aux[j].contains(">")){
                            int pos = aux[j].indexOf(">");
                            if(pos == aux[j].length() -1){
                                aux[j] = aux[j].substring(0, pos);
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                                palavras.add(">");
                            }else if((pos == 0) && (aux[j].charAt(pos+1) == '=')){
                                aux[j] = aux[j].substring(2, aux[j].length());
                                palavras.add(">=");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else if((pos == 0) && (aux[j].charAt(pos+1) != '=')){
                                aux[j] = aux[j].substring(1, aux[j].length());
                                palavras.add(">");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else if((pos != 0) && (aux[j].charAt(pos+1) == '=')){
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +2, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add(">=");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +1, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add(">");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }
                        }

                        while(aux[j].contains("=")){
                            int pos = aux[j].indexOf("=");
                            if(pos == aux[j].length() -1){
                                aux[j] = aux[j].substring(0, pos);
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                                palavras.add("=");
                            }else if((pos == 0) && (aux[j].charAt(pos+1) == '=')){
                                aux[j] = aux[j].substring(2, aux[j].length());
                                palavras.add("==");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else if((pos == 0) && (aux[j].charAt(pos+1) != '=')){
                                aux[j] = aux[j].substring(1, aux[j].length());
                                palavras.add("=");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else if((pos != 0) && (aux[j].charAt(pos+1) == '=')){
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +2, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add("==");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +1, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add("=");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }
                        }

                        while(aux[j].contains("&")){
                            int pos = aux[j].indexOf("&");
                            if(pos == aux[j].length() -1){
                                break;                          
                            }else if((pos == 0) && (aux[j].charAt(pos+1) == '&')){
                                aux[j] = aux[j].substring(2, aux[j].length());
                                palavras.add("&&");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else if((pos != 0) && (aux[j].charAt(pos+1) == '&')){
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +2, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                }
                                palavras.add("&&");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{
                                break;
                            }
                        }

                        while(aux[j].contains("|")){
                            int pos = aux[j].indexOf("|");
                            if(pos == aux[j].length() -1){
                                break;                          
                            }else if((pos == 0) && (aux[j].charAt(pos+1) == '|')){
                                aux[j] = aux[j].substring(2, aux[j].length());
                                palavras.add("||");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else if((pos != 0) && (aux[j].charAt(pos+1) == '|')){
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +2, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                } 
                                palavras.add("||");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{
                                break;
                            }
                        }                                        

                        while(aux[j].contains(".")){
                            int pos = aux[j].indexOf(".");
                            if(pos == aux[j].length() -1){
                                break;                          
                            }else if((pos == 0) && (aux[j].charAt(pos+1) == '.')){
                                aux[j] = aux[j].substring(2, aux[j].length());
                                palavras.add("..");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else if((pos != 0) && (aux[j].charAt(pos+1) == '.')){
                                String aux2 = aux[j].substring(0, pos);
                                aux[j] = aux[j].substring(pos +2, aux[j].length());
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux2);
                                } 
                                palavras.add("..");
                                if(!tblReserva.verificaExistencia(aux[j])){
                                    palavras.add(aux[j]);
                                }
                            }else{
                                break;
                            }
                        }                                                                                                
                    }                                           
                }

                for(int j = 0; j < palavras.size(); j++){
                    double valor;
                    boolean num = true;
                    
                    try {//Verifica se e num ou id
                        valor = (Float.parseFloat(palavras.get(j)));
                        num = true;
                    } catch (NumberFormatException e) {	  
                        num = false;
                    }
                    
                    
                    if(tblReserva.verificaReserva(palavras.get(j))){//adiciona palavra na tabela

                        String[] dados = new String[5000];
                        dados[0] = Integer.toString(id);
                        dados[1] = palavras.get(j);
                        dados[2] = tblReserva.getToken(palavras.get(j));
                        dados[3] = " ";                    
                        dados[4] = "";
                        dados[5] = Integer.toString(i+1);

                        dtmTabela.addRow(dados);                    
                        id++;
                    }else if(num == true){//adiciona num na tabela
                        String[] dados = new String[5000];
                        dados[0] = Integer.toString(id);
                        dados[1] = palavras.get(j);
                        dados[2] = "NUM";
                        dados[3] = palavras.get(j);                    
                        dados[4] = "";
                        dados[5] = Integer.toString(i+1);
                        
                        dtmTabela.addRow(dados);                    
                        id++;
                    }else if(palavras.get(j).contains(" ")){
                        String[] dados = new String[5000];
                        dados[0] = Integer.toString(id);
                        dados[1] = palavras.get(j);
                        dados[2] = "STRING";
                        dados[3] = " ";
                        dados[4] = "";
                        dados[5] = Integer.toString(i+1);

                        dtmTabela.addRow(dados);                    
                        id++;
                    }else{//adiciona id na tabela                       
                        
                        if(!palavras.get(j).equals("")){//Utiliza afd para verificar erro
                            if(!afd.verificaID(palavras.get(j))){
                                erro += Integer.toString(i+1) + "; ";
                            }
                        }
                        
                        if(linhas[i].contains("=")){
                        
                            int posIgual = linhas[i].indexOf("=");
                            linhas[i] = linhas[i].substring(0, posIgual).concat(linhas[i].substring(posIgual+1, linhas[i].length()));
                            
                            String[] dados = new String[5000];
                            dados[0] = Integer.toString(id);
                            dados[1] = palavras.get(j);
                            dados[2] = "ID";
                            dados[3] = linhas[i].substring(posIgual, linhas[i].indexOf(";"));
                            dados[4] = escopo.get(i);
                            dados[5] = Integer.toString(i+1);

                            dtmTabela.addRow(dados);                    
                            id++;
                        }else{
                            if(!palavras.get(j).equals("")){
                                String[] dados = new String[5000];
                                dados[0] = Integer.toString(id);
                                dados[1] = palavras.get(j);
                                dados[2] = "ID";
                                dados[3] = " ";
                                dados[4] = escopo.get(i);
                                dados[5] = Integer.toString(i+1);

                                dtmTabela.addRow(dados);                    
                                id++;
                            }
                        }                       
                    }
                }
            }
        } 
        if(!erro.equals("")){
            lblErro.setText("Erro na(s) linha(s): " + erro);
        }
    }//GEN-LAST:event_btnExecutarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFecharActionPerformed
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface_Analisador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_Analisador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_Analisador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_Analisador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_Analisador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExecutar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lblErro;
    private javax.swing.JTable tblSaida;
    private javax.swing.JTextArea txtCodigo;
    // End of variables declaration//GEN-END:variables
}
