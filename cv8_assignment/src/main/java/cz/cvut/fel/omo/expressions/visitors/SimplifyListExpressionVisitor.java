package cz.cvut.fel.omo.cv8.visitors;

import cz.cvut.fel.omo.cv8.expressions.IntList;
import cz.cvut.fel.omo.cv8.expressions.ListExpression;

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
