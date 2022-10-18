package cz.cvut.fel.omo.cv8.visitors;

import cz.cvut.fel.omo.cv8.expressions.IntList;

public class PrintListExpressionVisitor implements ListExpressionVisitor {

    @Override
    public void visitIntList(IntList v) {
        System.out.print(v.getList());
    }
}