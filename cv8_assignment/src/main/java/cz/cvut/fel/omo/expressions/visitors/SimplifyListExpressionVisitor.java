package cz.cvut.fel.omo.expressions.visitors;

import cz.cvut.fel.omo.expressions.expressions.IntList;
import cz.cvut.fel.omo.expressions.expressions.ListExpression;

public class SimplifyListExpressionVisitor implements ListExpressionVisitor {

    private ListExpression value;

    public ListExpression getValue() {
        return value;
    }

    @Override
    public void visitIntList(IntList v) {
        value = v;
    }
    
}
