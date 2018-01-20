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

    @Test(expected = PancakeHouseCreationException.class)//Expected
    public void creatingAHouseOFPancakes_WithAPancakeFlipperSmallerThanTwo_ShouldThrownExceptions() throws PancakeHouseCreationException {
        //Given
        PancakeFlipper pancakeFlipper = new PancakeFlipper(ONE_PANCAKE_SIZE);

        //When
        new PancakeHouse(pancakeFlipper);
    }

    @Test
    public void calculate_amount_steps_to_flip_a_happy_side_is_zero() throws PancakeHouseCreationException {
        //Arrange
        String currentPancake = "++";
        final PancakeResult expected = new PancakeResult(0, "++");
        PancakeFlipper flipper = new PancakeFlipper(2);
        PancakeHouse house = new PancakeHouse(flipper);
        //Act
        PancakeResult result = house.flip(currentPancake);
        //Assert
        assertEquals("The result is not correct", expected, result);
    }
}
