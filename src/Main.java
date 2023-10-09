// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Cliente cliente1= new Cliente("Cliente 1", new int[]{2,2,1,5,2,3});
        Cliente cliente2= new Cliente("Cliente 2", new int[]{1,3,5,1,1});
        Cliente cliente3= new Cliente("Cliente3",  new int[]{2,5,3,4,7});

        long initialTime=System.currentTimeMillis();
        //System.out.println(initialTime);

        CajeraThread Cajera1=new CajeraThread("Cajera1",cliente1,initialTime);
        CajeraThread Cajera2=new CajeraThread("Cajera2",cliente2,initialTime);
        CajeraThread Cajera3=new CajeraThread("Cajera3",cliente3,initialTime);

        Cajera1.start();
        Cajera2.start();
        Cajera3.start();
        System.out.println(Cajera1);
        System.out.println(Cajera2);
        System.out.println(Cajera3);

    }
 }
