package ic.doc.co575;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {

  @Test
  public void evaluate_TwoNumbers() {
    Addition a = new Addition(new NaturalNumber(3), new NaturalNumber(4));
    int expectedOutput = 7;
    int output = a.evaluate();
    final String errorMsg = String.format("Problem adding two whole numbers: %s", a);
    assertThat(errorMsg, output, equalTo(expectedOutput));
  }

  @Test
  public void evaluate_NestedAdditions() {
    Addition a = new Addition(new NaturalNumber(3), new NaturalNumber(4));
    Addition b = new Addition(new NaturalNumber(1), new NaturalNumber(5));
    Addition c = new Addition(a, b);

    int expectedOutput = 13;
    int output = c.evaluate();
    final String errorMsg = String.format("Problem adding nested additions: %s", c);
    assertThat(errorMsg, output, equalTo(expectedOutput));
  }

  @Test
  public void equalsTo() {
    Addition a = new Addition(new NaturalNumber(3), new NaturalNumber(4));
    Addition b = new Addition(new NaturalNumber(2), new NaturalNumber(5));
    boolean equal = a.equals(b);
    Assert.assertThat(equal, is(true));
  }

  @Test
  public void compareTo() {
    Addition a = new Addition(new NaturalNumber(3), new NaturalNumber(4));
    Addition b = new Addition(new NaturalNumber(1), new NaturalNumber(5));
    int compare = a.compareTo(b);
    Assert.assertThat(compare, is(1));
  }

}
