
package exemplo;

import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
   Scanner leitor = new Scanner(System.in);
   int n1, n2,n;
   System.out.println("N1: ");
   n1 = leitor.nextInt();
   System.out.println("N2:  ");
   n2 = leitor.nextInt();
   System.out.println("N3: ");
   int n3 = leitor.nextInt();
   if(n1>n2 && n1>n3){
   System.out.printf("O número %d é MAIOR",n1);
   }else if(n2>n1 && n2>n3){
     
    System.out.printf("O número %d é o MAIOR\n",n2);
   }else if(n3>n1 && n3>n2){
       System.out.printf("O número %d é o MAIOR\n",n3);
    }else{
       System.out.println("Os números são igauis");
       
            
           
           
           
       
   
   }
   
        
        
        
    }
    
}
