import java.util.ArrayList;

public class Edge {
    private String name;
    private String u;
    private String v;
    public Edge(String name,String u,String v){
        this.name = name;
        this.u = u;
        this.v = v;
    }
    public String getName(){
        return this.name;
    }
    public String getU(){
        return this.u;
    }
    public String getV(){
        return this.v;
    }

}
