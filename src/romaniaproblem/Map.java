/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package romaniaproblem;


import java.util.List;

/**
 *
 * @author DELL
 */
public class Map {

    private final int MAX_VERTEX = 20;
    private Vertex vertexList[];
    private int adjMatrix[][];
    private int nVertex;
    private Queue_ thQueue;
    private Queue_ temp;
    private Stack_ theStack;
    private int totalDFS;
    private int totalBFS;
    private int dist[];
    private boolean find;
    private boolean call;
    private boolean state[] = new boolean[MAX_VERTEX];
    private Queue_ closed =new Queue_();

    public Map() {
        vertexList = new Vertex[MAX_VERTEX];
        adjMatrix = new int[MAX_VERTEX][MAX_VERTEX];
        dist=new int[MAX_VERTEX];

//        from= new int[MAX_VERTEX];
        nVertex = 0;
        for (int j=0; j<MAX_VERTEX; j++)
            for(int k=0; k<MAX_VERTEX; k++)
                adjMatrix[j][k]=0;

        for (int k=0; k<MAX_VERTEX; k++)
            dist[k] = 10000000;

        thQueue = new Queue_();
        theStack = new Stack_();
    }

    public void addVertex(String lab, int urutan) {
        vertexList[nVertex++] = new Vertex(lab, urutan);

    }

    public void addEdge(int start, int end, int cost) {
        adjMatrix[start][end] = cost;
        adjMatrix[end][start] = cost;

    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].getLabel() + " ");
    }

    public int searchVertex(String nama) {
        for(int j=0; j<nVertex; j++) {
            if (vertexList[j].getLabel().equalsIgnoreCase(nama)) {
                return vertexList[j].getUrutan();
            }
          }
        return -1;
    }

    public int getAdjUnvisitedVertexBFS(int v)//, int flag)
    {
        for(int j=0; j<nVertex; j++)
            if(adjMatrix[v][j]!=0 && vertexList[j].wasVisited==false){// && vertexList[j].getTes() != flag) {
                System.out.print(" " + getCost(v, j) + " ");
                totalBFS += getCost(v, j);
                return j;
            }
        return -1;
    }

   public int getAdjUnvisitedVertexDFS(int v)//, int flag)
    {
        for(int j=0; j<nVertex; j++) {
            if(adjMatrix[v][j] !=0 && vertexList[j].wasVisited==false) {// && vertexList[j].getTes() != flag) {
                System.out.print(" " +getCost(v, j) + " ");
                totalDFS += getCost(v, j);
                return j;
            }
        }
        return -1;
    }

    public int getCost(int x, int y) {
        return adjMatrix[x][y];
    }

    public void display() {
        System.out.println();

        System.out.println("Adj. Matrix");
        for (int i=0; i<nVertex; i++) {
            for (int j=0; j<nVertex; j++) {
                System.out.print(adjMatrix[i][j] +" ");

            }
            System.out.println();
        }
        System.out.println();

    }

    public int hitungEdgeAkhir(int akhir) {
        int tes=0;
        for(int i=0; i<nVertex; i++) {

                if(adjMatrix[akhir][i] != 0) {
                    tes++;
            }
        }
        return tes;

    }

    public void DLS(int node, int akhir, int depth) {

        boolean[] visited = new boolean[MAX_VERTEX];
        for(int i=0; i<MAX_VERTEX; i++) {
            visited[i] = false;
            theStack.push(node);
        }
        int v2 = thQueue.remove();
        while((v2 = getAdjUnvisitedVertexBFS(node)) != -1) {

            depth--;
            if(v2==akhir) {
                closed.insert(v2);
                find=true;

            }

            else if (visited[v2] == false) {
                visited[v2]=true;
                temp.insert(v2);

                for(int i=0; i<temp.getSIZE(); i++) {
                    if(visited[i]==false) {
                        theStack.push(i);
                    }
                }

                closed.insert(v2);
            }


            if(find) {
                String path = "Rute: ";
                int enter=0;
                for(int i=0; i<closed.getSIZE(); i++) {
                    path = path + " " + closed.remove();
                    enter++;
                    if((enter %5) == 0)
                        path = path + "\n";
                }

                System.out.println(path);
            }
        }
    }
    public void iterative(int awal, int akhir) {
        int depth = 0;
        find = false;
        DLS(awal, akhir, depth);

        while (true) {
            if (find) break;
            else{
                depth++;
               DLS(awal, akhir, depth);
            }
        }
        System.out.print("depth: " + String.valueOf(depth));
    }

    public void aStar(int awal, int tujuan) {
        List<Vertex> list = new List<Vertex>();
        state[awal]=true;


    }
    public void bfs(int awal, int akhir) {

        vertexList[awal].wasVisited = true;
        displayVertex(awal);
        thQueue.insert(awal);
        int v2;
        while( !thQueue.isEmpty())
        {
         int v1 = thQueue.remove();

         while((v2 = getAdjUnvisitedVertexBFS(v1)) != -1)//, flag)) != -1))
            {
            vertexList[v2].wasVisited = true;

            displayVertex(v2);
            thQueue.insert(v2);

            if(v2==akhir) {
            //System.out.println(" " + akhir);
                thQueue.removeAll();
            }
         }


    }
        for(int j=0; j<nVertex; j++)
         vertexList[j].wasVisited = false;
      //}
      int y = thQueue.getSIZE();
      System.out.println();

      System.out.print("total cost BFS: " + totalBFS);

 //   flag++;
    }

     public void dfs(int awal, int akhir){

         try {
            vertexList[awal].wasVisited=true;
            displayVertex(awal);
            theStack.push(awal);
            while (!theStack.isEmpty()){

                int v=getAdjUnvisitedVertexDFS(theStack.peek());//, flag);
                if (v==-1)//jika Vertex yang di maksud tidak ada.
                    theStack.pop();
                else {
                    vertexList[v].wasVisited=true;
                    displayVertex(v);
                    theStack.push(v);
                }

                if(v==akhir) {
                    theStack.removeAllStack();
                    System.out.println(" " + akhir);
                }

            }

            for(int j=0;j<nVertex;j++)
                    vertexList[j].wasVisited=false;

           System.out.println();

           System.out.print("total cost DFS: " + totalDFS);

         }
         catch (Exception x) {
            System.out.println("Kota tidak ada");
         }
    }


}
