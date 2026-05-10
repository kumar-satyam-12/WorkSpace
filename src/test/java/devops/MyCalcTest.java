package devops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyCalcTest {

devops c2 = new devops();
  @Test
  public void test() {
		
		assertEquals(15,c2.sum(10, 5));

}
}