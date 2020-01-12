package inter;

public class Continue extends Stmt {
    Stmt stmt;

    public Continue() {
        if (Stmt.Enclosing == Stmt.Null) {
            error("unenclosed continue");
        }
        stmt = Stmt.Enclosing;
    }

    public void gen(int b, int a) {
        emit("goto L" + stmt.begin);
    }
}
