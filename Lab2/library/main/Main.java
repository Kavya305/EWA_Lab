package library.main;
import library.model.LibraryResource;
import library.model.Book;
import library.model.DigitalResource;
import library.service.Printable;
import library.util.InputValidator;

public class Main{
    public static void main(String args[]){
        LibraryResource resources[] = new LibraryResource[5];
        resources[0] = new Book(1,"Java","James");
        resources[1] = new Book(2, "Data Structures", "Mark Allen");
        resources[2] = new DigitalResource(3, "Java E-Book", "Herbert Schildt");
        resources[3] = new Book(4, "Operating Systems", "Abraham Silberschatz");
        resources[4] = new DigitalResource(5, "Machine Learning", "Tom Mitchell");

        for(LibraryResource resource : resources){
            if(InputValidator.validateResourceId(resource.getResourceId()) && resource instanceof Printable){
                ((Printable) resource).printDetails();
            }
        }

        int overdueDays = 5;

        if (InputValidator.validateFineDays(overdueDays)) {
            for (LibraryResource resource : resources) {
                System.out.println("Fine: Rs. " + resource.calculateFine(overdueDays));
            }
        }

        LibraryResource.displayTotalResources();

    }
}