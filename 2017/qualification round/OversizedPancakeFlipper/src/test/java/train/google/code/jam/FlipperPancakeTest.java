package train.google.code.jam;

import org.junit.Before;
import org.junit.Test;
import train.google.code.jam.exceptions.PancakeHouseCreationException;

import static org.junit.Assert.assertEquals;

public class FlipperPancakeTest {

    private static final int ONE_PANCAKE_SIZE =1;

    @Before
    public void setUp(){

    }

    /*@Test
    public void calculate_amount_steps_to_flip_a_happy_side_is_zero() {
        //Arrange
        final Integer expected = 0;
        PancakeFlipper flipper = new PancakeFlipper(1);
        String currentPancake = "+";
        //Act
        Integer amount_steps = flipper.flip_to_perfect_happy(currentPancake);
        //Assert
        assertEquals("The amount of steps is incorrect", expected, amount_steps);
    }*/

    @Test(expected = PancakeHouseCreationException.class)//Expected
    public void creatingAHouseOFPancakes_WithAPancakeFlipperSmallerThanTwo_ShouldThrownExceptions() throws PancakeHouseCreationException {
        //Given
        PancakeFlipper pancakeFlipper = new PancakeFlipper(ONE_PANCAKE_SIZE);

        //When
        new PancakeHouse(pancakeFlipper);
    }
}
