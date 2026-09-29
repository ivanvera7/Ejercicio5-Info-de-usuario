<div align="center">

# 👤 Ejercicio 5 — Info de usuario en Java

**Leer datos por teclado y responder con ellos**

![Java](https://img.shields.io/badge/Java-Ejercicio_5-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Nivel](https://img.shields.io/badge/Nivel-Basico-brightgreen?style=for-the-badge)
![Dificultad](https://img.shields.io/badge/Dificultad-⭐_5/5-yellow?style=for-the-badge)

</div>

---

## 📖 Descripción

Este es el **Ejercicio 5** de mi serie de práctica en Java. El programa pide al
usuario su nombre por consola, **lee la respuesta con `Scanner`** y saluda
devolviendo ese mismo nombre, mostrando el resultado en pantalla.

> 🎯 **Objetivo del ejercicio:** usar la clase `Scanner` para recibir datos
> del teclado con `nextLine()`, guardarlos en una variable y mostrarlos
> concatenados en la salida.

## ✨ Qué hace

```java
Scanner scanner = new Scanner(System.in);

System.out.println("¿Cómo te llamas?");
String nombre = scanner.nextLine();

System.out.println("Hola " + nombre);
```

Imprime:

```
¿Cómo te llamas?
Ivan
Hola Ivan
```

## 🧠 Conceptos practicados

| Concepto | Descripción |
|:--|:--|
| `Scanner` | Leer datos desde el teclado |
| `nextLine()` | Capturar una línea completa de texto |
| Variable `String` | Guardar la respuesta del usuario |
| Concatenación con `+` | Personalizar el saludo con el nombre |
| `scanner.close()` | Liberar el recurso al terminar |

## 🛠️ Requisitos

- **JDK 8** o superior ([Descargar JDK](https://adoptium.net/))
- Un editor: IntelliJ IDEA, VS Code o similar
- Terminal o símbolo del sistema

## ▶️ Cómo ejecutarlo

```bash
# 1. Compilar
javac src/Main.java

# 2. Ejecutar
java -cp src Main
```

O directamente desde **IntelliJ IDEA** → botón ▶ *Run*.

## 📂 Estructura del proyecto

```
Ejercicio5-Info-de-usuario/
├── src/
│   └── Main.java      ← código fuente
├── .gitignore
└── README.md
```

---

<div align="center">

📚 Ejercicio de práctica de Java · Hecho con ☕ por [ivanvera7](https://github.com/ivanvera7)

</div>
