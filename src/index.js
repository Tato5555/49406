
const antlr4 = require('antlr4');
const fs = require('fs');
const AnalizadorLexer = require('..generated/AnalizadorLexer').AnalizadorLexer;
const AnalizadorParser = require('..generated/AnalizadorParser').AnalizadorParser;

const input = fs.readFileSync(process.argv[2], 'utf-8');
const chars = new antlr4.InputStream(input);
const lexer = new AnalizadorLexer(chars);
const tokens = new antlr4.CommonTokenStream(lexer);
const parser = new AnalizadorParser(tokens);

parser.buildParseTrees = true;
const tree = parser.programa();
console.log(tree.toStringTree(parser.ruleNames));
