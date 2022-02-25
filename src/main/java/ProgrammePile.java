/**
 * TP4
 *
 * @author Mateo Pepin
 */
public class ProgrammePile
{    

    public static void main(String args[]) {
        Pile pile = new Pile() ;
        System.out.println(estVide(pile)) ;
        try {
            empiler(pile, "1") ;
            empiler(pile, "saumon") ;
        } catch (Exception e) {e.printStackTrace() ;}
        System.out.println(sommet(pile)) ;
        try {
            depiler(pile) ;
        } catch (Exception e) {e.printStackTrace() ;}
        System.out.println(sommet(pile)) ;
    }

    /** Empile un élément dans la pile
     * 
     * @param IN/OUT pfPile pile dans laquelle on empile l'élement
     * @param IN pfEl élément à empiler
     */
    public static void empiler(Pile pfPile, String pfEl) throws Exception {
        if (pfPile.indiceSommet == pfPile.elements.length - 1) {
            throw new Exception("La pile est déjà pleine.") ;
        }
        
        pfPile.elements[pfPile.indiceSommet + 1] = pfEl;
        pfPile.indiceSommet += 1 ;
    }
    
    /** Dépile un élément dans la pile
     * 
     * @param IN/OUT pfPile pile dans laquelle on dépile l'élement
     */
    public static void depiler(Pile pfPile) throws Exception{
        if (pfPile.indiceSommet == -1) {
            throw new Exception("La pile est vide.") ;
        }
        
        pfPile.indiceSommet -= 1 ;
    }
    
    /** Renvoie l'élément au sommet d'une pile.
     * 
     * @param IN pfPile pile dont on retourne le sommet
     * @return le sommet de la pile
     */
    public static String sommet(Pile pfPile) {
        return pfPile.elements[pfPile.indiceSommet] ;
    }
    
    /** Indique si la pile est vide ou non
     * 
     * @param IN pfPile pile que l'on analyse
     * @return true si la pile est vide, false sinon
     */
    public static boolean estVide(Pile pfPile) {
        boolean estVide ;
        if (pfPile.indiceSommet == -1) {
            estVide = true ;
        } else {
            estVide = false ;
        }
        return estVide ;
    }
}

