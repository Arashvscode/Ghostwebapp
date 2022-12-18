package io.github.rosemoe.sora.langs.html;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.io.StringReader;

import io.github.rosemoe.sora.interfaces.CodeAnalyzer;
import io.github.rosemoe.sora.text.TextAnalyzeResult;
import io.github.rosemoe.sora.text.TextAnalyzer;
import io.github.rosemoe.sora.data.Span;
import io.github.rosemoe.sora.widget.EditorColorScheme;

public class HTMLAnalyzer implements CodeAnalyzer {
	@Override
	public void analyze(CharSequence content, TextAnalyzeResult result, TextAnalyzer.AnalyzeThread.Delegate delegate) {
		try {
			CodePointCharStream stream = CharStreams.fromReader(new StringReader(content.toString()));
			HTMLLexer lexer = new HTMLLexer(stream);
			Token token;
			boolean first = true;
			int lastLine = 1;
			int line, column;
			while (delegate.shouldAnalyze()) {
				token = lexer.nextToken();
				if (token == null)
				break;
				if (token.getType() == HTMLLexer.EOF) {
					lastLine = token.getLine() - 1;
					break;
				}
				line = token.getLine() - 1;
				column = token.getCharPositionInLine();
				lastLine = line;
				
				switch (token.getType()) {
					case HTMLLexer.TAG_WHITESPACE:
					if (first)
					result.addNormalIfNull();
					break;
					case HTMLLexer.TAG_OPEN:
					result.addIfNeeded(line, column, EditorColorScheme.HTML_TAG);
					break;
					case HTMLLexer.TAG_SLASH:
					case HTMLLexer.TAG_SLASH_CLOSE:
					case HTMLLexer.TAG_CLOSE:
					result.addIfNeeded(line, column, EditorColorScheme.OPERATOR, Span.FLAG_TYPO);
					break;
					case HTMLLexer.TAG_EQUALS:
					result.addIfNeeded(line, column, EditorColorScheme.OPERATOR, Span.STYLE_ITALICS);
					break;
					case HTMLLexer.MCSS:
					result.addIfNeeded(line, column, EditorColorScheme.OPERATOR, Span.STYLE_ITALICS);
					break;
					case HTMLLexer.TAG_NAME:
					case HTMLLexer.XML:
					result.addIfNeeded(line, column, EditorColorScheme.HTML_TAG);
					break;
					//break;
					//case HTMLLexer.HSI:
					// result.addIfNeeded(line, column, EditorColorScheme.HSII);
					
					// break;
					case HTMLLexer.CDATA:
					case HTMLLexer.HSI:
					result.addIfNeeded(line,column,EditorColorScheme.ATTRIBUTE_VALUE ,Span.STYLE_ITALICS);
					break ;
					case HTMLLexer.ATTRIBUTE:
					result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_NAME, Span.STYLE_ITALICS);
					break;
					case HTMLLexer.ATTVALUE_VALUE:
					result.addIfNeeded(line, column, EditorColorScheme.ATTRIBUTE_VALUE, Span.STYLE_ITALICS);
					break;
					case HTMLLexer.HTML_CONDITIONAL_COMMENT:
					case HTMLLexer.HTML_COMMENT:
					result.addIfNeeded(line, column, EditorColorScheme.COMMENT, Span.STYLE_ITALICS);
					break;
					case
					HTMLLexer.HTML_TEXT:
					// result.addIfNeeded(line,column,EditorColorScheme.TEXT_NORMAL,Span.FLAG_WARNING);
					default:
					result.addIfNeeded(line, column, EditorColorScheme.TEXT_NORMAL);
					break;
				}
				
				first = false;
			}
			result.determine(lastLine);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
