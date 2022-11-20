import java.util.ArrayList;

public class SKT {
    private int id;
    private ArrayList fingures;
    public static int Auto_Id = 200;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList getFingures() {
        return fingures;
    }

    public void setFingures(ArrayList fingures) {
        this.fingures = fingures;
    }

    @Override
    public String toString() {
        return "SKT{" +
                "id=" + id +
                ", fingures=" + fingures +
                '}';
    }
    public void inputTable(){
        this.id = Auto_Id;
        Auto_Id++;
        System.out.println("Mỗi đội có 5 anh hùng, các anh hùng của SKT");
        ArrayList<Fingure> fingures1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Fingure fingure = new Fingure();
            fingure.inputTable();
            fingures1.add(fingure);
        }
        this.fingures = fingures1;
    }
}
