package ic.doc.co575;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NaturalNumberTest {

  @Test
  public void containsValue() {
    NaturalNumber w = new NaturalNumber(2);
    assertThat(w.evaluate(), is(2));
  }

  @Test
  public void equalsTo() {
    NaturalNumber w = new NaturalNumber(2);
    NaturalNumber m = new NaturalNumber(2);
    boolean equal = w.equals(m);
    assertThat(equal, is(true));
  }

  @Test
  public void compareTo() {
    NaturalNumber w = new NaturalNumber(2);
    NaturalNumber m = new NaturalNumber(3);
    int compare = w.compareTo(m);
    assertThat(compare, is(-1));
  }
}
