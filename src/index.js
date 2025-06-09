import antlr4 from 'antlr4';
import fs from 'fs';
import AnalizadorLexer from '../generated/AnalizadorLexer.js';
import AnalizadorParser from '../generated/AnalizadorParser.js';
import AnalizadorListener from '../generated/AnalizadorListener.js';

const inputFile = process.argv[2];
if (!inputFile) {
    console.error("Uso: node src/index.js <archivo_entrada>");
    process.exit(1);
}

const input = fs.readFileSync(inputFile, 'utf-8');
const chars = new antlr4.InputStream(input);
const lexer = new AnalizadorLexer(chars);
const tokens = new antlr4.CommonTokenStream(lexer);
const parser = new AnalizadorParser(tokens);
parser.buildParseTrees = true;
const tree = parser.programa();

console.log("Árbol sintáctico generado:");
console.log(tree.toStringTree(parser.ruleNames));

const listener = new AnalizadorListener();
antlr4.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);
