package controller.jewels;

import controller.gems.Gem;

import java.util.List;

public class Necklace extends Jewel {

    public Necklace(List<Gem> gemList) {
        super(gemList);
    }

    @Override
    public String toString() {
        return "Necklace{} " + super.toString();
    }
}
