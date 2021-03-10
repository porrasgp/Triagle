package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class RunCommand extends Command {

    public RunCommand(IntegerLiteral iAST, Command cAST, SourcePosition thePosition) {
        super (thePosition);
        i = iAST;
        C = cAST;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitRunCommand(this, o);
    }

    public IntegerLiteral i;
    public Command C;
}