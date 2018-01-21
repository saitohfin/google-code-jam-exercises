package train.google.code.jam;

public class PancakeFlipper {

    private static final char WHITE_PANCAKE = '-';
    private static final char HAPPY_PANCAKE = '+';

    private final Integer size;

    public PancakeFlipper(Integer size) {
        this.size = size;
    }

    public String flip(String pancake) {
        String new_pancake = pancake.toString();
        Integer continuos_white = 0;
        for(int index = 0; index < pancake.length(); index++){
            if(pancake.charAt(index) == WHITE_PANCAKE){
                continuos_white++;
            }

            if(size.equals(continuos_white)){
                int first_index = index - size + 1;
                int lastIndex = index;
                String fix_pancake = flip_sequence();
                StringBuilder builder = new StringBuilder();
                builder.append(new_pancake.substring(0, first_index))
                        .append(fix_pancake)
                        .append(new_pancake.substring(lastIndex + 1));
                new_pancake = builder.toString();

            }
        }
        return  new_pancake;
    }

    private String flip_sequence() {
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < size; index++){
            builder.append(HAPPY_PANCAKE);
        }
        return builder.toString();
    }

    public Integer size() {
        return size;
    }
}
