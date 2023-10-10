public final class Singleton
{
private static Singleton instance = null;
// D'autres attributs, classiques et non "static".
private int x;
private int y;
// Constructeur de l'objet.
private Singleton()
{
// La présence d'un constructeur privé supprime le constructeur public par défaut.
  super();
}
private Singleton(int x, int y){
    this.x = x;
    this.y = y;
}
// Méthode renvoyant une instance de la classe Singleton
public static Singleton getInstance()
{
if (instance == null)
{
instance = new Singleton();
}
return instance;
}
public static Singleton getInstance(int x,int y)
{
if (instance == null)
{
instance = new Singleton(x,y);
}
return instance;
}
// D'autres méthodes classiques et non "static".

public int somme(int x, int y)
{

  return x+y;
}
public float moyenne(int x, int y)
{
     return  somme(x ,y)/2;
}
public void affiche()
{
     System.out.println("\nJe suis une instance mes valeurs sont : x = " + this.x + " et y = " +this.y);
}
@Override
public Object clone() throws
CloneNotSupportedException {
throw new CloneNotSupportedException();
}
}