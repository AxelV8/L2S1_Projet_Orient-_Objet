package Modele;

/**
 * Classe Expert Cyclist : represente un cycliste expert.
 * herite de la classe Cyclist.
 * nouveau attribut : attribut de classe : vitesse du cycliste expert sur un vélo.
 */
public class ExpertCyclist extends Cyclist
{
  private static double averageSpeed = 20;
  
  /**
   * Constructeur de la classe ExpertCyclist : utilise uniquement le super() de Cyclist
   * @param name nom du Cycliste expert
   * @param weight	poids du Cycliste expert
   * @param wage, salaire du Cycliste expert
   */
  public ExpertCyclist(String name, double weight, double   wage)
  {
      super(name,weight,wage);
      
  }
  
  /**
   * @return la vitesse moyenne du cycliste expert, donc 20(km/h).
   */

  public double getAverageSpeed()
  {
    return averageSpeed;
  }
  
  /**
   * @return un clone de l'instance ExpertCycliste courante.
   */

   public  ExpertCyclist clone() 
  {
	  return new ExpertCyclist( this.name,  this.weight, this.wage);
  }
}