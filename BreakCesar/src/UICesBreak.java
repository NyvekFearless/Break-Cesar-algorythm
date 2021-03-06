
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kevin Carbajal
 */
public class UICesBreak extends javax.swing.JFrame {

    /**
     * Creates new form UICesBreak
     */
    public UICesBreak() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TITULO = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        ROMPER = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoEncriptado = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoLlano = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Break Cesar");
        setBackground(new java.awt.Color(51, 102, 255));
        setLocation(new java.awt.Point(280, 100));
        setPreferredSize(new java.awt.Dimension(940, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        TITULO.setBackground(new java.awt.Color(255, 255, 255));
        TITULO.setFont(new java.awt.Font("Wide Latin", 0, 24)); // NOI18N
        TITULO.setText("BREAK CESAR");
        getContentPane().add(TITULO);
        TITULO.setBounds(290, 0, 390, 50);

        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setEnabled(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(240, 0, 430, 40);

        ROMPER.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ROMPER.setText("ROMPER");
        ROMPER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ROMPERActionPerformed(evt);
            }
        });
        getContentPane().add(ROMPER);
        ROMPER.setBounds(410, 70, 130, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("TEXTO ENCRIPTADO:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 70, 200, 40);

        jTextField2.setBackground(new java.awt.Color(204, 255, 255));
        jTextField2.setEnabled(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(50, 70, 230, 40);

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 255));

        textoEncriptado.setBackground(new java.awt.Color(204, 204, 204));
        textoEncriptado.setFont(new java.awt.Font("Baskerville Old Face", 0, 11)); // NOI18N
        jScrollPane1.setViewportView(textoEncriptado);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 450, 310);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("TEXTO LLANO:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(660, 70, 130, 40);

        jTextField3.setBackground(new java.awt.Color(204, 255, 255));
        jTextField3.setEnabled(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(630, 70, 200, 40);

        jScrollPane2.setBackground(new java.awt.Color(204, 255, 255));

        textoLlano.setBackground(new java.awt.Color(204, 204, 204));
        textoLlano.setFont(new java.awt.Font("Baskerville Old Face", 0, 11)); // NOI18N
        jScrollPane2.setViewportView(textoLlano);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(470, 120, 440, 310);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/line7.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, -40, 620, 590);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/line7.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(600, -10, 340, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ROMPERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ROMPERActionPerformed
        // TODO add your handling code here:
        String texto = textoEncriptado.getText();
        String descript = Break(texto);
        textoLlano.setText(descript);
    }//GEN-LAST:event_ROMPERActionPerformed

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
            java.util.logging.Logger.getLogger(UICesBreak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UICesBreak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UICesBreak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UICesBreak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UICesBreak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ROMPER;
    private javax.swing.JLabel TITULO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextPane textoEncriptado;
    private javax.swing.JTextPane textoLlano;
    // End of variables declaration//GEN-END:variables
    public static String Break(String texto){
                char[]alfabeto = createArray();
                char[] letras={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l','m', 'n', 'o', 'p', 'q', 'r', 's', 't',
                    'u', 'v', 'w', 'x', 'y', 'z'};
                float[] frecuencias ={12.53f, 1.42f, 4.68f, 5.86f, 13.68f, 0.69f, 1.01f, 0.70f, 6.25f, 0.44f, 0.02f, 4.97f, 3.15f,
                    6.71f, 8.68f, 2.51f, 0.88f, 6.71f, 7.98f, 4.63f, 3.93f, 0.90f, 0.01f, 0.22f, 0.90f, 0.52f}; 
                int i = 0;

                while(i<26){
                    System.out.println(letras[i] +": "+ frecuencias[i]+ "%");
                    i++;
                }

                /*System.out.println(Arrays.toString(alfabeto) + " jeje " + alfabeto.length);
                System.out.println("Por favor introduzca su texto: ");
                Scanner sc= new Scanner (System.in, "ISO-8859-1");
                String texto;
                texto = sc.nextLine();*/
                //System.out.println(texto + " " + texto.length());
                //frecuencia(texto, frecuencias);
                i = 0;
                String llano = "";
                while (i<alfabeto.length){
                   //System.out.println("Texto descifrado: -->" + descifradoCesar(texto, i, alfabeto) + " " + i );
                   llano = llano +  frecuencia(descifradoCesar(texto, i, alfabeto), frecuencias, i); //SE VA OBTENIENDO EL TEXTO POR FRECUENCIA
                   System.out.println(i+ " Vez");
                   System.out.println();
                   i++;
                }
                return llano;
        }
    
    
    public static String frecuencia(String texto, float[] frec, int vez){

           /*Scanner sc=new Scanner(System.in);
           System.out.println("Enter Your String :");
           String s1=sc.nextLine();*/
           float count;
           int j=1;
           char var='a';
           char ch[]=texto.toCharArray();
           int band0 = 0;
           int band1 = 0;
           int band2 = 0;
           int band3 = 0;
           String llano = "";
           while(j<=26){
              count=0;
                   for(int i=0; i<texto.length(); i++) {
                       if(ch[i]==var || ch[i]==var-32)
                       {
                           count++;
                       }
                   }
                   float porcentaje = (count*100)/texto.length();
                   if(count>0){
                   System.out.println("Frecuencia de "+var+" es "+count+ " porcentaje: " + porcentaje);
                   }
                   
                   if (var=='a'){
                       System.out.println("ENTROOA");
                       System.out.println(frec[0] +" "+ (frec[0]-2) +" "+ (frec[0]+2));
                       if ( porcentaje>=frec[0]-2 &&  porcentaje<=frec[0]+2){
                           System.out.println("ENTROO");
                           band0 = 1;
                       }
                   }
                   if (var=='e'){
                       System.out.println("ENTROOE");
                       System.out.println(frec[4] +" "+ (frec[4]-3.2) +" "+ (frec[4]+3.2));
                       if ( porcentaje>=frec[4]-3.2 &&  porcentaje<=frec[4]+3.2){
                           System.out.println("ENTROO");
                           band1 = 1;
                       }
                   }
                   if (var=='o'){
                       System.out.println("ENTROO O");
                       System.out.println(frec[14] +" "+ (frec[14]-2) +" "+ (frec[14]+2));
                       if ( porcentaje>=frec[14]-2 &&  porcentaje<=frec[14]+2){
                           System.out.println("ENTROO");
                           band2 = 1;
                       }
                   }
                   if (var=='s'){
                       System.out.println("ENTROOS");
                       System.out.println(frec[18] +" "+ (frec[18]-2) +" "+ (frec[18]+2));
                       if ( porcentaje>=frec[18]-2 &&  porcentaje<=frec[18]+2){
                           System.out.println("ENTROO");
                           band3 = 1;
                       }
                   }
                   var++;
                   j++;
           }
           System.out.println("Suma de banderas: " + (band0+ band1+ band2 + band3));
           if ( (band0+ band1+ band2 + band3) == 4){
                       //System.out.println("La clave hackeada es: " + vez);
                       //System.out.println("Texto descifrado: -->" + texto + " " + vez );
                       System.out.println(texto);
                       return texto;
                   }
           else {
               return "";
               //System.out.println("No se pudo descifrar");
           }
    }
    
    public static String descifradoCesar(String texto, int desplazamiento, char[] alfabeto) {
        StringBuilder cifrado = new StringBuilder(); //NOS AYUDARA A CONCATENAR CARACTERES
        //Arrays.toString(array)
        int longitudArray = alfabeto.length; 
        desplazamiento = desplazamiento % longitudArray; //SE HAR?? UN MOD 27 PARA ENCONTRAR EL DESPLAZAMIENTO
        for (int i=0; i<texto.length(); i ++){
                char aux = texto.charAt(i);
                for (int p=0; p<alfabeto.length; p++){
                    if (aux == alfabeto[p]){
                        if (p-desplazamiento<0){ // SI EL DESPLAZAMIENTO EXCEDE EL LIMITE DEL ARRAY, SE HACE UNA RESTA Y ENTRE
                            cifrado.append(alfabeto[(p-desplazamiento) + longitudArray]);
                        }
                        else {
                            cifrado.append(alfabeto[p-desplazamiento]);
                        }
                    }
                }
        }
        
        return cifrado.toString();
    }
    
    public static String limpiarTexto(String texto){
        
        texto = quitarSaltos(texto);
        //texto = texto.toUpperCase();    // LIMPIAMOS EL TEXTO :D
        texto = texto.replace("??", "a");
        texto = texto.replace("??", "e");
        texto = texto.replace("??", "i");        
        texto = texto.replace("??", "o");        
        texto = texto.replace("??", "u");
        texto = texto.replace("??", "A");
        texto = texto.replace("??", "E");
        texto = texto.replace("??", "I");        
        texto = texto.replace("??", "O");        
        texto = texto.replace("??", "U");
        texto = texto.replace("??", "N");        
        texto = texto.replace("??", "n");
        //texto = texto.replace(" ", "");
        texto = texto.replace(".", "");
        texto = texto.replace(",", "");
        texto = texto.replace(";", "");
        texto = texto.replace(":", "");
        texto = texto.replace("[", "");
        texto = texto.replace("]", "");
        texto = texto.replace("(", "");
        texto = texto.replace(")", "");
        texto = texto.replace("-", "");
        texto = texto.replace("_", "");
        texto = texto.replace("??", "");
        texto = texto.replace("?", "");
        texto = texto.replace("!", "");
        texto = texto.replace("??", "");
        texto = texto.replace("\"", "");
        
        texto = texto.replace("0", "");
        texto = texto.replace("1", "");
        texto = texto.replace("2", "");
        texto = texto.replace("3", "");
        texto = texto.replace("4", "");
        texto = texto.replace("5", "");
        texto = texto.replace("6", "");
        texto = texto.replace("7", "");
        texto = texto.replace("8", "");
        texto = texto.replace("9", "");
        //texto = texto.replaceAll("\n", "");
        return texto;
    }
    
    public static String quitarSaltos(String cadena) {
  // Para el reemplazo usamos un string vac??o 
  return cadena.replaceAll("\n", ""); 
}
    
    public static char[] createArray(){
        char[] s;
        s=new char[53]; //64
        int band =0;
        for ( int i=0; i<26; i++) {
            s[i] = (char) ('a' + i );
            
        }
        band = 0;
        int p=0;
        for ( int i=26; i<52; i++) {
            
            s[i] = (char) ('A' + p );
           p++;
        }
        
        /*p = 48;
        for (int i=52; i<62; i++) {
            
            s[i]=(char)p;
            p++;
        }*/
        s[52] = (char)32;
        
        return s;
        }

}
