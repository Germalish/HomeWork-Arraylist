import java.util.Scanner;

public class Student {
    public static double countA = 0;
    public static double countB = 0;
    public static double countC = 0;
    private int id;
    private String name;
    private double scoreMath;
    private double scorePhysic;
    private double scoreChemistry;
    private double diemTB;
    private String rank;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScorePhysic() {
        return scorePhysic;
    }

    public void setScorePhysic(double scorePhysic) {
        this.scorePhysic = scorePhysic;
    }

    public double getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(double scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scoreMath=" + scoreMath +
                ", scorePhysic=" + scorePhysic +
                ", scoreChemistry=" + scoreChemistry +
                ", diemTB=" + diemTB +
                ", rank='" + rank + '\'' +
                '}';
    }

    public void inputTable(){
        while (true){
            try {
                System.out.print("Nhập id: ");
                this.id = new Scanner(System.in).nextInt();
                System.out.print("Nhập tên: ");
                this.name = new Scanner(System.in).nextLine();
                System.out.print("Nhập điểm toán: ");
                this.scoreMath = new Scanner(System.in).nextDouble();
                System.out.print("Nhập điểm lý: ");
                this.scorePhysic = new Scanner(System.in).nextDouble();
                System.out.print("Nhập điểm hóa: ");
                this.scoreChemistry = new Scanner(System.in).nextDouble();
                this.diemTB = (this.scoreMath + this.scorePhysic + this.scoreChemistry)/3;
                if (this.diemTB >= 8){
                    this.rank = "Xếp loại A";
                    countA++;
                }
                else if(this.diemTB >= 6.5 && this.diemTB < 8){
                    this.rank = "Xếp loại B";
                    countB++;
                }
                else {
                    this.rank = "Xếp loại C";
                    countC++;
                }
                break;
            }
            catch (Exception e){
                System.out.println("Không hợp lệ, hãy nhập lại.");
            }
        }
    }
}
