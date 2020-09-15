package ic.doc.co575;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {

  @Test
  public void evaluate_TwoNumbers() {
    Product a = new Product(new NaturalNumber(3), new NaturalNumber(4));
    int expectedOutput = 12;
    int output = a.evaluate();
    final String errorMsg = String.format("Problem multiplying two natural numbers: %s.", a);
    assertThat(errorMsg, output, equalTo(expectedOutput));
  }

  @Test
  public void evaluate_NestedProducts() {
    Product a = new Product(new NaturalNumber(3), new NaturalNumber(4));
    Product b = new Product(new NaturalNumber(1), new NaturalNumber(5));
    Product c = new Product(a, b);

    int expectedOutput = 60;
    int output = c.evaluate();
    final String errorMsg =
            String.format("Problem multiplying nested products of natural numbers: %s.", c);
    assertThat(errorMsg, output, equalTo(expectedOutput));
  }

  @Test
  public void equalsTo() {
    Product a = new Product(new NaturalNumber(3), new NaturalNumber(4));
    Product b = new Product(new NaturalNumber(2), new NaturalNumber(6));
    boolean equal = a.equals(b);
    Assert.assertThat(equal, is(true));
  }

  @Test
  public void compareTo() {
    Product a = new Product(new NaturalNumber(3), new NaturalNumber(4));
    Product b = new Product(new NaturalNumber(1), new NaturalNumber(5));
    int compare = a.compareTo(b);
    Assert.assertThat(compare, is(1));
  }
}
