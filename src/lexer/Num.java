package lexer;

public class Num extends Token {
    public final int value;

    public Num(int v) {
        super(Tag.MUN);
        value = v;
    }

    public String toString(){
        return ""+ value;
    }
}
