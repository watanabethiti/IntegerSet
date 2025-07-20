public class IntegerSetTest{
    public static void main(String[] args) {
        System.out.println("--- Starting CharSet Manual Tests ---");
        int passed = 0;
        int failed = 0;
        IntegerSet test = new IntegerSet();
        // Test 1: การสร้าง, เพิ่มข้อมูล
        
        test.add(50);
        test.add(70);
        String s1 = "[50,70]";
        if (test.toString().replaceAll(" ","").equals(s1)) {
            System.out.println("Tase Case 1 : PASSED: Create and add works correctly.");
            passed++;
        }else {
            System.out.println("Tast Case 1 : FAILED: exception " + test.toString() + " but got " + s1);
            failed++;
    }


    // Test 2 : การเรียงลำดับค่า
        test.add(30);
        test.add(4);
        test.add(20);
        String s2 = "[4,20,30,50,70]";
        if (test.toString().replaceAll(" ","").equals(s2)) {
            System.out.println("Tase Case 2 : PASSED: sort works correctly.");
            passed++;
        }else {
            System.out.println("Tast Case 2 : FAILED: exception " + test.toString() + " but got " + s2);
            failed++;
    }


    // Test 3: การเพิ่มข้อมูลที่ซ้ำซ้อน
        test.add(1); 
        test.add(30); //'30' ที่มีอยู่แล้ว
        test.add(5); 
        test.add(-3);
        test.add(2); 
        test.add(4); //'4' ที่มีอยู่แล้ว
        String s3 = "[-3,1,2,4,5,20,30,50,70]";
        if (test.toString().replaceAll(" ","").equals(s3)) {
            System.out.println("Tase Case 3 : PASSED: Adding a duplicate does not change the size.");
            passed++;
        }else {
            System.out.println("Tast Case 3 : FAILED: exception " + test.toString() + " but got " + s3);
            failed++;
    }

         // --- สรุปผล ---
        System.out.println("\n--------------------");
        System.out.println("--- Test Summary ---");
        System.out.println("Passed: " + passed + ", Failed: " + failed);
        if (failed == 0) {
            System.out.println("Excellent! All tests passed!");
        } else {
            System.out.println("Some tests failed.");
        }

    }
}