package Modele;

import java.io.IOException;
import java.util.Scanner;


/**
 * Classe BeginnerCyclist : represente un cycliste debutant.
 * herite de la classe Cyclist.
 * nouveau attribut : attribut de classe : vitesse du cycliste debutant sur un vélo.
 */

public class BeginnerCyclist extends Cyclist
{
  protected static double averageSpeed = 10;//km/h

  /**
   * Constructeur de la classe BeginnerCyclist : utilise uniquement le super() de Cyclist
   * @param name nom du Cycliste débutant
   * @param weight	poids du Cycliste débutant
   * @param wage, salaire du Cycliste débutant
   */
  public BeginnerCyclist(String name, double weight, double   wage)
  {
    super(name,weight,wage);
     
  }
 /**
  * @return la vitesse moyenne du cycliste débutant, donc 10(km/h).
  */
  public double getAverageSpeed()
  {
    return averageSpeed;
  }
  /**
   * @return un clone de l'instance BeginnerCycliste courante.
   */
  public  BeginnerCyclist clone() {
	  return new BeginnerCyclist( this.name,  this.weight, this.wage);
  }
  
}
