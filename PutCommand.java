package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class PutCommand extends Command {
    public PutCommand ( IntegerLiteral vAST, Expression eAST, SourcePosition thePosition) {
        super (thePosition);
        V = vAST;
        E = eAST;
    }

    public Object visit(Visitor v, Object o) { return v.visitPutCommand(this, o);
    }
    public IntegerLiteral V;
    public Expression E;
}
