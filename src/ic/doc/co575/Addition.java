package ic.doc.co575;

/** This class represents addition */

public class Addition extends BinaryExpression {

  public Addition(Expression leftArg, Expression rightArg) {
    super(leftArg, rightArg);
  }

  @Override
  public String toString() {
    return "(" + String.valueOf(left) + ") + (" + String.valueOf(right) + ")";
  }

  @Override
  public int evaluate() {
    return left.evaluate() + right.evaluate();
  }
}
