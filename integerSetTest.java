public class integerSetTest{
    public static void main(String[] args){
        int passed = 0;
        int failed = 0;
        integerSet a = new integerSet();
        a.add(50);
        a.add(70);
        String s = "[50,70]";
        if(a.toString().replaceAll(" ", "").equals(s))
            System.out.println("Pass");
        else
            System.out.println("Fail");




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
     
