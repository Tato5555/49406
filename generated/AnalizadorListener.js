import antlr4 from 'antlr4';

export default class AnalizadorListener extends antlr4.tree.ParseTreeListener {
    constructor() {
        super();
        this.tablaSimbolos = {}; // Almacena variables y valores
    }

    // 📌 Inicio y fin del programa
    enterPrograma(ctx) {
        console.log("Inicio del programa.");
    }

    exitPrograma(ctx) {
        console.log("Fin del programa.");
        console.log("Tabla de símbolos:", this.tablaSimbolos);
    }

    // 🔹 Manejo de instrucciones generales
    enterInstruccion(ctx) {
        console.log(`Ejecutando instrucción: ${ctx.getText()}`);
    }

    // 🔹 Manejo de bucle 'variar'
    enterVariar(ctx) {
        const variable = ctx.variable().getText();
        const inicio = parseInt(ctx.expresion(0).getText());
        const fin = parseInt(ctx.expresion(1).getText());

        console.log(`Ejecutando bucle 'variar' sobre '${variable}' desde ${inicio} hasta ${fin}`);
        for (let i = inicio; i <= fin; i++) {
            this.tablaSimbolos[variable] = i;
            console.log(`Salida: ${i}`);
        }
    }

    // 🔹 Manejo de asignaciones
    enterAsignacion(ctx) {
        const variable = ctx.variable().getText();
        const valor = ctx.expresion().getText();
        this.tablaSimbolos[variable] = valor;
        console.log(`Asignación: ${variable} <- ${valor}`);
    }

    // 🔹 Manejo de salida (escribir)
    enterSalida(ctx) {
        const valor = ctx.expresion().getText();
        console.log(`Salida: ${this.tablaSimbolos[valor] || valor}`);
    }

    // 🔹 Manejo de variables
    enterVariable(ctx) {
        const variable = ctx.getText();
        console.log(`Variable detectada: ${variable}`);
    }

    exitVariable(ctx) {
        console.log(`Fin de procesamiento de variable: ${ctx.getText()}`);
    }

    // 🔹 Manejo de expresiones
    enterExpresion(ctx) {
        console.log(`Procesando expresión: ${ctx.getText()}`);
    }

    exitExpresion(ctx) {
        console.log(`Fin de procesamiento de expresión: ${ctx.getText()}`);
    }

    // 🔹 Manejo de números
    enterNumero(ctx) {
        console.log(`Número detectado: ${ctx.getText()}`);
    }

    exitNumero(ctx) {
        console.log(`Fin de procesamiento de número: ${ctx.getText()}`);
    }

    // 🔹 Manejo de términos
    enterTermino(ctx) {
        console.log(`Procesando término: ${ctx.getText()}`);
    }

    exitTermino(ctx) {
        console.log(`Fin de procesamiento de término: ${ctx.getText()}`);
    }
}