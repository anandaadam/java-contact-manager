import repositories.ContactRepository;
import repositories.ContactRepositoryImpl;
import services.ContactService;
import services.ContactServiceImpl;
import views.ContactView;

public class Main {
    public static void main(String[] args) {
        ContactRepository contactRepository = new ContactRepositoryImpl();
        ContactService contactService = new ContactServiceImpl(contactRepository);
        ContactView contactView = new ContactView(contactService);

        contactView.showMenu();
    }
}