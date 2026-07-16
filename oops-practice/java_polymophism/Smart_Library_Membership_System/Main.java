public class Main {

    public static void main(String[] args) {

        LibraryMember[] members = {

                new StudentMember("Bittu Kumar", "S101"),
                new FacultyMember("Dr. Sharma", "F201"),
                new GuestMember("Rahul Singh", "G301"),
                new StudentMember("Priya Verma", "S102")
        };

        int overdueDays = 6;

        LibraryManager.displayMembers(members, overdueDays);

        System.out.println("===============================");
        System.out.println("Searching Member...");
        System.out.println("===============================");

        LibraryManager.searchMemberById(members, "F201");
    }
}