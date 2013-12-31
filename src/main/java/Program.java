import org.hibernate.SessionFactory;
import util.HibernateUtil;

public class Program {
    public static void main(String... args) {
        SessionFactory session = HibernateUtil.getSessionFactory();
        session.openSession();
        session.close();
    }
}
