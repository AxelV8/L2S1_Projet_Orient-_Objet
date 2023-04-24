package Modele;

/**
 * La classe GpsPoint : un point est un pixel, on peut aussi en generer sans une interface graphique
 * attribut : deux réels x et y representant les coordonnées d'une instance de GpsPoint.
 *
 */

public class GpsPoint
{
  private int x;
  private int y;
  
  /**
   * premier constructeur : attributs  x et y sont initalisés à 0.
   */
  public GpsPoint() 
  {
	  this (0,0);
  }
  /**
   * deuxieme constructeur : attributs  x et y sont initalisés avec les valeurs données en parametre.
   * @param a un entier
   * @param b un entier
   */
  public GpsPoint(int a, int b)
  {
    this.x = a;
    this.y = b;
  }
  //getter 
  public int getX()
  {
    return this.x;
  }
  public int getY()
  {
    return this.y;
  }
  
  /**
   * fonctionnement : calcule la distance entre le point courant et le point donné en paramètre.
   * On calcule la norme euclidienne pour mesurer la distance entre ces deux points.
   * @param other de type GpsPoint.
   * @return la distance entre les deux points.
   */
  public double distanceDeuxPoints(GpsPoint other)
  { 
   double distance = Math.sqrt(Math.pow(other.x - this.x,2)+ Math.pow(other.y-this.y,2));

    return distance;
  }

}


