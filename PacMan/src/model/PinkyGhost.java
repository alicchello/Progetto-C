/*
Tende a girare sempre a destra quando si ritrova un ostacolo davanti.
Se è impossibilitato a girare a destra gira a sinistra o fa un 180° in modo
casuale.
*/
package model;

import altro.Tile;

/**
 *
 * @author matteo
 */
public class PinkyGhost extends Fantasma {
    
    private Tile[][] tiles;
    private int tileWidth = 32, tileHeight = 32;
    
    private int XghostUPsx, XghostUPdx, XghostDOWNsx, XghostDOWNdx;     
    private int YghostUPsx, YghostUPdx, YghostDOWNsx, YghostDOWNdx;

    public PinkyGhost(int xPos, int yPos) {
        super(xPos, yPos);
    }

    @Override
    public void movimento(int xPacMan, int yPacMan) {
        XghostUPsx = xPos; YghostUPsx = yPos;
        XghostUPdx = xPos + tileWidth - 1; YghostUPdx = yPos;
        XghostDOWNsx = xPos; YghostDOWNsx = yPos + tileHeight - 1;
        XghostDOWNdx = xPos + tileWidth - 1; YghostDOWNdx = yPos + tileHeight - 1;
        
        if (((!tiles[XghostUPsx/tileWidth][(YghostUPsx - 2)/tileHeight].isBlocked())) &&
           (!tiles[XghostUPdx/tileWidth][(YghostUPdx - 2)/tileHeight].isBlocked())) {
            xPos += 2;
        }
    }
    
}