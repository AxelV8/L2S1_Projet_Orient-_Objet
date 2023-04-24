package Modele;

/**
 * classe Cyclist : herite de la classe Employee, represente un cycliste de la Company
 * c'est une classe abstraite, on n'instancie pas un objet de la classe Cyclist, mais 
 * uniquement de ses sous-classes.
 */

public abstract class Cyclist extends Employee
{
 
  
  
/**
 * Constructeur de la classe Cyclist :
 * fait uniquement appel au constructeur de la classe mere Employee, super().
 * 
 */
  public Cyclist (String name, double weight, double wage)
  {
    super(name,weight,wage); 
  }
  
  /**
   * methode clone abstraite, qu'on redefinie dans les classes filles de Cyclist.
   */
  public abstract Cyclist clone();
  /**
   * methode getter abstraite qu'on redefinie dans les classes filles de Cyclist.
   */
  public abstract double getAverageSpeed();

}
