package train.google.code.jam.data;

import java.util.Objects;

public class PancakeResult {

    private int flipsDone;
    private String rowOfPancakes;

    public PancakeResult(int numberOfFlipsDone, String rowOfPancakes) {
        this.flipsDone=numberOfFlipsDone;
        this.rowOfPancakes=rowOfPancakes;
    }

    public int getFlipsDone() {
        return flipsDone;
    }

    public String getRowOfPancakes() {
        return rowOfPancakes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PancakeResult that = (PancakeResult) o;
        return flipsDone == that.flipsDone &&
                Objects.equals(rowOfPancakes, that.rowOfPancakes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(flipsDone, rowOfPancakes);
    }
}
