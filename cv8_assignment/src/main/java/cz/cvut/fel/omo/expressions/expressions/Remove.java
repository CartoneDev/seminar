package cz.cvut.fel.omo.cv8.expressions;

public class Remove {

    private final ListExpression sub;
    private int element;

    public Remove(ListExpression sub, int element) {
        this.sub = sub;
        this.element = element;
    }

    public ListExpression getSub() {
        return sub;
    }

    public int getElement() {
        return element;
    }
}
