package Utility;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateFactory {
	private static SessionFactory factory;
	private static StandardServiceRegistryBuilder builder;
	public static SessionFactory buildSessionFactory() {
		if(factory != null){
			return factory;
		}
		Configuration configuration = new Configuration().configure();
		builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		factory = configuration.buildSessionFactory(builder
				.build());
		return factory;
	}

	public static  SessionFactory getSessionFactory() {
		return buildSessionFactory();
	}
	public static void closeSessionFactory(){
		factory.close();
	}
}
