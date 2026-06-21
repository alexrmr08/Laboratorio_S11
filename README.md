# Laboratorio S11 - Patrones de Diseño de Software 

## 1.  Descripcion del problema

La **cafetería El Negrito** necesita un sistema para gestionar pedidos de bebidas.

El sistema permite:
- Seleccionar 4 tipos de bebidas base.
- Agregar 4 complementos.
- Combinar complementos en cualquier cantidad y orden.
- Trabaja con 3 tamaños: Normal (N), Mediano (M) y Grande (G).

El objetivo es permitir la composición dinámica de bebidas utilizando el **Patrón Decorator**, evitando la creación de múltiples clases por combinación.

## 2. Tabla de precios

### Bebidas 
|     Cafe      |  Normal| Mediano | Grande |
|---------------|--------|---------|--------|
| Tostado Negro | $.0.99 | $.1.09 | $.1.19 |
| Batido        | $.0.89 | $.0.99 | $.1.09 |
| Descafeinado  | $.1.05 | $.1.15 | $.1.25 |
| Expreso       | $.1.99 | $.2.09 | $.2.15 |

### Complementos
| Complemento | Normal | Mediano | Grande |
|-------------|--------|---------|--------|
| Leche       | $.0.10 | $.0.15  | $.0.20 | 
| Moca        | $.0.20 | $.0.25  | $.0.30 | 
| Soya        | $.0.15 | $.0.20  | $.0.25 | 
| Crema       | $.0.10 | $.0.15  | $.0.20 | 

---

## 3. Estructura del proyecto

```text

LABORATORIO_S11-PDS/
│
├── Cafe.java
├── TostadoNegro.java
├── Batido.java
├── Descafeinado.java
├── Expreso.java
├── DecoradorComplemento.java
├── Leche.java
├── Moca.java
├── Soya.java
├── Crema.java
└── Main.java
```

## 4. Como Funciona el Decorator

El patrón Decorator permite agregar responsabilidades a un objeto sin modificar su estructura.

Ejemplo:

```Java

Cafe bebida = new TostadoNegro();

bebida = new Moca(bebida);
bebida = new Crema(bebida);
```

La llamada al método `costo()` se realiza desde el decorador más externo hacia la bebida base:

```text 
Crema 
  └── Moca 
        └── TostadoNegro
```

Costo total:

```text 
Crema.costo() 
     └── Moca.costo() 
            └── TostadoNegro.costo()
```

## 5. Como ejecutar 

### - IntelliJ IDEA: 

1. Abrir IntelliJ IDEA.
2. Seleccionar **Open** y abrir la carpeta del proyecto.
3. Esperar a que el IDE indexe los archivos.
4. Abrir la clase `Main.java`.
5. Ejecutar el programa mediante el botón (▶).

### - Visual Studio Code: 

1. Abrir Visual Studio Code.
2. Instalar la extensión **Extension Pack for Java** (si no está instalada).
3. Abrir la carpeta del proyecto.
4. Abrir la clase `Main.java`.
5. Presionar **Run Java** o ejecutar desde la terminal integrada.

### - Terminal

```bash
javac *.java
java Main
```
