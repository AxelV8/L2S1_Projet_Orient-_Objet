package Modele;

import java.util.ArrayList;


/**
 * La classe Delivery, qui est composée d'un vehicle, d'un salarié, 
 * d'un trajet, d'un repas à emporter et d'une charge utile.
 */
public class Delivery
{
  private ArrayList<GpsPoint> l_trajet; 
  private Employee salaryman;
  private Vehicle locomotion;
  private double usedCharge;// charge utile de la course
  private Meal dish;

/**
 * Constructeur de la classe Delivery.
 * @param dish
 * @param salaryman
 * @param locomotion : si locomotion est un velo alors on modifie la vitesse du velo
 * en fonction de la vitesse du cycliste
 */
  public Delivery(Meal dish, Employee salaryman, Vehicle locomotion) 
  {
    this.dish = dish;  
    this.l_trajet = new ArrayList<GpsPoint>();
    this.l_trajet.add(new GpsPoint(0,0));
    this.salaryman = salaryman.clone(); 
    
    this.locomotion = locomotion.clone();
    this.usedCharge = Math.max(this.locomotion.getUsedCharge(),this.salaryman.getUsedCharge());
    
    if(locomotion instanceof Bike)
    { // on suppose que le salaryman est forcement un cycliste
    	this.locomotion.setAverageSpeed(this.salaryman);
    }	    
  }

   
  /**
   * renvoie la distance total parcourue par la livraison aller retour
   * utilise la methode "distanceDeuxpoint" definie dans la classe GpsPoint
   * @return la distance du trajet aller retour d'où le "*2".
   */
  public double distanceDelivery()
  { 
    double distance = 0;
    for(int i = 0; i<= this.l_trajet.size()-2; i++)
    {
      distance += this.l_trajet.get(i).distanceDeuxPoints(this.l_trajet.get(i+1));
    }
    distance *= 2; 
    return distance;
  }
  

 

  
  /**
   * compare deux livraisons : la livraison courante et celle en parametre, et retourne celle qui 
   * n'est pas pire, la notion de pire est definie dans l'énoncé du projet
   * @param D2 
   * @return la livraison "la moins pire"
   *
   */
  
  public Delivery compareDelivery(Delivery D2)
  {
      if(((this.quantityCo2Emission() > D2.quantityCo2Emission()) &&  (this.priceOfCourse() > D2.priceOfCourse())) || ((this.quantityCo2Emission() > D2.quantityCo2Emission()) && (this.priceOfCourse() == D2.priceOfCourse())) || ((this.quantityCo2Emission() == D2.quantityCo2Emission()) && (this.priceOfCourse() > D2.priceOfCourse())))
      {
        return D2;
      }
      else
        return this;
  }
  
 /**
  *  calcule la masse d'émission de CO2 d'un vehicule durant un trajet : 
  *  masse C02  = (taux d'emission de C02 emit par un vehicule au km) * ( nombre de kilometres parcourus).
  * @return un nombre réel.
  */

  public double quantityCo2Emission()
  {
    return this.locomotion.getRateCo2() * this.distanceDelivery() ;

    
  }
  /**
   * calcule le prix d'une livraison : ce cout est defini dans l'énoncé du projet.
   * @return le prix de la livraison.
   */

  public double priceOfCourse()
  {
  return this.salaryman.getWage() + (this.locomotion.getUseCost()  * this.distanceDelivery());
  }

  /**
   * calcule et retourne le temps prit par une livraison : 
   * temps de la livraison = distance de la livrason / vitesse livraison.
   * @return le temps prit par la livraison.
   */
  public double timeOfCourse()
  {
    return  this.distanceDelivery() / this.locomotion.getAverageSpeed() ;
  }

  /**
   * redéfinition de la methode toString héritée de la classe Object.
   * @return une chaine de caractere indiquant les caracteristiques de la livraison courante.
   *
   */
  public String toString()
    {
    	return(this.salaryman.getName() + " can deliver a " + this.dish.getName()+ " with "  + this.locomotion.getName());
    }
  /**
   * methode qui permet d'ajouter un point Gps dans la liste l_trajet
   * @param point de la classe GpsPoint
   */
    
  public void addGpsPoint(GpsPoint point)
    {
    	this.l_trajet.add(point);
    }  

  /**
   * methode permettant de savoir si une livraison est possible ou non, selon 
   * la définition précisée dans le projet.
   * @return un boolean , true si livraison possible, false dans le cas contraire.
   */
  public boolean isDeliveryPossible ()
  {
    if(this.usedCharge >= this.dish.getWeight() && (this.timeOfCourse() <= 1) )
    {
      return true;
    }
    else
      return false;
  }
  
  /**
   * permet d'afficher chaque point de la liste "l_trajet" de la livraison.
   */
  public void DisplayList()
  {
	  for(int i=0; i<l_trajet.size(); i++)
	  {
		  System.out.println(l_trajet.get(i));
	  }
  }
}
