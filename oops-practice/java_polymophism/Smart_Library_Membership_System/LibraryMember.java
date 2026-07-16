public class LibraryMember {

    protected String memberName;
    protected String memberId;

    public LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public void printDetails() {
        System.out.println("-----------------------------");
        System.out.println("Member Name : " + memberName);
        System.out.println("Member ID   : " + memberId);
    }

    public double calculateFine(int overdueDays) {
        return 0;
    }
}