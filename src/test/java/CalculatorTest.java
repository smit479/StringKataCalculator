import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.assertj.core.api.Assertions;
public class CalculatorTest {
    @Test
    public void should_return_for_empty_string(){
        Assertions.assertThat(Calculator.add("")).isEqualTo(0);
    }
  @Test
  public  void should_return_for_one_number(){
       Assertions.assertThat(Calculator.add("4")).isEqualTo(4);
   }
    @Test
  public void should_return_sum_of_to_number(){
       Assertions.assertThat(Calculator.add("1,3")).isEqualTo(4);
 }
    @Test
    public void should_return_sum_of_unknown_amount_of_numbers(){
        Assertions.assertThat(Calculator.add("1,2,3")).isEqualTo(6);
    }
    @Test
   public void should_return_sum_of_numbers_split_by_commas_and_new_lines(){
        Assertions.assertThat(Calculator.add("1,2\n3")).isEqualTo(6);
    }
    @Test
    public void should_return_sum_of_numbers_split_by_custom_delimiter(){
        Assertions.assertThat(Calculator.add("//;\n1;2;3")).isEqualTo(6);
    }
    @Test
    public void should_throw_expection_for_comma_next_to_new_line(){
        Assertions.assertThatThrownBy(()->Calculator.add("1,\n2"))
        .isInstanceOf(NumberFormatException.class);
    }
    @Test
    public void should_throw_expection_for_negatives(){
        Assertions.assertThatThrownBy(()->Calculator.add("1,-2,3,-4"))
                .hasMessageContaining("negative number are not allowed")
                .hasMessageContaining("-2 -4 ");
    }
//
//

}
