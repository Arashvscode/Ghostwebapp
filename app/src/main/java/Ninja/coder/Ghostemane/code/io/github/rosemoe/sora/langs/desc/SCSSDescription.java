
package io.github.rosemoe.sora.langs.desc;

import io.github.rosemoe.sora.langs.universal.LanguageDescription;



public class SCSSDescription implements LanguageDescription {
	
	@Override
	public boolean isOperator(char[] characters, int length) {
		if (length == 1) {
			char c = characters[0];
			return (c == '+' || c == '-' || c == '{' || c == '}' || c == '[' || c == ']' ||
			c == '(' || c == ')' || c == '|' || c == ':' || c == '.' || c == ',' ||
			c == ';' || c == '*' || c == '/' || c == '&' || c == '^' || c == '%' ||
			c == '!' || c == '~' || c == '<' || c == '>' || c == '=' || c == '\\' ||
			c == '#');
		}
		return false;
	}
	
	@Override
	public boolean isLineCommentStart(char a, char b) {
		return a == '/' && b == '/';
	}
	
	@Override
	public boolean isLongCommentStart(char a, char b) {
		return a == '/' && b == '*';
	}
	
	@Override
	public boolean isLongCommentEnd(char a, char b) {
		return a == '*' && b == '/';
	}
	
	@Override
	public String[] getKeywords() {
		//noinspection SpellCheckingInspection
		return new String[]{
			
			"align-content","align-items","align-self","all","animation","animation-delay","animation-direction","animation-duration","animation-fill-mode","animation-iteration-count","animation-name","animation-play-state","animation-timing-function","backface-visibility","background","background-attachment","background-blend-mode","background-clip","background-color","background-image","background-origin","background-position","background-repeat","background-size","border","border-bottom","border-bottom-color","border-bottom-left-radius","border-bottom-right-radius","border-bottom-style","border-bottom-width","border-collapse","border-color","border-image","border-image-outset","border-image-repeat","border-image-slice","border-image-source","border-image-width","border-left","border-left-color","border-left-style","border-left-width","border-radius","border-right","border-right-color","border-right-style","border-right-width","border-spacing","border-style","border-top","border-top-color","border-top-left-radius","border-top-right-radius","border-top-style","border-top-width","border-width","bottom","box-shadow","box-sizing","caption-side","clear","clip","color","column-count","column-fill","column-gap","column-rule","column-rule-color","column-rule-style","column-rule-width","column-span","column-width","columns","content","counter-increment","counter-reset","cursor","direction","display","empty-cells","filter","flex","flex-basis","flex-direction","flex-flow","flex-grow","flex-shrink","flex-wrap","float","font","font-family","font-size","font-size-adjust","font-stretch","font-style","font-variant","font-weight","hanging-punctuation","height","justify-content","left","letter-spacing","line-height","list-style","list-style-image","list-style-position","list-style-type","margin","margin-bottom","margin-left","margin-right","margin-top","max-height","max-width","max-zoom","min-height","min-width","min-zoom","nav-down","nav-index","nav-left","nav-right","nav-up","opacity","order","outline","outline-color","outline-offset","outline-style","outline-width","overflow","overflow-x","overflow-y","padding","padding-bottom","padding-left","padding-right","padding-top","page-break-after","page-break-before","page-break-inside","perspective","perspective-origin","position","quotes","resize","right","tab-size","table-layout","text-align","text-align-last","text-decoration","text-decoration-color","text-decoration-line","text-decoration-style","text-indent","text-justify","text-overflow","text-shadow","text-transform","top","transform","transform-origin","transform-style","transition","transition-delay","transition-duration","transition-property","transition-timing-function","unicode-bidi","user-select","user-zoom","vertical-align","visibility","white-space","width","word-break","word-spacing","word-wrap","z-index",
			"rgb","rgba","url","attr","counter","counters","absolute","after-edge","after","all-scroll","all","alphabetic","always","antialiased","armenian","auto","avoid-column","avoid-page","avoid","balance","baseline","before-edge","before","below","bidi-override","block-line-height","block","bold","bolder","border-box","both","bottom","box","break-all","break-word","capitalize","caps-height","caption","center","central","char","circle","cjk-ideographic","clone","close-quote","col-resize","collapse","column","consider-shifts","contain","content-box","cover","crosshair","cubic-bezier","dashed","decimal-leading-zero","decimal","default","disabled","disc","disregard-shifts","distribute-all-lines","distribute-letter","distribute-space","distribute","dotted","double","e-resize","ease-in","ease-in-out","ease-out","ease","ellipsis","end","exclude-ruby","fill","fixed","georgian","glyphs","grid-height","groove","hand","hanging","hebrew","help","hidden","hiragana-iroha","hiragana","horizontal","icon","ideograph-alpha","ideograph-numeric","ideograph-parenthesis","ideograph-space","ideographic","inactive","include-ruby","inherit","initial","inline-block","inline-box","inline-line-height","inline-table","inline","inset","inside","inter-ideograph","inter-word","invert","italic","justify","katakana-iroha","katakana","keep-all","last","left","lighter","line-edge","line-through","line","linear","list-item","local","loose","lower-alpha","lower-greek","lower-latin","lower-roman","lowercase","lr-tb","ltr","mathematical","max-height","max-size","medium","menu","message-box","middle","move","n-resize","ne-resize","newspaper","no-change","no-close-quote","no-drop","no-open-quote","no-repeat","none","normal","not-allowed","nowrap","nw-resize","oblique","open-quote","outset","outside","overline","padding-box","page","pointer","pre-line","pre-wrap","pre","preserve-3d","progress","relative","repeat-x","repeat-y","repeat","replaced","reset-size","ridge","right","round","row-resize","rtl","s-resize","scroll","se-resize","separate","slice","small-caps","small-caption","solid","space","square","start","static","status-bar","step-end","step-start","steps","stretch","strict","sub","super","sw-resize","table-caption","table-cell","table-column-group","table-column","table-footer-group","table-header-group","table-row-group","table-row","table","tb-rl","text-after-edge","text-before-edge","text-bottom","text-size","text-top","text","thick","thin","transparent","underline","upper-alpha","upper-latin","upper-roman","uppercase","use-script","vertical-ideographic","vertical-text","visible","w-resize","wait","whitespace","z-index","zero","zoom",
			"aliceblue","antiquewhite","aqua","aquamarine","azure","beige","bisque","black","blanchedalmond","blue","blueviolet","brown","burlywood","cadetblue","chartreuse","chocolate","coral","cornflowerblue","cornsilk","crimson","cyan","darkblue","darkcyan","darkgoldenrod","darkgray","darkgreen","darkgrey","darkkhaki","darkmagenta","darkolivegreen","darkorange","darkorchid","darkred","darksalmon","darkseagreen","darkslateblue","darkslategray","darkslategrey","darkturquoise","darkviolet","deeppink","deepskyblue","dimgray","dimgrey","dodgerblue","firebrick","floralwhite","forestgreen","fuchsia","gainsboro","ghostwhite","gold","goldenrod","gray","green","greenyellow","grey","honeydew","hotpink","indianred","indigo","ivory","khaki","lavender","lavenderblush","lawngreen","lemonchiffon","lightblue","lightcoral","lightcyan","lightgoldenrodyellow","lightgray","lightgreen","lightgrey","lightpink","lightsalmon","lightseagreen","lightskyblue","lightslategray","lightslategrey","lightsteelblue","lightyellow","lime","limegreen","linen","magenta","maroon","mediumaquamarine","mediumblue","mediumorchid","mediumpurple","mediumseagreen","mediumslateblue","mediumspringgreen","mediumturquoise","mediumvioletred","midnightblue","mintcream","mistyrose","moccasin","navajowhite","navy","oldlace","olive","olivedrab","orange","orangered","orchid","palegoldenrod","palegreen","paleturquoise","palevioletred","papayawhip","peachpuff","peru","pink","plum","powderblue","purple","rebeccapurple","red","rosybrown","royalblue","saddlebrown","salmon","sandybrown","seagreen","seashell","sienna","silver","skyblue","slateblue","slategray","slategrey","snow","springgreen","steelblue","tan","teal","thistle","tomato","turquoise","violet","wheat","white","whitesmoke","yellow","yellowgreen","arial","century","comic","courier","cursive","fantasy","garamond","georgia","helvetica","impact","lucida","symbol","system","tahoma","times","trebuchet","utopia","verdana","webdings","sans-serif","serif","monospace",
			"after","before","first-letter","first-line","moz-selection","selection",
			"active","checked","disabled","empty","enabled","first-child","first-of-type","focus","hover","indeterminate","invalid","last-child","last-of-type","link","not","nth-child","nth-last-child","nth-last-of-type","nth-of-type","only-child","only-of-type","required","root","target","valid","visited","import","include"
			
		};
	}
	
	@Override
	public boolean useTab() {
		return false;
	}
	
	@Override
	public int getOperatorAdvance(String operator) {
		switch (operator) {
			case "{":
			return 4;
			case "}":
			return -4;
		}
		return 0;
	}
	
	@Override
	public boolean isSupportBlockLine() {
		return true;
	}
	
	@Override
	public boolean isBlockStart(String operator) {
		return operator.equals("{");
	}
	
	@Override
	public boolean isBlockEnd(String operator) {
		return operator.equals("}");
	}
}
