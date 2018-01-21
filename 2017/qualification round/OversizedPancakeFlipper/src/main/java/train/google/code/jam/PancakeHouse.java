package train.google.code.jam;

import train.google.code.jam.data.PancakeResult;
import train.google.code.jam.exceptions.PancakeHouseCreationException;

public class PancakeHouse {

    private static final Integer MINIM_FLIPPER_SIZE = 2;
    private static final String WHITE_PANCAKE = "-";

    private final PancakeFlipper pancakeFlipper;

    public PancakeHouse(PancakeFlipper pancakeFlipper) throws PancakeHouseCreationException {
        validate_components(pancakeFlipper);
        this.pancakeFlipper = pancakeFlipper;
    }

    private void validate_components(PancakeFlipper pancakeFlipper) throws PancakeHouseCreationException {
        if(pancakeFlipper.size() < MINIM_FLIPPER_SIZE) throw new PancakeHouseCreationException();
    }

    public PancakeResult fix_pancake(String currentPancake) {
        Integer amount_flips = 0;
        String pancake = currentPancake.toString();
        while(pancake.contains(WHITE_PANCAKE)){
                pancake = pancakeFlipper.flip(pancake);
                amount_flips++;
        }

        PancakeResult result = new PancakeResult(amount_flips, pancake);
        return result;
    }
}
