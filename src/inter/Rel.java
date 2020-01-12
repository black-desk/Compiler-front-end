package inter;

import lexer.Token;
import symbols.Array;
import symbols.Type;

public class Rel extends Logical {
    public Rel(Token tok, Expr x1, Expr x2) {
        super(tok, x1, x2);
    }

    public Type check(Type p1, Type p2) {// TODO 没懂
        if (p1 instanceof Array || p2 instanceof Array) return null;
        else if (Type.numeric(p1) && Type.numeric(p2)) return Type.Bool;
        else if (p1 == p2) return Type.Bool;
        else return null;
    }

    public void jumping(int t, int f) { //TODO 没懂
        Expr a = expr1.reduce();
        Expr b = expr2.reduce();
        String test = a.toString() + " " + op.toString() + " " + b.toString();
        emitjumps(test, t, f);
    }
}
