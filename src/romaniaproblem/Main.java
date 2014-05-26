/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package romaniaproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    static Map newMap = new Map();

    public static void buatPeta() {
        newMap.addVertex("Neamt", 0);
        newMap.addVertex("Oradea", 1);
        newMap.addVertex("Zerind", 2);
        newMap.addVertex("Arad", 3);
        newMap.addVertex("Timisoara", 4);
        newMap.addVertex("Lugoj", 5);
        newMap.addVertex("Mehadia", 6);
        newMap.addVertex("Drobeta", 7);
        newMap.addVertex("Craiova", 8);
        newMap.addVertex("Sibiu", 9);
        newMap.addVertex("Rimnicu Vilcea", 10);
        newMap.addVertex("Fagaras", 11);
        newMap.addVertex("Pitesti", 12);
        newMap.addVertex("Bucharest", 13);
        newMap.addVertex("Glurgiu", 14);
        newMap.addVertex("Urziceni", 15);
        newMap.addVertex("Vaslui", 16);
        newMap.addVertex("Hisrova", 17);
        newMap.addVertex("Eforie", 18);
        newMap.addVertex("Iasi", 19);

        newMap.addEdge(1, 2, 71);
        newMap.addEdge(2, 3, 75);
        newMap.addEdge(1, 9, 151);
        newMap.addEdge(3, 9, 140);
        newMap.addEdge(3, 4, 118);
        newMap.addEdge(4, 5, 111);
        newMap.addEdge(5, 6, 70);
        newMap.addEdge(6, 7, 75);
        newMap.addEdge(7, 8, 120);
        newMap.addEdge(8, 10, 146);
        newMap.addEdge(8, 12, 138);
        newMap.addEdge(12, 10, 97);
        newMap.addEdge(10, 9, 80);
        newMap.addEdge(9, 11, 99);
        newMap.addEdge(11, 13, 211);
        newMap.addEdge(13, 12, 101);
        newMap.addEdge(13, 14, 90);
        newMap.addEdge(13, 15, 85);
        newMap.addEdge(15, 17, 98);
        newMap.addEdge(17, 18, 86);
        newMap.addEdge(15, 16, 142);
        newMap.addEdge(16, 19, 92);
        newMap.addEdge(19, 0, 87);
                
    }
    public static void printKota() {
        System.out.println("1. Oradea ");
        System.out.println("2. Zerind");
        System.out.println("3. Arad");
        System.out.println("4. Timisoara");
        System.out.println("5. Lugoj");
        System.out.println("6. Mehadia");
        System.out.println("7. Drobeta");
        System.out.println("8. Craiova");
        System.out.println("9. Sibiu");
        System.out.println("10. Rimnicu Vilcea");
        System.out.println("11. Fagaras");
        System.out.println("12. Pitesti");
        System.out.println("13. Bucharest");
        System.out.println("14. Glurgiu");
        System.out.println("15. Urziceni");
        System.out.println("16. Vaslui");
        System.out.println("17. Hisrova");
        System.out.println("18. Eforie");
        System.out.println("19. Iasi");
        System.out.println("20. Neamt");
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Romania Problem");
        System.out.println("List kota: ");
        printKota();
        buatPeta();
        String awal="", tujuan=""; 
        int pilihan;
        boolean status=false;
        while(status==false) {
            System.out.print("Masukkan kota awal: ");
            awal =input.readLine();
            System.out.print("Masukkan kota tujuan: ");
            tujuan = input.readLine();
            System.out.print("1. Greedy Best-First Search");
            System.out.print("2. Recursive Best-First Search");
            System.out.print("3. A*");
            System.out.print("4. Iterative Deepening A*");
            System.out.print("5. Keluar");

            String a, b;
            pilihan = Integer.parseInt(input.readLine());
            if(pilihan==0) {
            }
            else if(pilihan==1) {
            }
            else if(pilihan==2) {
            }
            else if(pilihan==3) {

            }
            else if(pilihan==4) {
                newMap.iterative(newMap.searchVertex(awal), newMap.searchVertex(tujuan));
            }
            else if(pilihan==5) {
                status=false;
                break;
            }
            else {
            }
        }
    }

    
}
