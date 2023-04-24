package Modele;


/**
 * Classe SportifCyclist : represente un cycliste sportif.
 * herite de la classe Cyclist.
 * nouveau attribut : attribut de classe : vitesse du cycliste sportif sur un vélo.
 */
public class SportifCyclist extends Cyclist
{
  private static double averageSpeed = 15;
  
  /**
   * Constructeur de la classe SportifCyclist : utilise uniquement le super() de Cyclist
   * @param name nom du Cycliste sportif
   * @param weight	poids du Cycliste sportif
   * @param wage, salaire du Cycliste sportif
   */
  public SportifCyclist(String name, double weight, double   wage)
  {
    super(name,weight,wage);
     
  }
  
  /**
   * @return la vitesse moyenne du cycliste sportif, donc 15(km/h).
   */
  public double getAverageSpeed()
  {
    return averageSpeed;
  }
  
  /**
   * @return un clone de l'instance SportifCycliste courante.
   */
   public  SportifCyclist clone() {
	  return new SportifCyclist( this.name,  this.weight, this.wage);
   }
} 