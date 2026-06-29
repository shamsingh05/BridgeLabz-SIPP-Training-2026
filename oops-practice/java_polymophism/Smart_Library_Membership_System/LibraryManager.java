public class LibraryManager {

    // Display all members and calculate fine
    public static void displayMembers(LibraryMember[] members, int overdueDays) {

        System.out.println("===== LIBRARY MEMBERS =====\n");

        for (LibraryMember member : members) {

            member.printDetails();

            // Dynamic Method Dispatch
            System.out.println("Fine for " + overdueDays +
                    " overdue days : ₹" +
                    member.calculateFine(overdueDays));

            System.out.println();
        }
    }

    // Search member by ID
    public static void searchMemberById(LibraryMember[] members, String id) {

        boolean found = false;

        for (LibraryMember member : members) {

            if (member.memberId.equalsIgnoreCase(id)) {

                System.out.println("===== MEMBER FOUND =====");
                member.printDetails();

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Member with ID " + id + " not found.");
        }
    }
}