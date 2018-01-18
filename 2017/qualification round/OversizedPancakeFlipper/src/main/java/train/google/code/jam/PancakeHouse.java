package train.google.code.jam;

import train.google.code.jam.exceptions.PancakeHouseCreationException;

public class PancakeHouse {

    private final PancakeFlipper pancakeFlipper;

    public PancakeHouse(PancakeFlipper pancakeFlipper) throws PancakeHouseCreationException {
        if(pancakeFlipper.size() < 2) throw new PancakeHouseCreationException();
        this.pancakeFlipper = pancakeFlipper;
    }
}
