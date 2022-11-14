package cz.cvut.fel.omo.expressions.expressions;

import com.google.common.collect.ImmutableList;
import cz.cvut.fel.omo.expressions.visitors.ListExpressionVisitor;

public interface ListExpression {

    ImmutableList<Integer> evaluate(Context c);

    void accept(ListExpressionVisitor v);
}
