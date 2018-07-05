package se.salutea.sweeper.model

class Tile {
    private boolean isBomb;
    private boolean isSweeped;


    Tile() {
        isBomb = false;
        isSweeped = false;
    }


    boolean getIsSweeped() {
        return isSweeped
    }


    void setIsSweeped(boolean isSweeped) {
        this.isSweeped = isSweeped
    }


    boolean getIsBomb() {
        return isBomb
    }


    void setIsBomb(boolean isBomb) {
        this.isBomb = isBomb
    }

}
