/*
*    sora-editor - the awesome code editor for Android
*    https://github.com/Rosemoe/CodeEditor
*    Copyright (C) 2020-2021  Rosemoe
*
*     This library is free software; you can redistribute it and/or
*     modify it under the terms of the GNU Lesser General Public
*     License as published by the Free Software Foundation; either
*     version 2.1 of the License, or (at your option) any later version.
*
*     This library is distributed in the hope that it will be useful,
*     but WITHOUT ANY WARRANTY; without even the implied warranty of
*     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
*     Lesser General Public License for more details.
*
*     You should have received a copy of the GNU Lesser General Public
*     License along with this library; if not, write to the Free Software
*     Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
*     USA
*
*     Please contact Rosemoe by email 2073412493@qq.com if you need
*     additional information or have any questions
*/
package io.github.rosemoe.sora.langs.html;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.io.StringReader;

import io.github.rosemoe.sora.interfaces.AutoCompleteProvider;
import io.github.rosemoe.sora.interfaces.CodeAnalyzer;
import io.github.rosemoe.sora.interfaces.EditorLanguage;
import io.github.rosemoe.sora.interfaces.NewlineHandler;
import io.github.rosemoe.sora.widget.SymbolPairMatch;

public class HTMLLanguage implements EditorLanguage {
	public static final String[] TAGS = { "a", "abbr", "acronym", "address", "applet", "area", "article", "aside",
		"audio", "b", "base", "basefont", "bdi", "bdo", "bgsound", "big", "blink", "blockquote", "body", "br",
		"button", "canvas", "caption", "center", "circle", "cite", "clipPath", "code", "col", "colgroup", "command",
		"content", "data", "datalist", "dd", "defs", "del", "details", "dfn", "dialog", "dir", "div", "dl", "dt",
		"element", "ellipse", "em", "embed", "fieldset", "figcaption", "figure", "font", "footer", "foreignObject",
		"form", "frame", "frameset", "g", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr",
		"html", "i", "iframe", "image", "img", "input", "ins", "isindex", "kbd", "keygen", "label", "legend", "li",
		"line", "linearGradient", "link", "listing", "main", "map", "mark", "marquee", "mask", "math", "menu",
		"menuitem", "meta", "meter", "multicol", "nav", "nextid", "nobr", "noembed", "noframes", "noscript",
		"object", "ol", "optgroup", "option", "output", "p", "param", "path", "pattern", "picture", "plaintext",
		"polygon", "polyline", "pre", "progress", "q", "radialGradient", "rb", "rbc", "rect", "rp", "rt", "rtc",
		"ruby", "s", "samp", "script", "section", "select", "shadow", "slot", "small", "source", "spacer", "span",
		"stop", "strike", "strong", "style", "nostyle", "sub", "summary", "sup", "svg", "table", "tbody", "td",
		"template", "text", "textarea", "tfoot", "th", "thead", "time", "title", "tr", "track", "tspan", "tt", "u",
		"ul", "var", "video", "wbr", "xmp"
		
	};
	public static final String[] ATTRIBUTES = { "accept", "accept-charset", "accesskey", "action", "align", "alt",
		"async", "autocomplete", "autofocus", "autoplay", "border", "bgcolor", "charset", "checked", "cite",
		"class", "color", "cols", "colspan", "content", "contenteditable", "controls", "coords", "data", "data-*",
		"datetime", "default", "defer", "dir", "dirname", "disabled", "draggable", "dropzone", "enctype", "face",
		"for", "form", "formaction", "headers", "height", "hidden", "high", "href", "hreflang", "http-equiv", "id",
		"ismap", "kind", "label", "lang", "list", "loop", "low", "max", "maxlength", "media", "method", "min",
		"multiple", "muted", "name", "novalidate", "onabort", "onafterprint", "onbeforeprint", "onbeforeunload",
		"onblur", "oncanplay", "oncanplaythrough", "oncanplaythrough", "onchange", "onclick", "oncontextmenu",
		"oncopy", "oncuechange", "oncut", "ondblclick", "ondrag", "ondragend", "ondragenter", "ondragleave",
		"ondragover", "ondragstart", "ondrop", "ondurationchange", "onemptied", "onended", "onerror", "onfocus",
		"onhashchange", "oninput", "oninvalid", "onkeydown", "onkeypress", "onkeyup", "onload", "onloadeddata",
		"onloadedmetadata", "onloadstart", "onmousedown", "onmousemove", "onmouseout", "onmouseover", "onmouseup",
		"onmousewheel", "onoffline", "ononline", "onpagehide", "onpageshow", "onpaste", "onpaste", "onpause",
		"onplay", "onplaying", "onpopstate", "onprogress", "onratechange", "onreset", "onresize", "onscroll",
		"onsearch", "onseeked", "onseeking", "onselect", "onstalled", "onstorage", "onsubmit", "onsuspend",
		"ontimeupdate", "ontoggle", "onunload", "onvolumechange", "onwaiting", "onwheel", "open", "optimum",
		"pattern", "placeholder", "poster", "preload", "readonly", "rel", "required", "reversed", "rows", "rows",
		"rowspan", "sandbox", "scope", "selected", "shape", "size", "sizes", "span", "spellcheck", "src", "srcdoc",
		"srclang", "srcset", "start", "step", "style", "tabindex", "target", "title", "translate", "type", "usemap",
		"value", "width", "wrap"
		
	};
	public static final String[] MCSS = { "align-content", "align-items", "align-self", "all", "animation",
		"animation-delay", "animation-direction", "animation-duration", "animation-fill-mode",
		"animation-iteration-count", "animation-name", "animation-play-state", "animation-timing-function",
		"backface-visibility", "background", "background-attachment", "background-blend-mode", "background-clip",
		"background-color", "background-image", "background-origin", "background-position", "background-repeat",
		"background-size", "border", "border-bottom", "border-bottom-color", "border-bottom-left-radius",
		"border-bottom-right-radius", "border-bottom-style", "border-bottom-width", "border-collapse",
		"border-color", "border-image", "border-image-outset", "border-image-repeat", "border-image-slice",
		"border-image-source", "border-image-width", "border-left", "border-left-color", "border-left-style",
		"border-left-width", "border-radius", "border-right", "border-right-color", "border-right-style",
		"border-right-width", "border-spacing", "border-style", "border-top", "border-top-color",
		"border-top-left-radius", "border-top-right-radius", "border-top-style", "border-top-width", "border-width",
		"bottom", "box-shadow", "box-sizing", "caption-side", "clear", "clip", "color", "column-count",
		"column-fill", "column-gap", "column-rule", "column-rule-color", "column-rule-style", "column-rule-width",
		"column-span", "column-width", "columns", "content", "counter-increment", "counter-reset", "cursor",
		"direction", "display", "empty-cells", "filter", "flex", "flex-basis", "flex-direction", "flex-flow",
		"flex-grow", "flex-shrink", "flex-wrap", "float", "font", "font-family", "font-size", "font-size-adjust",
		"font-stretch", "font-style", "font-variant", "font-weight", "hanging-punctuation", "height",
		"justify-content", "left", "letter-spacing", "line-height", "list-style", "list-style-image",
		"list-style-position", "list-style-type", "margin", "margin-bottom", "margin-left", "margin-right",
		"margin-top", "max-height", "max-width", "max-zoom", "min-height", "min-width", "min-zoom", "nav-down",
		"nav-index", "nav-left", "nav-right", "nav-up", "opacity", "order", "outline", "outline-color",
		"outline-offset", "outline-style", "outline-width", "overflow", "overflow-x", "overflow-y", "padding",
		"padding-bottom", "padding-left", "padding-right", "padding-top", "page-break-after", "page-break-before",
		"page-break-inside", "perspective", "perspective-origin", "position", "quotes", "resize", "right",
		"tab-size", "table-layout", "text-align", "text-align-last", "text-decoration", "text-decoration-color",
		"text-decoration-line", "text-decoration-style", "text-indent", "text-justify", "text-overflow",
		"text-shadow", "text-transform", "top", "transform", "transform-origin", "transform-style", "transition",
		"transition-delay", "transition-duration", "transition-property", "transition-timing-function",
		"unicode-bidi", "user-select", "user-zoom", "vertical-align", "visibility", "white-space", "width",
		"word-break", "word-spacing", "word-wrap", "z-index", "rgb", "rgba", "url", "attr", "counter", "counters",
		"absolute", "after-edge", "after", "all-scroll", "all", "alphabetic", "always", "antialiased", "armenian",
		"auto", "avoid-column", "avoid-page", "avoid", "balance", "baseline", "before-edge", "before", "below",
		"bidi-override", "block-line-height", "block", "bold", "bolder", "border-box", "both", "bottom", "box",
		"break-all", "break-word", "capitalize", "caps-height", "caption", "center", "central", "char", "circle",
		"cjk-ideographic", "clone", "close-quote", "col-resize", "collapse", "column", "consider-shifts", "contain",
		"content-box", "cover", "crosshair", "cubic-bezier", "dashed", "decimal-leading-zero", "decimal", "default",
		"disabled", "disc", "disregard-shifts", "distribute-all-lines", "distribute-letter", "distribute-space",
		"distribute", "dotted", "double", "e-resize", "ease-in", "ease-in-out", "ease-out", "ease", "ellipsis",
		"end", "exclude-ruby", "fill", "fixed", "georgian", "glyphs", "grid-height", "groove", "hand", "hanging",
		"hebrew", "help", "hidden", "hiragana-iroha", "hiragana", "horizontal", "icon", "ideograph-alpha",
		"ideograph-numeric", "ideograph-parenthesis", "ideograph-space", "ideographic", "inactive", "include-ruby",
		"inherit", "initial", "inline-block", "inline-box", "inline-line-height", "inline-table", "inline", "inset",
		"inside", "inter-ideograph", "inter-word", "invert", "italic", "justify", "katakana-iroha", "katakana",
		"keep-all", "last", "left", "lighter", "line-edge", "line-through", "line", "linear", "list-item", "local",
		"loose", "lower-alpha", "lower-greek", "lower-latin", "lower-roman", "lowercase", "lr-tb", "ltr",
		"mathematical", "max-height", "max-size", "medium", "menu", "message-box", "middle", "move", "n-resize",
		"ne-resize", "newspaper", "no-change", "no-close-quote", "no-drop", "no-open-quote", "no-repeat", "none",
		"normal", "not-allowed", "nowrap", "nw-resize", "oblique", "open-quote", "outset", "outside", "overline",
		"padding-box", "page", "pointer", "pre-line", "pre-wrap", "pre", "preserve-3d", "progress", "relative",
		"repeat-x", "repeat-y", "repeat", "replaced", "reset-size", "ridge", "right", "round", "row-resize", "rtl",
		"s-resize", "scroll", "se-resize", "separate", "slice", "small-caps", "small-caption", "solid", "space",
		"square", "start", "static", "status-bar", "step-end", "step-start", "steps", "stretch", "strict", "sub",
		"super", "sw-resize", "table-caption", "table-cell", "table-column-group", "table-column",
		"table-footer-group", "table-header-group", "table-row-group", "table-row", "table", "tb-rl",
		"text-after-edge", "text-before-edge", "text-bottom", "text-size", "text-top", "text", "thick", "thin",
		"transparent", "underline", "upper-alpha", "upper-latin", "upper-roman", "uppercase", "use-script",
		"vertical-ideographic", "vertical-text", "visible", "w-resize", "wait", "whitespace", "z-index", "zero",
		"zoom", "aliceblue", "antiquewhite", "aqua", "aquamarine", "azure", "beige", "bisque", "black",
		"blanchedalmond", "blue", "blueviolet", "brown", "burlywood", "cadetblue", "chartreuse", "chocolate",
		"coral", "cornflowerblue", "cornsilk", "crimson", "cyan", "darkblue", "darkcyan", "darkgoldenrod",
		"darkgray", "darkgreen", "darkgrey", "darkkhaki", "darkmagenta", "darkolivegreen", "darkorange",
		"darkorchid", "darkred", "darksalmon", "darkseagreen", "darkslateblue", "darkslategray", "darkslategrey",
		"darkturquoise", "darkviolet", "deeppink", "deepskyblue", "dimgray", "dimgrey", "dodgerblue", "firebrick",
		"floralwhite", "forestgreen", "fuchsia", "gainsboro", "ghostwhite", "gold", "goldenrod", "gray", "green",
		"greenyellow", "grey", "honeydew", "hotpink", "indianred", "indigo", "ivory", "khaki", "lavender",
		"lavenderblush", "lawngreen", "lemonchiffon", "lightblue", "lightcoral", "lightcyan",
		"lightgoldenrodyellow", "lightgray", "lightgreen", "lightgrey", "lightpink", "lightsalmon", "lightseagreen",
		"lightskyblue", "lightslategray", "lightslategrey", "lightsteelblue", "lightyellow", "lime", "limegreen",
		"linen", "magenta", "maroon", "mediumaquamarine", "mediumblue", "mediumorchid", "mediumpurple",
		"mediumseagreen", "mediumslateblue", "mediumspringgreen", "mediumturquoise", "mediumvioletred",
		"midnightblue", "mintcream", "mistyrose", "moccasin", "navajowhite", "navy", "oldlace", "olive",
		"olivedrab", "orange", "orangered", "orchid", "palegoldenrod", "palegreen", "paleturquoise",
		"palevioletred", "papayawhip", "peachpuff", "peru", "pink", "plum", "powderblue", "purple", "rebeccapurple",
		"red", "rosybrown", "royalblue", "saddlebrown", "salmon", "sandybrown", "seagreen", "seashell", "sienna",
		"silver", "skyblue", "slateblue", "slategray", "slategrey", "snow", "springgreen", "steelblue", "tan",
		"teal", "thistle", "tomato", "turquoise", "violet", "wheat", "white", "whitesmoke", "yellow", "yellowgreen",
		"arial", "century", "comic", "courier", "cursive", "fantasy", "garamond", "georgia", "helvetica", "impact",
		"lucida", "symbol", "system", "tahoma", "times", "trebuchet", "utopia", "verdana", "webdings", "sans-serif",
		"serif", "monospace", "after", "before", "first-letter", "first-line", "moz-selection", "selection",
		"active", "checked", "disabled", "empty", "enabled", "first-child", "first-of-type", "focus", "hover",
		"indeterminate", "invalid", "last-child", "last-of-type", "link", "not", "nth-child", "nth-last-child",
		"nth-last-of-type", "nth-of-type", "only-child", "only-of-type", "required", "root", "target", "valid",
		"visited", "border-radius", "radius","grid-template","grid","grid-area","grid-auto-columns","grid-auto-flow","grid-auto-rows","grid-column","grid-column-end","grid-column-start","grid-gap","grid-row-gap","grid-column-gap","grid-row-start","grid-template-columns"
		
	};
	
	public static final String[] JS = { "abstract", "else", "instanceof", "super", "boolean", "enum", "int", "switch",
		"break", "export", "interface", "synchronized", "byte", "extends", "let", "this", "case", "false", "long",
		"throw", "catch", "final", "native", "throws", "char", "finally", "new", "transient", "class", "float",
		"null", "true", "const", "for", "package", "try", "continue", "function", "private", "typeof", "debugger",
		"goto", "protected", "var", "default", "if", "public", "void", "delete", "implements", "return", "volatile",
		"do", "import", "short", "while", "double", "in", "static", "with", "of", "console.log", "prototype",
		"alert", "support.function", "yield", "async", "document", "arguments", "parseInt", "await", "undefined",
		"parseFloat", "get", "storage.type", "infinity", "escape", "__count__", "__parent__", "__proto__", "window",
		"eval","getElementById","getElementByClass"
	};
	
	public static final String[] PHP = {
		
		"__halt_compiler", "abstract", "array", "and", "as", "break", "callable", "case", "catch", "class", "clone",
		"const", "continue", "declare", "default", "do", "die", "echo", "else", "elseif", "empty", "enddeclare",
		"endfor", "endforeach", "endif", "endswitch", "endwhile", "eval", "extends", "final", "finally", "fn",
		"for", "foreach", "function", "global", "goto", "if", "implements", "include", "include_once", "instanceof",
		"insteadof", "interface", "isset", "list", "namespace", "new", "or", "print", "private", "protected",
		"public", "require", "require_once", "return", "static", "switch", "throw", "trait", "try", "unset", "use",
		"var", "while", "xor", "yield", "yield_from", "__CLASS__", "__DIR__", "__FILE__", "__FUNCTION__",
		"__LINE__", "__METHOD__", "__NAMESPACE__", "__TRAIT__"
	};
	
	@Override
	public CodeAnalyzer getAnalyzer() {
		return new HTMLAnalyzer();
	}
	
	@Override
	public AutoCompleteProvider getAutoCompleteProvider() {
		return new HTMLAutoComplete();
	}
	
	/**
	* Checks if the given character is an auto complete character in HTML
	*/
	@Override
	public boolean isAutoCompleteChar(char ch) {
		// isDigit -> required to complete tags which may contain a number
		// For example -> h1, h2, h3, h4...
		// Better solution?
		return Character.isLetter(ch) || Character.isDigit(ch);
	}
	
	@Override
	public int getIndentAdvance(String content) {
		try {
			HTMLLexer lexer = new HTMLLexer(CharStreams.fromReader(new StringReader(content)));
			Token token;
			int advance = 0;
			while (((token = lexer.nextToken()) != null && token.getType() != token.EOF)) {
				switch (token.getType()) {
					case HTMLLexer.TAG_OPEN:
					advance++;
					break;
					case HTMLLexer.TAG_SLASH:
					case HTMLLexer.TAG_SLASH_CLOSE:
					advance--;
					break;
				}
			}
			advance = Math.max(0, advance);
			return advance * 4;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	@Override
	public boolean useTab() {
		return true;
	}
	
	@Override
	public CharSequence format(CharSequence text) {
		return text;
	}
	
	@Override
	public SymbolPairMatch getSymbolPairs() {
		return new SymbolPairMatch.DefaultSymbolPairs();
	}
	
	@Override
	public NewlineHandler[] getNewlineHandlers() {
		return new NewlineHandler[0];
	}
}
