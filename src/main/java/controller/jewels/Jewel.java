package controller.jewels;

import controller.gems.Gem;

import java.util.List;

public abstract class Jewel {

    private List<Gem> gemList;

    public Jewel(List<Gem> gemList) {
        this.gemList = gemList;
    }

    public List<Gem> getGemList() {
        return gemList;
    }

    public void setGemList(List<Gem> gemList) {
        this.gemList = gemList;
    }

    public double getJewelPrice() {
        double price = 0;
        for (Gem list : gemList) {
            price += list.getGemPrice();
        }
        return price;
    }

    public double getJewelCaratValue() {
        double value = 0;
        for (Gem list : gemList) {
            value += list.getCarat();
        }
        return value;
    }

    @Override
    public String toString() {
        return "controller.model.jewels{" +
                "gemsList=" + gemList +
                '}';
    }
}
