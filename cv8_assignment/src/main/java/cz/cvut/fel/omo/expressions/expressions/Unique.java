package cz.cvut.fel.omo.cv8.expressions;

public class Unique {

    private final ListExpression sub;

    public Unique(ListExpression sub) {
        this.sub = sub;
    }

    public ListExpression getSub() {
        return sub;
    }
}