import java.util.Scanner;

public class "nombre" {
	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in); // esto es la intro para java



Aquí tienes los apuntes reorganizados y simplificados para que sean más claros y concisos:

### Tipos de variables:
int numeroEntero = 2;             // Números enteros
float numeroDecimal = 2.5f;       // Números con decimales (se usa "f")
double numeroDecimalLargo = 2.5;  // Números con decimales largos
String texto = "Hola mundo";      // Cadena de caracteres
char letra = 'a';                 // Carácter único
boolean condicion = true;         // Verdadero o falso
```

---

### Operadores matemáticos:
b = a++;  // Incremento al final
b = ++a;  // Incremento al inicio
b = a--;  // Decremento al final
b = --a;  // Decremento al inicio
b += a;   // Suma y asigna
b -= a;   // Resta y asigna
b *= a;   // Multiplica y asigna
b /= a;   // Divide y asigna
b %= a;   // Residuo de la división
```

---

### Operadores condicionales:
==  // Igual
!=  // Diferente
>   // Mayor
>=  // Mayor o igual
<   // Menor
<=  // Menor o igual
&&  // Y (ambas condiciones verdaderas)
||  // O (una condición verdadera)
!   // Negación (invierte el valor lógico)
```

---

### Estructuras de control:
#### Condicionales:
if (condicion) {
    // Código si la condición es verdadera
} else if (otraCondicion) {
    // Código si la primera condición es falsa y esta es verdadera
} else {
    // Código si ninguna condición es verdadera
}


#### Bucles:
for (int i = 0; i <= 10; i++) {
    // Se repite mientras i <= 10
}

while (i < 10) {
    i++;  // Evitar bucle infinito
}


#### `switch` (evaluación de casos):
int edad;
switch (edad) {
    case 1:
        System.out.println("La edad es 1 año");
        break;
    case 2:
        System.out.println("La edad es 2 años");
        break;
    default:
        // Código para valores no contemplados
        break;
}


---

### Resumen de operadores lógicos:
- **`!`**: Niega el valor lógico (`!true` → `false`).
- **`&&`**: Verdadero si ambas condiciones son verdaderas (`true && true` → `true`).
- **`||`**: Verdadero si al menos una condición es verdadera (`true || false` → `true`).

---

Este formato reduce redundancias y presenta los conceptos de manera más directa y comprensible. 🚀