
package asignacion;


public class Asignacion {

  
    public static void main(String[] args) {
        
        //abreviar operaciones
      
     int n =5;
     //n+=5; // esto es igual a n = n+5 acorta el codigo
     n*=5;
            
        System.out.println(n);
        
        //OPERADORES EN INCREMENTO Y DECREMENTO
        
        int x= 5;
        
        x++; // x +=1; el valor de incremento aumenta en 1 la variable
        
        int y =5;
        y--; // operador de decremento 
        
        System.out.println(x);
        
        System.out.println(y);
        
        
        System.out.println("");
        
        
        int a=4, b;
        
        b= a++; // el valor de b no sera 5 debido a que 
                // el estamos colocando ++ como sufijo
                // pero a si obtendra el valor de 5
                
                System.out.println(b);
                System.out.println(a);
                
                System.out.println("");
               
                
        // PERO SI COLOCAMOS ++ COMO PREFJO ENTONCES SI FUNCIONA
        
        int c= 48, d;
        
        d = ++c;
         System.out.println(d);
         System.out.println(c);
         
         
         
                //COMO SACAR RAIZ CUDRADAS 
                
                double raiz= Math.sqrt(7);
                
                System.out.println(raiz);
                
                // ahorita asignamos un entero a la variable Math
                // función Math.sqrt() retorna la raíz cuadrada de un número, que es
                
                int raiz2 = (int)Math.sqrt(7);
                System.out.println(raiz2);
                
                Math.sqrt(144);
                
                System.out.println(Math.sqrt(116165161));
                
                
                 
                 
                System.out.println(Math.sin(0.5));
                System.out.println(Math.E);
                double exponenete = Math.exp(4);
                System.out.println(exponenete);
                
                double pot= Math.pow(12, 2);
                System.out.println(pot);
                
                //Otra forma de hacerlo 
                
                double base= 4, exponente =2;
                
                double pot3 = Math.pow(base , exponente);
                System.out.println(pot3);
                
                 int i = -9;
                 double g = 0.3498;    
    System.out.println("|" + i + "| es " + Math.abs(i));
    System.out.println("|" + x + "| es " + Math.abs(g));
    
                //METODO ROOM
                
              
                        
                        
                
        
        
    }
    
}
