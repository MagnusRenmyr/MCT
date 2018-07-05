package se.salutea.sweeper.model

class Board {
    private int width;
    private int height;


    public Board(int w , int h) {
        width = w;
        height = h;
    }


    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }
}
