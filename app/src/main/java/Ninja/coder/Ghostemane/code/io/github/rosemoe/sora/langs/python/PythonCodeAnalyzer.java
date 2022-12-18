package io.github.rosemoe.sora.langs.python;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.io.StringReader;

import io.github.rosemoe.sora.data.Span;
import io.github.rosemoe.sora.interfaces.CodeAnalyzer;
import io.github.rosemoe.sora.text.TextAnalyzeResult;
import io.github.rosemoe.sora.text.TextAnalyzer;
import io.github.rosemoe.sora.widget.EditorColorScheme;

public class PythonCodeAnalyzer implements CodeAnalyzer {
    @Override
    public void analyze(CharSequence content, TextAnalyzeResult result, TextAnalyzer.AnalyzeThread.Delegate delegate) {
        try {
            CodePointCharStream stream = CharStreams.fromReader(new StringReader(content.toString()));
            PythonLexer lexer = new PythonLexer(stream);
            Token token, previous = null;
            boolean first = true;

            int lastLine = 1;
            int line, column;

            while (delegate.shouldAnalyze()) {
                token = lexer.nextToken();
                if (token == null) break;
                if (token.getType() == PythonLexer.EOF) {
                    lastLine = token.getLine() - 1;
                    break;
                }
                line = token.getLine() - 1;
                column = token.getCharPositionInLine();
                lastLine = line;

                switch (token.getType()) {
                    case PythonLexer.WS:
                    case PythonLexer.NEWLINE:
                        if (first) {
                            result.addNormalIfNull();
                        }
                        break;
                    case PythonLexer.DEF:
                    
                    case PythonLexer.RETURN:
                     result.addIfNeeded(line, column, EditorColorScheme.OPERATOR, Span.STYLE_ITALICS);
                     break;
                    case PythonLexer.RAISE:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.FROM:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.IMPORT:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.NONLOCAL:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.AS:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.GLOBAL:
                    result.addIfNeeded(line,column,EditorColorScheme.HTML_TAG,Span.STYLE_BOLD);
                    break;
                    case PythonLexer.ASSERT:
                    case PythonLexer.IF:
                    result.addIfNeeded(line, column, EditorColorScheme.BLOCK_LINE);
                    break;
                    case PythonLexer.ELIF:
                    result.addIfNeeded(line, column, EditorColorScheme.KEYWORD);
                            break;
                    case PythonLexer.ELSE:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.WHILE:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.FOR:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.IN:
                    result.addIfNeeded(line, column, EditorColorScheme.BLOCK_LINE);
                    break;
                    case PythonLexer.TRY:
                    result.addIfNeeded(line, column, EditorColorScheme.HTML_TAG);
                            break;
                    case PythonLexer.NONE:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.FINALLY:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.WITH:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.EXCEPT:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.LAMBDA:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.OR:
                    result.addIfNeeded(line, column, EditorColorScheme.NON_PRINTABLE_CHAR);
                    break;
                    case PythonLexer.AND:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.NOT:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.IS:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.CLASS:
                    case PythonLexer.YIELD:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.DEL:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.PASS:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.PRINT:
                    result.addIfNeeded(line, column, EditorColorScheme.print,Span.STYLE_BOLD);
                    
                    break;
                    case PythonLexer.CONTINUE:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.BREAK:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.ASYNC:
                    result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                    case PythonLexer.AWAIT:
                        result.addIfNeeded(line, column, EditorColorScheme.HTML_TAG, Span.STYLE_BOLD);
                        break;
                    case PythonLexer.COMMENT:
                        result.addIfNeeded(line, column, EditorColorScheme.COMMENT, Span.STYLE_ITALICS);
                        break;
                    case PythonLexer.STRING:
                        result.addIfNeeded(line, column, EditorColorScheme.print , Span.STYLE_ITALICS);
                        break;
                    case PythonLexer.DECIMAL_INTEGER:
                        result.addIfNeeded(line, column, EditorColorScheme.LINE_NUMBER);
                        break;
                    case PythonLexer.OPEN_BRACE:
                    case PythonLexer.CLOSE_BRACE:
                    case PythonLexer.OPEN_BRACKET:
                    case PythonLexer.CLOSE_BRACKET:
                    case PythonLexer.OPEN_PAREN:
                    case PythonLexer.CLOSE_PAREN:
                    case PythonLexer.DOT:
                    case PythonLexer.ELLIPSIS:
                    case PythonLexer.STAR:
                    case PythonLexer.COMMA:
                    case PythonLexer.COLON:
                    case PythonLexer.SEMI_COLON:
                    case PythonLexer.POWER:
                    case PythonLexer.ASSIGN:
                    case PythonLexer.OR_OP:
                    case PythonLexer.XOR:
                    case PythonLexer.AND_OP:
                    case PythonLexer.LEFT_SHIFT:
                    case PythonLexer.RIGHT_SHIFT:
                    case PythonLexer.ADD:
                    case PythonLexer.MINUS:
                    case PythonLexer.DIV:
                    case PythonLexer.MOD:
                    case PythonLexer.IDIV:
                    case PythonLexer.NOT_OP:
                    case PythonLexer.LESS_THAN:
                    case PythonLexer.GREATER_THAN:
                    case PythonLexer.EQUALS:
                    case PythonLexer.GT_EQ:
                    case PythonLexer.LT_EQ:
                    case PythonLexer.NOT_EQ_1:
                    case PythonLexer.NOT_EQ_2:
                    case PythonLexer.AT:
                    case PythonLexer.ARROW:
                    case PythonLexer.ADD_ASSIGN:
                    case PythonLexer.SUB_ASSIGN:
                    case PythonLexer.MULT_ASSIGN:
                    case PythonLexer.AT_ASSIGN:
                    case PythonLexer.DIV_ASSIGN:
                    case PythonLexer.MOD_ASSIGN:
                    case PythonLexer.AND_ASSIGN:
                    case PythonLexer.OR_ASSIGN:
                    case PythonLexer.XOR_ASSIGN:
                    case PythonLexer.LEFT_SHIFT_ASSIGN:
                    case PythonLexer.RIGHT_SHIFT_ASSIGN:
                    case PythonLexer.POWER_ASSIGN:
                    case PythonLexer.IDIV_ASSIGN:
                        result.addIfNeeded(line, column, EditorColorScheme.OPERATOR,Span.STYLE_ITALICS);
                        break;
                    case PythonLexer.NAME: {
                        if (previous == null) {
                            result.addIfNeeded(line, column, EditorColorScheme.TEXT_NORMAL);
                            break;
                        } else if (previous.getType() == PythonLexer.DEF) {
                            result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_NAME);
                            break;
                        } else if (previous.getType() == PythonLexer.CLASS) {
                            result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE);
                            break;
                        }
                    }
                    default:
                        result.addIfNeeded(line, column, EditorColorScheme.TEXT_NORMAL);
                        break;
                }
                first = false;
                int currentTokenType = token.getType();
                if (currentTokenType != PythonLexer.WS && currentTokenType != PythonLexer.NEWLINE) {
                    previous = token;
                }
            }

            result.determine(lastLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
