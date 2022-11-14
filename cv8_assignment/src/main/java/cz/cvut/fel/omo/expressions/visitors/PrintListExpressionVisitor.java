package cz.cvut.fel.omo.expressions.visitors;

import cz.cvut.fel.omo.expressions.expressions.IntList;

public class PrintListExpressionVisitor implements ListExpressionVisitor {

    @Override
    public void visitIntList(IntList v) {
        System.out.print(v.getList());
    }
}