package Modele;


/**
 * classe Vehicle : represente un vehicule de Company
 * relation d'agregation avec la classe Delivery et Company.
 * classe abstraite, aucun objet de type dynamique Vehicle
 * 
 * attributs d'une instance de vehicle: nom, prix d'achat, vitesse moyenne,
 * taux d'emission de CO2, charge utile, cout d'utilisation.
 * @author theol
 *
 */

public  abstract class Vehicle
{
  protected String name;
  protected int buyPrice;
  protected double averageSpeed; // km/h
  protected double rateCo2Emission; // gramme/km
  protected double usedCharge;// kg
  protected double useCost; // euros/km

  /**
   * Constructeur de la classe Vehicle.
   * chaque attribut de l'objet instancié recoit les valeurs données en parametre du Constructeur.
   * 
   * @param name, nom du vehicule
   * @param buyPrice, prix d'achat du vehicule
   * @param averageSpeed, vitesse moyenne du vehicle
   * @param rateCo2, taux de CO2
   * @param usedCharge, charge utile
   * @param usecost, cout d'utilisation
   */

  public Vehicle(String name, int buyPrice, double averageSpeed, double rateCo2, double usedCharge, double usecost)
  {
    this.name = name;
    this.buyPrice = buyPrice;
    this.averageSpeed = averageSpeed;
    this.rateCo2Emission = rateCo2;
    this.usedCharge = usedCharge;
    this.useCost = usecost;



  }
  
  public String getName()
  {
    return this.name;
  }
  public int getBuyprice()
  {
    return this.buyPrice;
  }
  public double getAverageSpeed()
  {
    return this.averageSpeed;
  }
  public double getRateCo2()
  {
    return this.rateCo2Emission;
  }
  public double getUsedCharge()
  {
    return this.usedCharge;
  }
  public double getUseCost()
  {
    return this.useCost;
  }
  
  /**
   * Setter : modifie la vitesse moyenne du vehicle prend en parametre un employee.*
   * methode utilisé pour modifier la vitesse de la sous classe Bike en fonction du Cycliste associé.
   * @param pinaud
   */
   public void setAverageSpeed(Employee pinaud)
  {
    this.averageSpeed = pinaud.getAverageSpeed();
  }
   
  /**
   *redefinition de la methode toString() : 
   *@return  les caracteristiques d'un objet de type statique vehicle
   */
   public String toString()
   {
     return " information of the vehicule : " + this.name +" "+ this.buyPrice + "€" + " averageSpeed is : " + this.averageSpeed + "km";
   }
  
  /**
   * methode clone abstraite , redefinie dans les sous classes de Vehicle. 
   */
  public abstract Vehicle clone();


  
}




