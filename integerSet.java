import java.util.ArrayList;
/** ADT  ที่เก็บเลขจำนวนเต็มใดๆ เรียงจากน้อยไปมาก และห้ามมี null หรือตัวเลขซ้ำ
 * 
 * 
 */

public class integerSet{
    ArrayList<Integer> Numbers ; // Rep

    // AF
    // AF(Number) - เซตของตัวเลขทั้งหมดที่อยู่ในArrayList Number
    // RI
    //- Integer in Number เรียงจากน้อยไปมาก
    //- Integer in Number ห้ามมี null
    //- Integer in Number ห้ามมี ตัวเลขซ้ำ


    public integerSet(){
        Numbers = new ArrayList<>();
        CheckRep();
    }
    
    private void CheckRep(){

    }
    public void add(Integer x){
        Numbers.add(x);
        CheckRep();
    }
    public String toString(){
        return Numbers.toString();
    }

}