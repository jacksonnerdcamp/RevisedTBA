package Rooms;

public class Board {
    //fields
    private int width;
    private int height;

    //constructor
    public Board(int width, int height)
    {
        this.width = width;
        this.height = height;
    }
    //getters and setters

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
