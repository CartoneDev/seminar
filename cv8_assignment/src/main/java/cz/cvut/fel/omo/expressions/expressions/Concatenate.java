package cz.cvut.fel.omo.cv8.expressions;

public class Concatenate {

    private final ListExpression left;
    private final ListExpression right;

    public Concatenate(ListExpression left, ListExpression right) {
        this.left = left;
        this.right = right;
    }

    public ListExpression getLeft() {
        return left;
    }

    public ListExpression getRight() {
        return right;
    }
}
