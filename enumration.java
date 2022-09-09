public class enumration {
    enum Dayofweek
    {
        Monday(1),Tuesday(2),Wednesday(3),Thrusday(4),Friday(5),Saturday(6),Sunday(7);

        private int val;
        Dayofweek(int val)
        {
            this.val=val;
        }
        boolean isworkday()
        {
            if(val<6)
            return true;
            else
            return false;
        }
        public static void main(String[] args) {
            Dayofweek day;
            System.out.println("Verification of Sunday(isWeekDay())");
        System.out.println(Dayofweek.Sunday.isworkday());
        System.out.println("verification of Wednesday(isWeekDay())");
        System.out.println(Dayofweek.Wednesday.isworkday());

        }
    }
    
}
