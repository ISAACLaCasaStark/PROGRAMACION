public class InicialitzaParells {
  public static void main(String[] args) {
    
    int[] numerosPares = new int[100];
    
    // Primero pongo el try aquí porque me lo pidieron
    try {
      
      for(int i = 0; i < numerosPares.length; i++) {
        numerosPares[i] = 2 * i; 
      }
      
      // Ahora hago otro for para que falle como dice el ejercicio
      System.out.println("Voy a probar a ver si falla...");
      for(int i = 0; i < 150; i++) { // Pongo 150 porque el array es de 100
        System.out.println("Posición " + i + " = " + numerosPares[i]);
      }
      
    } catch (Exception e) { // Esto lo busqué en internet para capturar errores
      System.out.println("¡Ups! Ha pasado algo malo:");
      System.out.println(e); 
    }
    
  }
}