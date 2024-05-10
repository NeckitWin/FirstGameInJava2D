package tile;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class TileManager {
    GamePanel gp;
    Tile[] tile;

    public TileManager(GamePanel gp) {
        this.gp = gp;
        tile = new Tile[10];

        getTileImage();
    }

    public void getTileImage () {

        try {
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/blocks/grass.png"));
            tile[1] = new Tile();
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/blocks/dirt.png"));
            tile[2] = new Tile();
            tile[2].image = ImageIO.read(getClass().getResourceAsStream("/blocks/stone.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void draw(Graphics2D g2) {
        int x = 0;
        int y = 0;
        g2.drawImage(tile[0].image, x,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);

        x=0;
        y+=64;
        g2.drawImage(tile[1].image, x,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);

        x=0;
        y+=64;
        g2.drawImage(tile[1].image, x,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);

        x=0;
        y+=64;
        g2.drawImage(tile[1].image, x,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);

        x=0;
        y+=64;
        g2.drawImage(tile[1].image, x,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[1].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);


        x=0;
        y+=64;
        g2.drawImage(tile[0].image, x,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);

        x=0;
        y+=64;
        g2.drawImage(tile[0].image, x,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);

        x=0;
        y+=64;
        g2.drawImage(tile[0].image, x,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);

        x=0;
        y+=64;
        g2.drawImage(tile[0].image, x,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, x+=64,y, gp.tileSize, gp.tileSize, null);
    }
}
