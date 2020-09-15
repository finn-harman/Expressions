package ic.doc.co575;

public abstract class BinaryExpression implements Expression {

  protected final Expression left;
  protected final Expression right;

  public BinaryExpression(Expression leftArg, Expression rightArg) {
    left = leftArg;
    right = rightArg;
  }

  public Expression getLeft() {
    return left;
  }

  public Expression getRight() {
    return right;
  }

  @Override
  public abstract int evaluate();

  @Override
  public int depth() {
    return left.depth() + right.depth() + 1;
  }

  @Override
  public int compareTo(Expression other) {
    return Integer.compare(evaluate(), other.evaluate());
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Expression) {
      return ((Expression) o).evaluate() == evaluate();
    } else {
      return false;
    }
  }

}
