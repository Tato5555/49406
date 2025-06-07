# Analizador Sintáctico - Legajo 49406 ORTIZ LUIS

## Requisitos

- Node.js
- ANTLR4

## Instalación

1. Instalar dependencias:
   ```bash
   npm install antlr4
   ```

2. Generar el parser con ANTLR4:
   ```bash
   antlr4 -Dlanguage=JavaScript -o grammar grammar/Analizador.g4
   ```

## Uso

Para ejecutar el analizador:

```bash
node src/index.js test/input1.txt
```

## Ejemplos

- `input1.txt` y `input2.txt` contienen código válido.
- `input_error1.txt` y `input_error2.txt` contienen errores para pruebas.

## Arboles sintáctico

Se generan al ejecutar el analizador

