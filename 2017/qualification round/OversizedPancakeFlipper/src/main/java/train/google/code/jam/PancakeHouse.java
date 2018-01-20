package train.google.code.jam;

import train.google.code.jam.data.PancakeResult;
import train.google.code.jam.exceptions.PancakeHouseCreationException;

public class PancakeHouse {

    private static final Integer MINIM_FLIPPER_SIZE = 2;
    private static final String WHITE_PANCAKE = "-";

    private static final int ZERO_FLIPS = 0;

    private final PancakeFlipper pancakeFlipper;

    public PancakeHouse(PancakeFlipper pancakeFlipper) throws PancakeHouseCreationException {
        validate_components(pancakeFlipper);
        this.pancakeFlipper = pancakeFlipper;
    }

    private void validate_components(PancakeFlipper pancakeFlipper) throws PancakeHouseCreationException {
        if(pancakeFlipper.size() < MINIM_FLIPPER_SIZE) throw new PancakeHouseCreationException();
    }

    public PancakeResult flip(String currentPancake) {
        PancakeResult result=null;
        if(!currentPancake.contains(WHITE_PANCAKE)) {
            result= new PancakeResult(ZERO_FLIPS, "++");
        }
        return result;
    }
}
