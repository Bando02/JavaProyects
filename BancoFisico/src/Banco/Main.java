package Banco;

import java.util.Scanner;
import java.io.*;

/**
 * @author Bando
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // All logical attributes here : 
        File nombreBanco = new File("nombre.txt");
        try {
            FileReader nfr = new FileReader(nombreBanco);
            BufferedReader nbr = new BufferedReader(nfr);

            String line = nbr.readLine();
            if (line == null || line.isEmpty()) {

                System.out.println("""
                    
                    - - - Bienvenido al Bancos's Fernando - - -               
                                   
                        Parece ser que es la 1 vez que usas el 
                                   
                                Banco Fernando's
                                   
                        Ingresa un nombre para tu Banco 
                                   
                        """);

                FileWriter nfw = new FileWriter(nombreBanco, false);
                BufferedWriter nbf = new BufferedWriter(nfw);

                String nom = sc.next();
                nbf.write(nom);
                nbf.close();
            } else {

            }

            nbr.close();
        } catch (IOException e) {
            System.out.println("Error de lectura de archivo");
        }

        int aux;
        boolean salir = false;

        // Creacion de todas las monedas //
        Monedas cent1 = new Monedas(" 1 Cent", false);
        Monedas cent2 = new Monedas(" 2 Cent", false);
        Monedas cent5 = new Monedas(" 5 Cent", false);
        Monedas cent10 = new Monedas(" 10 Cent", false);
        Monedas cent20 = new Monedas(" 20 Cent", false);
        Monedas cent50 = new Monedas(" 50 Cent", false);
        Monedas euro1 = new Monedas(" 1 Euro", true);
        Monedas euro2 = new Monedas(" 2 Euro", true);
        Monedas euro5 = new Monedas(" 5 Euro", true);
        Monedas euro10 = new Monedas(" 10 Euro", true);
        Monedas euro20 = new Monedas(" 20 Euro", true);
        Monedas euro50 = new Monedas(" 50 Euro", true);

        // Creacion de txt que usaremos como bbdd 
        File fcent1 = new File("unCent.txt");
        File fcent2 = new File("dosCent.txt");
        File fcent5 = new File("cincoCent.txt");
        File fcent10 = new File("diezCent.txt");
        File fcent20 = new File("veinteCent.txt");
        File fcent50 = new File("cincuentaCent.txt");
        File feuro1 = new File("unEuro.txt");
        File feuro2 = new File("dosEuro.txt");
        File feuro5 = new File("cincoEuro.txt");
        File feuro10 = new File("diezEuro.txt");
        File feuro20 = new File("veinteEuro.txt");
        File feuro50 = new File("cincuentaEuro.txt");

        try {
            FileReader nfr = new FileReader(nombreBanco);
            BufferedReader nbr = new BufferedReader(nfr);

            String nom = nbr.readLine();

            System.out.println("Bienvenido " + nom);

        } catch (IOException t) {
            System.out.println("Lectura de nombre fallida");
        }
        boolean salirMonedasCase1 = false;
        do {
            System.out.println("""
                           Seleccione una de las siguientes opciones 
                           
                            1.Consultar Saldo    2.Ingresar Saldo
                            3.Extraer Dinero     4.Explicacion App    
                            5.Salir Programa
                           
                           """);

            aux = sc.nextInt();

            switch (aux) {
                case 1 -> {
                    
                    try{
                    FileReader fr1c = new FileReader(fcent1);
                    FileReader fr2c = new FileReader(fcent2);
                    FileReader fr5c = new FileReader(fcent5);
                    FileReader fr10c = new FileReader(fcent10);
                    FileReader fr20c = new FileReader(fcent20);
                    FileReader fr50c = new FileReader(fcent50);
                    FileReader fr1e = new FileReader(feuro1);
                    FileReader fr2e = new FileReader(feuro2);
                    FileReader fr5e = new FileReader(feuro5);
                    FileReader fr10e = new FileReader(feuro10);
                    FileReader fr20e = new FileReader(fcent20);
                    FileReader fr50e = new FileReader(fcent50);
                    
                    BufferedReader br1c = new BufferedReader(fr1c);
                    BufferedReader br2c = new BufferedReader(fr2c);
                    BufferedReader br5c = new BufferedReader(fr5c);
                    BufferedReader br10c = new BufferedReader(fr10c);
                    BufferedReader br20c = new BufferedReader(fr20c);
                    BufferedReader br50c = new BufferedReader(fr50c);
                    BufferedReader br1e = new BufferedReader(fr1e);
                    BufferedReader br2e = new BufferedReader(fr2e);
                    BufferedReader br5e = new BufferedReader(fr5e);
                    BufferedReader br10e = new BufferedReader(fr10e);
                    BufferedReader br20e = new BufferedReader(fr20e);
                    BufferedReader br50e = new BufferedReader(fr50e);
                    
                    System.out.print(""
                                    
                                       
                                       
                 +"  - - - - S A L D O  D I S P O N I B L E - - - - - \n"
                  +"|                                                |\n"
                  +"|          C E N T I M O S                       |\n"
                  +"|                                                |\n"
                  +"|      1 centimo : "+br1c.readLine()+"                             |\n"
                  +"|      2 centimo : "+br2c.readLine()+"                             |\n"
                  +"|      5 centimo : "+br5c.readLine()+"                             |\n"
                  +"|     10 centimo : "+br10c.readLine()+"                             |\n"
                  +"|     20 centimo : "+br20c.readLine()+"                             |\n"
                  +"|     50 centimo : "+br50c.readLine()+"                             |\n"
                  +"|                                                |\n"
                  +"|                                                |\n"
                  +"|          E U R O S                             |\n"
                  +"|                                                |\n"
                  +"|       1 euro   : "+br1e.readLine()+"                             |\n"
                  +"|       2 euro   : "+br2e.readLine()+"                             |\n"
                  +"|       5 euro   : "+br5e.readLine()+"                             |\n"
                  +"|      10 euro   : "+br10e.readLine()+"                             |\n"
                  +"|      20 euro   : "+br20e.readLine()+"                             |\n"
                  +"|      50 euro   : "+br50e.readLine()+"                             |\n"
                  +"|                                                |\n"
                  +"|________________________________________________|\n\n"
                      
                     
                   
                            
                            
                        
                            
                            );
                    }
                    catch(IOException er){
                        System.out.println("Error en el saldo disponible");
                    }
                    break;
                }
                case 2 -> {

                    System.out.println(" - - - - SALDO BANCO - - - -");

                    int centEuros;
                    boolean salirCase1 = false;
                    boolean salirCentsCase1 = false;
                    boolean salirEurosCase1 = false;

                    do {

                        System.out.println("""
                                    ________________________________________
                                   |¿ Que tipo de monedas quieres ingresar ?|
                                   |                                        |
                                   |    1. Centimos         3.Salir         |               
                                   |    2. Euros                            |
                                   | _______________________________________|
                                   
                                   """);

                        centEuros = sc.nextInt();

                        switch (centEuros) {
                            case 1 -> {

                                do {

                                    System.out.println("""
                                    ________________________________________
                                   |¿ Que tipo de cents quieres ingresar ?  |
                                   |                                        |
                                   |    1. 1cent       4. 10cent   7.salir  |               
                                   |    2. 2cent       5. 20cent            |
                                   |    3. 5cent       6. 50cent            |
                                   | _______________________________________|
                                   
                                   """);

                                    int cents = sc.nextInt();

                                    int cant;
                                    switch (cents) {
                                        case 1 -> {
                                            System.out.println(" ¿ Cuantas monedas quieres añadir ? \n");
                                            cant = sc.nextInt();

                                            System.out.println("\n Monedas Añadidas ");

                                            try {
                                                FileReader c1fr = new FileReader(fcent1);
                                                BufferedReader cr1b = new BufferedReader(c1fr);

                                                String banco1centStr = cr1b.readLine();
                                                int banco1cent = Integer.parseInt(banco1centStr);

                                                int add1c = banco1cent + (cant * 1);
                                                
                                                insertar(cent1,add1c);

                                                cr1b.close();

                                                FileWriter c1fw = new FileWriter(fcent1, false);
                                                BufferedWriter c1bw = new BufferedWriter(c1fw);

                                                c1bw.write(String.valueOf(add1c));
                                                c1bw.close();
                                                
                                                
                                                
                                                

                                            } catch (IOException c1) {
                                                System.out.println("Error en Case 1, 1 cent");
                                            }

                                            break;
                                        }
                                        case 2 -> {

                                            System.out.println(" ¿ Cuantas monedas quieres añadir ? \n");
                                            cant = sc.nextInt();

                                            System.out.println("\n Monedas Añadidas ");

                                            try {
                                                FileReader c2fr = new FileReader(fcent2);
                                                BufferedReader cr2b = new BufferedReader(c2fr);

                                                String banco2centStr = cr2b.readLine();
                                                int banco2cent = Integer.parseInt(banco2centStr);

                                                int add2c = banco2cent + (cant * 2);

                                                cr2b.close();

                                                FileWriter c2fw = new FileWriter(fcent2, false);
                                                BufferedWriter c2bw = new BufferedWriter(c2fw);

                                                c2bw.write(String.valueOf(add2c));
                                                c2bw.close();
                                                
                                                

                                            } catch (IOException c1) {
                                                System.out.println("Error en Case 2, 2 cent");
                                            }
                                            break;
                                        }
                                        case 3 -> {

                                            System.out.println(" ¿ Cuantas monedas quieres añadir ? \n");
                                            cant = sc.nextInt();

                                            System.out.println("\n Monedas Añadidas ");

                                            try {
                                                FileReader c5fr = new FileReader(fcent5);
                                                BufferedReader cr5b = new BufferedReader(c5fr);

                                                String banco5centStr = cr5b.readLine();
                                                int banco5cent = Integer.parseInt(banco5centStr);

                                                int add5c = banco5cent + (cant * 5);

                                                cr5b.close();

                                                FileWriter c5fw = new FileWriter(fcent5, false);
                                                BufferedWriter c5bw = new BufferedWriter(c5fw);

                                                c5bw.write(String.valueOf(add5c));
                                                c5bw.close();

                                            } catch (IOException c5) {
                                                System.out.println("Error en Case 3, 5 cent");
                                            }
                                            break;
                                        }
                                        case 4 -> {

                                            System.out.println(" ¿ Cuantas monedas quieres añadir ? \n");
                                            cant = sc.nextInt();

                                            System.out.println("\n Monedas Añadidas ");

                                            try {
                                                FileReader c10fr = new FileReader(fcent10);
                                                BufferedReader cr10b = new BufferedReader(c10fr);

                                                String banco10centStr = cr10b.readLine();
                                                int banco10cent = Integer.parseInt(banco10centStr);

                                                int add10c = banco10cent + (cant * 10);

                                                cr10b.close();

                                                FileWriter c10fw = new FileWriter(fcent10, false);
                                                BufferedWriter c10bw = new BufferedWriter(c10fw);

                                                c10bw.write(String.valueOf(add10c));
                                                c10bw.close();

                                            } catch (IOException c10) {
                                                System.out.println("Error en Case 4, 10 cent");
                                            }

                                            break;
                                        }
                                        case 5 -> {

                                            System.out.println(" ¿ Cuantas monedas quieres añadir ? \n");
                                            cant = sc.nextInt();

                                            System.out.println("\n Monedas Añadidas ");

                                            try {
                                                FileReader c20fr = new FileReader(fcent20);
                                                BufferedReader cr20b = new BufferedReader(c20fr);

                                                String banco20centStr = cr20b.readLine();
                                                int banco20cent = Integer.parseInt(banco20centStr);

                                                int add20c = banco20cent + (cant * 20);

                                                cr20b.close();

                                                FileWriter c20fw = new FileWriter(fcent20, false);
                                                BufferedWriter c20bw = new BufferedWriter(c20fw);

                                                c20bw.write(String.valueOf(add20c));
                                                c20bw.close();

                                            } catch (IOException c20) {
                                                System.out.println("Error en Case 5, 20 cent");
                                            }
                                            break;
                                        }
                                        case 6 -> {
                                            System.out.println(" ¿ Cuantas monedas quieres añadir ? \n");
                                            cant = sc.nextInt();

                                            System.out.println("\n Monedas Añadidas ");

                                            try {
                                                FileReader c50fr = new FileReader(fcent50);
                                                BufferedReader cr50b = new BufferedReader(c50fr);

                                                String banco50centStr = cr50b.readLine();
                                                int banco50cent = Integer.parseInt(banco50centStr);

                                                int add50c = banco50cent + (cant * 50);

                                                cr50b.close();

                                                FileWriter c50fw = new FileWriter(fcent50, false);
                                                BufferedWriter c50bw = new BufferedWriter(c50fw);

                                                c50bw.write(String.valueOf(add50c));
                                                c50bw.close();

                                            } catch (IOException c50) {
                                                System.out.println("Error en Case 6, 50 cent");
                                            }
                                            break;
                                        }
                                        case 7 -> {
                                            salirCentsCase1 = true;
                                            break;
                                        }

                                    }
                                } while (salirCentsCase1 == false);
                                salirCentsCase1 = true;
                                break;

                            }
                            case 2 -> {

                                do {

                                    System.out.println("""
                                    ________________________________________
                                   |¿ Que tipo de euros quieres ingresar ?  |
                                   |                                        |
                                   |    1. 1euro        4. 10euro           |               
                                   |    2. 2euro        5. 20euro           |
                                   |    3. 5euro        6. 50euro           |
                                   | _______________________________________|
                                   
                                   """);

                                    int euros = sc.nextInt();

                                    int cant;
                                    switch (euros) {
                                        case 1 -> {
                                            System.out.println(" ¿ Cuantas monedas quieres añadir ? \n");
                                            cant = sc.nextInt();

                                            System.out.println("\n Monedas Añadidas ");

                                            try {
                                                FileReader e1fr = new FileReader(feuro1);
                                                BufferedReader er1b = new BufferedReader(e1fr);

                                                String banco1euroStr = er1b.readLine();
                                                int banco1euro = Integer.parseInt(banco1euroStr);

                                                int add1e = banco1euro + (cant * 1);

                                                er1b.close();

                                                FileWriter e1fw = new FileWriter(feuro1, false);
                                                BufferedWriter e1bw = new BufferedWriter(e1fw);

                                                e1bw.write(String.valueOf(add1e));
                                                e1bw.close();

                                            } catch (IOException e1) {
                                                System.out.println("Error en Case 1, 1 euro");
                                            }

                                            break;
                                        }
                                        case 2 -> {

                                            System.out.println(" ¿ Cuantas monedas quieres añadir ? \n");
                                            cant = sc.nextInt();

                                            try {
                                                FileReader e2fr = new FileReader(feuro2);
                                                BufferedReader er2b = new BufferedReader(e2fr);

                                                String banco2euroStr = er2b.readLine();
                                                int banco2euro = Integer.parseInt(banco2euroStr);

                                                int add2e = banco2euro + (cant * 2);

                                                er2b.close();

                                                FileWriter e2fw = new FileWriter(feuro2, false);
                                                BufferedWriter e2bw = new BufferedWriter(e2fw);

                                                e2bw.write(String.valueOf(add2e));
                                                e2bw.close();

                                            } catch (IOException e1) {
                                                System.out.println("Error en Case 2, 2 euro");
                                            }
                                            break;
                                        }
                                        case 3 -> {

                                            System.out.println(" ¿ Cuantas monedas quieres añadir ? \n");
                                            cant = sc.nextInt();

                                            try {
                                                FileReader e5fr = new FileReader(feuro5);
                                                BufferedReader er5b = new BufferedReader(e5fr);

                                                String banco5euroStr = er5b.readLine();
                                                int banco5euro = Integer.parseInt(banco5euroStr);

                                                int add5e = banco5euro + (cant * 5);

                                                er5b.close();

                                                FileWriter e5fw = new FileWriter(feuro5, false);
                                                BufferedWriter e5bw = new BufferedWriter(e5fw);

                                                e5bw.write(String.valueOf(add5e));
                                                e5bw.close();

                                            } catch (IOException e5) {
                                                System.out.println("Error en Case 3, 5 euro");
                                            }
                                            break;
                                        }
                                        case 4 -> {

                                            System.out.println(" ¿ Cuantas monedas quieres añadir ? \n");
                                            cant = sc.nextInt();

                                            try {
                                                FileReader e10fr = new FileReader(feuro10);
                                                BufferedReader er10b = new BufferedReader(e10fr);

                                                String banco10euroStr = er10b.readLine();
                                                int banco10euro = Integer.parseInt(banco10euroStr);

                                                int add10e = banco10euro + (cant * 10);

                                                er10b.close();

                                                FileWriter e10fw = new FileWriter(feuro10, false);
                                                BufferedWriter e10bw = new BufferedWriter(e10fw);

                                                e10bw.write(String.valueOf(add10e));
                                                e10bw.close();

                                            } catch (IOException e10) {
                                                System.out.println("Error en Case 4, 10 euro");
                                            }

                                            break;
                                        }
                                        case 5 -> {

                                            System.out.println(" ¿ Cuantas monedas quieres añadir ? \n");
                                            cant = sc.nextInt();

                                            try {
                                                FileReader e20fr = new FileReader(feuro20);
                                                BufferedReader er20b = new BufferedReader(e20fr);

                                                String banco20euroStr = er20b.readLine();
                                                int banco20euro = Integer.parseInt(banco20euroStr);

                                                int add20e = banco20euro + (cant * 20);

                                                er20b.close();

                                                FileWriter e20fw = new FileWriter(feuro20, false);
                                                BufferedWriter e20bw = new BufferedWriter(e20fw);

                                                e20bw.write(String.valueOf(add20e));
                                                e20bw.close();

                                            } catch (IOException e20) {
                                                System.out.println("Error en Case 5, 20 euro");
                                            }
                                            break;
                                        }
                                        case 6 -> {
                                            System.out.println(" ¿ Cuantas monedas quieres añadir ? \n");
                                            cant = sc.nextInt();

                                            try {
                                                FileReader e50fr = new FileReader(feuro50);
                                                BufferedReader er50b = new BufferedReader(e50fr);

                                                String banco50euroStr = er50b.readLine();
                                                int banco50euro = Integer.parseInt(banco50euroStr);

                                                int add50e = banco50euro + (cant * 50);

                                                er50b.close();

                                                FileWriter e50fw = new FileWriter(feuro50, false);
                                                BufferedWriter e50bw = new BufferedWriter(e50fw);

                                                e50bw.write(String.valueOf(add50e));
                                                e50bw.close();

                                            } catch (IOException e50) {
                                                System.out.println("Error en Case 6, 50 euro");
                                            }
                                            break;
                                        }
                                        case 7 -> {
                                            salirEurosCase1 = true;
                                            break;
                                        }

                                    }
                                } while (salirEurosCase1 == false);
                                salirEurosCase1 = true;
                                break;

                            }

                            case 3 -> {
                                salirMonedasCase1 = true;
                                break;
                            }

                        }

                    } while (salirMonedasCase1 == false);
                    salirMonedasCase1 = true;
                    break;

                }

                case 3 -> {

                }
                case 4 -> {

                    System.out.println("""
                                   
                                   Utilizacion del programa: 
                                   
                                   -> 1. Consultar saldo
                                   
                                   Cuando el programa pregunte y elijas el num 1, automaticamente
                                   buscara en tu banco el dinero ingresado y te lo devolvera todo
                                   en forma de euros, es decir, los centimos los transformara a €
                                   
                                   -> 2. Ingresar saldo
                                   
                                   Cuando el programa pregunte las cantidades a escoger solo ten-
                                   dras que elegir el num que este asociado a una moneda en espe-
                                   cifico e introducir la cantidad de monedas de ese tipo para
                                   que el programa haga la conversion solo, es decir, si tienes 
                                   4 monedas de 20centimos, añadiras 4 en el apartado de 20cent.
                                   
                                   El programa solo añadira 80centimos.
                                   
                                   
                                   """);
                    break;
                }
                case 5 -> {
                    System.out.println("""
                                   
                                    Gracias por utilizar el 
                                   
                                        BANCO FERNANDO 
                                    
                                     -- hasta la proxima --
                                   
                                   """);

                    salir = true;
                    break;
                }
            }

        } while (salir == false);

    }

    public void conversion2(File file) {

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            int centimos;
            centimos = br.read();

            int euros;
            euros = centimos / 100;

            System.out.println(" Tienes " + euros + " euros. ");

            br.close();

        } catch (IOException e) {
            System.out.println(" Error en el metodo ");

        }
    }

    public String conversion(File file, FileReader fr, BufferedReader br) {
        int euros = 0;
        try {
            String numString = br.readLine();
            int numInt = Integer.parseInt(numString);
            

            do {
                if (numInt >= 100) {
                    numInt = numInt - 100;
                    euros++;
                } else {

                }
            } while (numInt >= 100);

            

        } catch (IOException ce) {
            System.out.println("Error en la funcion conversion");
        }

        return " Total de euros " +euros;
    }
    
    public static void insertar(Monedas m,int i){
       
        m.setCantidad(i);
    }

}
