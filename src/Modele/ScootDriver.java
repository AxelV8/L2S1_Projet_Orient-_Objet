package Modele;

/**
 * Classe SccotDriver : représente un conducteur de scooter, qui est aussi un employée.
 * La classe ScootDriver herite de la classe Employee
 * attributs : attribut de classe , averageSpeed, necessaire car on doit redefnir la methode
 * getAverageSpeed() definie en abstract dans Employee. L'averageSpeed du conducteur de scooter
 * est à 0 , la vitesse du couple ( scooter, conducteurScooter) est entierement determinée 
 * par la vitesse du scooter.
 * 
 *
 */
public class ScootDriver extends Employee
{
  protected static double averageSpeed = 0; // car on a defini dans classe Employee

  
/**
 * Constructeur de la classe ScootDriver : utilise uniquement le constructeur de la classe mere, "super()".
 * @param name , nom du conducteur
 * @param weight, poids du conducteur
 * @param wage , salaire du conducteur
 */
  public ScootDriver(String name, double weight, double wage)
  {
    super(name, weight, wage);

  }

  /**
   * redefintion de la methode clone de la classe Object
   */
  public ScootDriver clone()
  {
    return new ScootDriver(this.name, this.weight,this.wage);
  }
  public double getAverageSpeed()
  {
	  return averageSpeed;
  }






}