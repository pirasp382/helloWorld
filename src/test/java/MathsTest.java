import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.maths;

public class MathsTest {
    
    @Test
    void testen(){
        int a=2;
        int b = 3;
        int expected = 5;
        int output = maths.add(a, b);
        Assertions.assertThat(output).isEqualTo(expected);
    }
}
