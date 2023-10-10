public final class Arithmetique {

    private static Arithmetique instance = null;

    private int x;
    private int y;
    private String z;

    private Arithmetique(){
        super();
    }
    
    private Arithmetique(int x, int y, String z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public static Arithmetique getInstance() {
        if (instance == null) {
            instance = new Arithmetique();
        }
        return instance;
    }
    
   public static Arithmetique getInstance(int x, int y) {
      if (instance == null) {
        instance = new Arithmetique(x, y, "");
    }
    return instance;
}

    public int somme(int x, int y) {
        this.z = "somme";
        this.x = x;
        this.y = y;
        return x + y;
    }

    public int soustraction(int x, int y) {
        this.z = "soustraction";
        this.x = x;
        this.y = y;
        return x - y;
    }

 public int multiplication(int x, int y) {
    this.z = "multiplication";
    this.x = x;
    this.y = y;
    return x * y;
}

    public float division(int x, int y) {
        if(y == 0) {
            System.out.println("Division par zéro !");
            return Float.NaN;  // Not a Number
        }
        this.z = "division";
        this.x = x;
        this.y = y;
        return (float) x / y;
    }

    public void affiche() {
        System.out.println("Je suis une instance. Mes valeurs sont : x = " + this.x + ", y = " + this.y + " et z = " + this.z);
    }
}
