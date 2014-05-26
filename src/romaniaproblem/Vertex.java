/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package romaniaproblem;

/**
 *
 * @author DELL
 */
public class Vertex {
        private String label;
    public boolean wasVisited;
    int nextNeighbor;
    private int urutan;
    private int dist[];
    private int tes=0;

    public Vertex(String lab, int urutan) {
        this.label=lab;
        this.wasVisited=false;
        this.urutan=urutan;
    }


    public void setDist(int dikunjungiSiapa, int flag) {
        dist[flag] = dikunjungiSiapa;
        tes++;
    }
    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @return the urutan
     */
    public int getUrutan() {
        return urutan;
    }

    /**
     * @return the dist
     */
    public int[] getDist() {
        return dist;
    }

    /**
     * @return the tes
     */
    public int getTes() {
        return tes;
    }
}
