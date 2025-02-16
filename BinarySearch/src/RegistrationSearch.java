public class RegistrationSearch {

    Registration [] registrations;

    public RegistrationSearch() {

    }

    public Registration search(String license) {
        // TODO 1: Initialize the left index to zero
        int left = 0;

        // TODO 2: Initialize the right index to the length of the array minus 1
        int right = registrations.length - 1;

        // TODO 3: Implement the while loop to run until the left index is greater than the right index
        while (left <= right) {

            // TODO 4: Initialize the local variable middle to the index halfway between the right and left indices
            int mid = left + (right - left) / 2;

            // TODO 5: Use the String.compareTo() method to compare the Registration object's license at the middle index to the search() method parameter, license
            int comparison = license.compareTo(registrations[mid].license);

            // TODO 6: Create an IF/ELSE IF/ELSE statement to evaluate compareTo() return value
            if (comparison == 0) {
                // TODO 7: If there is a match, return that Registration object
                return registrations[mid];
            } else if (comparison < 0) {
                // TODO 9: If the Registration license is greater, shift the right index to the mid minus 1
                right = mid - 1;
            } else {
                // TODO 8: If the Registration license is less, shift the left index to the mid plus 1
                left = mid + 1;
            }
        }

        // TODO 10: If the loop completes without finding a match, return null
        return null;
    }

    public void printAll( ){
        for(Registration reg : registrations){
            System.out.println(reg);
        }
    }
    public static void main(String[] args) {

        String license = "GIG-1870";
        RegistrationSearch regSearch = new RegistrationSearch();
        System.out.println();

        /* TODO 11: Call the search() method with a license number to
                    search for. */

        // TODO 12: If the registration object is found print it

        /* TODO 13: If the registration object is not found, print
               an error */

    }

}
