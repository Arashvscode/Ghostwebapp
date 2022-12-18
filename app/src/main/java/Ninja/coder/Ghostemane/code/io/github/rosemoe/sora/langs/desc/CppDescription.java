package io.github.rosemoe.sora.langs.desc;

@SuppressWarnings("SpellCheckingInspection")
public class CppDescription extends CDescription {

    @Override
    public String[] getKeywords() {
        return new String[]{
                "asm", "auto", "bool", "break", "case", "catch", "char", "class",
                "const", "const_cast", "continue", "default", "delete", "do",
                "double", "dynamic_cast", "else", "enum", "explicit", "export",
                "extern", "false", "float", "for", "friend", "goto", "if", "inline",
                "int", "long", "mutable", "namespace", "new", "operator",
                "private", "protected", "public", "register", "reinterpret_cast",
                "return", "short", "signed", "sizeof", "static", "static_cast",
                "struct", "switch", "template", "this", "throw", "true", "try",
                "typedef", "typeid", "typename", "unsigned", "union",
                "using", "virtual", "void", "volatile", "wchar_t", "while", "define","include",
                "_Bool", "char16_t","char32_t","endif","end","button","ifdef","include"
        };
    }
}
