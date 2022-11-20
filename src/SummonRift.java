import java.util.ArrayList;

public class SummonRift {
    private ArrayList<G2> g2s;
    private ArrayList<SKT> skts;

    public ArrayList<G2> getG2s() {
        return g2s;
    }

    public void setG2s(ArrayList<G2> g2s) {
        this.g2s = g2s;
    }

    public ArrayList<SKT> getSkts() {
        return skts;
    }

    public void setSkts(ArrayList<SKT> skts) {
        this.skts = skts;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "g2s=" + g2s +
                ", skts=" + skts +
                '}';
    }
    public void inputTable(){
        ArrayList<G2> g2s1= new ArrayList<>();
        G2 g2 = new G2();
        g2.inputTable();
        g2s1.add(g2);
        this.g2s = g2s1;
        ArrayList<SKT> skts1= new ArrayList<>();
        SKT skt = new SKT();
        skt.inputTable();
        skts1.add(skt);
        this.skts = skts1;
    }
}
