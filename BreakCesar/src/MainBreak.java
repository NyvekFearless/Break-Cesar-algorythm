import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kevin Carbajal
 */
public class MainBreak {
    
    
    public static void Break(){
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

                System.out.println(Arrays.toString(alfabeto) + " jeje " + alfabeto.length);
                System.out.println("Por favor introduzca su texto: ");
                Scanner sc= new Scanner (System.in, "ISO-8859-1");
                String texto;
                texto = sc.nextLine();
                //System.out.println(texto + " " + texto.length());
                //frecuencia(texto, frecuencias);
                i = 0;
                while (i<alfabeto.length){
                   //System.out.println("Texto descifrado: -->" + descifradoCesar(texto, i, alfabeto) + " " + i );
                   frecuencia(descifradoCesar(texto, i, alfabeto), frecuencias, i); //SE VA OBTENIENDO EL TEXTO POR FRECUENCIA
                   System.out.println(i+ " Vez");
                   System.out.println();
                   i++;
                }
        }
    
    
    public static void frecuencia(String texto, float[] frec, int vez){

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
                       char[]alfabeto = createArray();
                       System.out.println("La clave hackeada es: " + vez);
                       System.out.println("Texto descifrado: -->" + texto + " " + vez );
                   }
           else {
               System.out.println("No se pudo descifrar");
           }
    }
    
    
    
    public static String descifradoCesar(String texto, int desplazamiento, char[] alfabeto) {
        StringBuilder cifrado = new StringBuilder(); //NOS AYUDARA A CONCATENAR CARACTERES
        //Arrays.toString(array)
        int longitudArray = alfabeto.length; 
        desplazamiento = desplazamiento % longitudArray; //SE HARÄ UN MOD 27 PARA ENCONTRAR EL DESPLAZAMIENTO
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
        texto = texto.replace("á", "a");
        texto = texto.replace("é", "e");
        texto = texto.replace("í", "i");        
        texto = texto.replace("ó", "o");        
        texto = texto.replace("ú", "u");
        texto = texto.replace("Á", "A");
        texto = texto.replace("É", "E");
        texto = texto.replace("Í", "I");        
        texto = texto.replace("Ó", "O");        
        texto = texto.replace("Ú", "U");
        texto = texto.replace("Ñ", "N");        
        texto = texto.replace("ñ", "n");
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
        texto = texto.replace("¿", "");
        texto = texto.replace("?", "");
        texto = texto.replace("!", "");
        texto = texto.replace("¡", "");
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
  // Para el reemplazo usamos un string vacío 
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

