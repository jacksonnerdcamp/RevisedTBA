package Game;

import java.util.Scanner;
import People.MainCharacter;
import Rooms.Board;
import Rooms.Room;

public class Runner {
    boolean gameOn = true;

    public static void main(String[] args)
    {
        Board[][] map = new Board[5][5];

        //Fill the board with empty boxes
        for (int x = 0; x < map.length; x++)
        {
            for (int y = 0; y < map[x].length; y++)
            {
                map[x][y] = new Room(x,y);
            }
        }
    }
}
