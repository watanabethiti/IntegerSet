import java.util.ArrayList;
import java.util.Collections;

/*
    *  ADT ที่เก็บ Integer (ตัวเลข) แบบไม่ซ้ำกันและเรียงลำดับ
*/

public class IntegerSet {

    ArrayList<Integer> Numbers ; 
        
    /**
     * Constructor เริ่มต้น สร้างเซตว่าง
     */

    // Rep Invariant (RI):
    //  - Numbers จะต้องไม่มี null
    //  - Numbers จะต้องไม่มีตัวเลขซ้ำ
    //  - Numbers จะต้องเรียงลำดับจากน้อยไปมาก

    // Abstraction Function (AF):
    //  - Numbers คือเซตของตัวเลขจำนวนเต็มใดๆ 

    public IntegerSet(){
        Numbers = new ArrayList<>();
    }
    
    /**
     * ตรวจสอบว่า Rep Invariant เป็นจริงหรือไม่
     */
    private void CheckRep(){

        for (Integer i : Numbers) {
        if (i == null) {
            throw new RuntimeException("Rep invariant violated: พบ null ในเซต");
            }
        }

        for (int i = 0; i < Numbers.size() - 1; i++) {
            if (Numbers.get(i) > Numbers.get(i+1)) {
                throw new RuntimeException("Rep invariant violated: พบตัวเลขซ้ำหรือเลขไม่เรียงในเซต");
            }
        }
    }

    /**
     * เพิ่มตัวเลขเข้าเซต
     * @param x ตัวเลขที่ต้องการเพิ่ม
     */

    public void add(Integer x){
        
        if (x == null) return;
        if (!Numbers.contains(x)) {
            Numbers.add(x);
            Collections.sort(Numbers);
        }
        CheckRep();
    
    }

    /**
     * คืนค่าขนาดของเซต
     * @return จำนวนสมาชิกในเซต
     */
    public String toString(){
        return Numbers.toString();
    }


}