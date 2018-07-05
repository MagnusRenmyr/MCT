package se.salutea.sweeper.model

class Board {
    private int width;
    private int height;
    private Tile[][] tiles;


    public Board(int w , int h) {
        width = w;
        height = h;

        tiles = new Tile[w][h];

        for(int y = 0 ; y < height ; y++ ) {
            for(int x = 0 ; x < width ; x++) {
                tiles[x][y] = new Tile();
            }
        }
/*
        0.upto(h , {y ->
            0.upto(w , {x ->
                tiles[x][y] = new Tile()
            })
        })
  */  }


    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }


    public Tile[][] getTiles() {
        return tiles;
    }
}
