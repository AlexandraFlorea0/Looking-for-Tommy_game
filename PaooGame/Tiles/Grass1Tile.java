package PaooGame.Tiles;

import PaooGame.Graphics.Assets;

/*! \class public class GrassTile extends Tile
    \brief Abstractizeaza notiunea de dala de tip iarba.
 */
public class Grass1Tile extends Tile
{
    /*! \fn public GrassTile(int id)
        \brief Constructorul de initializare al clasei

        \param id Id-ul dalei util in desenarea hartii.
     */
    public Grass1Tile(int id)
    {
            /// Apel al constructorului clasei de baza
        super(Assets.grass1, id);
        collisionOn = true;
    }
    @Override
    public boolean IsSolid()
    {
        return true;
    }
}
