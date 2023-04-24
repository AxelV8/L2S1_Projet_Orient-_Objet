package Modele;


/**
 * classe Scooter : herite de classe Vehicle
 * trois nouveaux attrbuts : 
 *  a) 2 attributs d'instance : 
 *  cylindric : qui est la taille de la cylindrée du scooter
 *  consoFuel : la consommation moyenne d'essence en litre par 100km
 *  b) 1 attribut de classe :
 *  	CostLiterFuel : cout d'un litre d'essence.
 */
public class Scooter extends Vehicle
{
  protected double cylindric;
  protected double consoFuel; // number liter of essence by 100km 
  protected static double CostLiterFuel = 1.65;
  
  
  /**
   * Constructeur de la classe Scooter : fait appelle au constructeur super()
   * et attributs cylindric et consofuel recoivent les valeurs données en parametre.
   */
  public Scooter(String name, int buyPrice, double cylindric, double usedCharge, double consoFuel)
  {
    super(name, buyPrice, 30 + cylindric/50, cylindric/4, usedCharge, buyPrice/20000 + consoFuel/100 * CostLiterFuel);
    // on divise conso fuel par 100 car on veut le cout d'utilisation sur 1km, pas 100.

    this.cylindric = cylindric;
    this.consoFuel = consoFuel;


  }

  public double getCylindric()
  {
    return this.cylindric;
  }

   public double getConsoFuel()
  {
    return this.consoFuel;
  }

   public double getCostLiterFuel()
  {
    return CostLiterFuel;
  }

   /**
    * redefinition de la methode clone(), renvoie un clone de l'instance courante.
    */
  public Scooter clone()
  {
    return new Scooter(this.name, this.buyPrice,this.cylindric,this.usedCharge, this.consoFuel);
  }
}