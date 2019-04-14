package obstacle;

import animals.*;

public class Run implements Let {
    private int length;

    public Run(int length) {
        this.length = length;
    }
    @Override
    public boolean doIt(Animal animal) {
        return animal.run(length);
    }
    public int getLength(){
        return length;
    }
}
