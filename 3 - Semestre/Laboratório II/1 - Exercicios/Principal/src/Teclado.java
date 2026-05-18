import java.io.*;

/** Classe que permite fazer leitura de dados do teclado, com mÃˆtodos estÂ·ticos.
 *  Iso significa que nâ€žo hÂ· necessidade de instanciar um objeto para invocar os mÃˆtodos.
 *  Sintaxe p/ chamada: <nome_da_classe>.<nome_do_mÃˆtodo>(<mensagem de solicitaÃâ€žo>)
 *  Exemplo de chamada: Teclado.leInt("Digite um nË™mero inteiro")
 */ 

public class Teclado
{
     private static String s;
     private static InputStreamReader i = new InputStreamReader (System.in);
     private static BufferedReader d = new BufferedReader(i);

     /**
        LÃ um inteiro, exibindo na tela uma mensagem de solicitaÃâ€žo.
        @return int
     */
     public static int leInt (String msg)
     {   int a = 0;
         System.out.print(msg);
         try
         {
             s = d.readLine();
             a = Integer.parseInt(s);
         }
         catch (IOException e)
         {
             System.out.println ("Erro de I/O: "+e );
         }
         catch (NumberFormatException e)
         {
             System.out.println ("o valor digitado deve ser inteiro: "+e );
         }
         return (a);
     }
     
          /**
        LÃ um long, exibindo na tela uma mensagem de solicitaÃâ€žo.
        @return long
     */
     
          public static long leLong (String msg)
     {   long a = 0;
         System.out.print(msg);
         try
         {
             s = d.readLine();
             a = Long.parseLong(s);
         }
         catch (IOException e)
         {
             System.out.println ("Erro de I/O: "+e );
         }
         catch (NumberFormatException e)
         {
             System.out.println ("o valor digitado deve ser inteiro: "+e );
         }
         return (a);
     }
     
     /**
        LÃ um double, exibindo na tela uma mensagem de solicitaÃâ€žo.
        @return double
     */
     public static double leDouble(String msg)
     {   double a = 0;
         System.out.print(msg);
         try
         {
             s = d.readLine();
             a = Double.parseDouble(s);
         }
         catch (IOException e)
         {
             System.out.println ("Erro de I/O: " + e);
         }
         catch (NumberFormatException e)
         {
             System.out.println ("o valor digitado deve ser numero: "+e );
         }
         return (a);
     }
     
     /**
        LÃ um string, exibindo na tela uma mensagem de solicitaÃâ€žo.
        @return String
     */
     public static String leString(String msg)
     {   s = "";
         System.out.print(msg);
         try
         {
            s = d.readLine();
         }
         catch (IOException e)
         {
            System.out.println ("Erro de I/O: " + e);
         }
         return (s);
     }
    
     /**
        LÃ um caractere exibindo na tela uma mensagem de solicitaÃâ€žo.
        @return Char
     */
     public static Character leChar(String msg)
     {   s = "";
         System.out.print(msg);
         try
         {
            s = d.readLine();
         }
         catch (IOException e)
         {
            System.out.println ("Erro de I/O: " + e);
         }
         return (s.charAt(0));
     }


}//fim da classe
