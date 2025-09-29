# 🎮 Simulador de Batalla de Tanques - WWII

## 📖 Descripción
Este proyecto simula por turnos una batalla entre **tanques Tiger Alemán** y **T34 Ruso** durante la Segunda Guerra Mundial.  

El sistema genera una cantidad aleatoria de tanques, simula un combate con mecánicas de **disparo y precisión**, y muestra un **resumen final del estado de los tanques**.

---

## 🛠️ Tecnologías Utilizadas
- **Java**  
- **NetBeans**  
- **ArrayList** (sin uso de arreglos `[]`)  
- Generación de valores aleatorios mediante la clase `Generador`

---

## 🎯 Funcionalidades

### ✅ Crear Tanques
- Genera entre **10 y 20 tanques** aleatorios.  
- Mitad **Tiger**, mitad **T34**.  
- Se almacenan en `ArrayList`.  
- Se imprimen todos los atributos de cada tanque creado.

### ✅ Simular Batalla por Turnos
- Primero disparan los **T34**, luego los **Tiger**.  
- Solo disparan los **tanques vivos y con munición**.  
- **Precisión de disparo:**  
  - Tiger: 50%  
  - T34: 33%  
- Se registra qué tanque destruye a otro.

### ✅ Imprimir Estado Final
- Muestra el estado de todos los tanques.  
- Resumen de **vivos y muertos por tipo**.

---

## 📦 Estructura del Proyecto

SimuladorTanques/
├── src/
│ ├── Simulacion.java
│ ├── Tanque.java
│ ├── Tiger.java
│ ├── T34.java
│ └── Generador.java
├── build/
├── dist/
└── README.md

yaml
Copiar código

---

## ▶️ Cómo Ejecutar

1. Abre el proyecto en **NetBeans**.  
2. Compila el proyecto (debe compilar sin errores).  
3. Ejecuta la clase `Simulacion.java`.  
4. Observa la **salida en consola** con la simulación completa.
