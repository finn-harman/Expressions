package ic.doc.co575;

/** This class represents multiplication */

public class Product extends BinaryExpression {

  public Product(Expression leftArg, Expression rightArg) {
    super(leftArg, rightArg);
  }

  @Override
  public String toString() {
    return "(" + String.valueOf(left) + ") x (" + String.valueOf(right) + ")";
  }

  @Override
  public int evaluate() {
    return left.evaluate() * right.evaluate();
  }
}
