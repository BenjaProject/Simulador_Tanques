# Simulador_Tanques
🎮 Simulación de Batalla de Tanques - WWII
📖 Descripción
Este proyecto es una simulación por turnos de una batalla entre tanques Tiger Alemán y T34 Ruso durante la Segunda Guerra Mundial.
El sistema genera una cantidad aleatoria de tanques, simula un combate realista con mecánicas de disparo y precisión, y muestra un resumen final del estado de los tanques.

🛠️ Tecnologías Utilizadas
Java

NetBeans

ArrayList (sin uso de arreglos [])

Generación de valores aleatorios mediante la clase Generador

🎯 Funcionalidades
✅ Crear Tanques
Genera entre 10 y 20 tanques al azar.

Mitad Tiger, mitad T34.

Se almacenan en ArrayList<Tiger> y ArrayList<T34>.

Se imprimen todos los atributos de cada tanque creado.

✅ Simular Batalla
Turnos: primero disparan los T34, luego los Tiger.

Solo disparan tanques vivos y con munición.

Los Tiger tienen 50% de precisión.

Los T34 tienen 1/3 de precisión.

Se registra el tanque que destruye a otro.

✅ Imprimir Estado Final
Muestra el estado de todos los tanques.

Resumen de vivos y muertos por tipo.

📦 Estructura del Proyecto
text
SimulacionTanques/
├── src/
│   ├── Simulación.java
│   ├── Tanque.java
│   ├── Tiger.java
│   ├── T34.java
│   └── Generador.java
├── build/
├── dist/
└── README.md
▶️ Cómo Ejecutar
Abre el proyecto en NetBeans.

Compila el proyecto (debe compilar sin errores).

Ejecuta la clase Simulación.

Observa la salida en consola con la simulación completa.
