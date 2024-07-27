package graph;

public class Graph {
    String name;

    Graph(String str){
        name = str;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Equals between "+this.name+" "+((Graph)obj).name);
        if(obj == null || obj.getClass() != this.getClass()) return false;
        if(obj == this) return true;
       return (((Graph)obj).name.equals(this.name));
    }

    @Override
    public int hashCode() {

        int hashcode = (int) this.name.hashCode();
        System.out.println("name is "+this.name+" hashcode : "+hashcode);
        return hashcode;
    }
}
