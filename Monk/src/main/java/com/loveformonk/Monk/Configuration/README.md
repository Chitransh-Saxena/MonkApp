* A configuration class is used to configure our Java Beans (or objects)
* Beans are objects that are instantiated, assembled and managed by Spring IoC contaier
    * Spring IoC is the core of Spring
    * The container creates objects, wires them together, configures them, and manages their whole life cycle
    * Container uses dependecy injection to manage the components
    
* @Configuration - This tells the spring that this class has @Bean definition methods
    * This allows the spring container to generate spring beans from this class
    
* @Bean - This tells the container that this method produces objects (beans) to be managed by the spring container
    * This is always defined in a @Configuration file


* Spring Beans:
    * These are objects that are created, configured and managed by the Spring IoC container
    * They are defined in Spring Configuration File (files annotated with @Configuration), and then injected into our application
    * They don't implement serializable always    


* Java Beans - These are basically Java classes which adhere to certain coding standards
    * Both classes need to be public
    * Atttributes of these classes need to be private
    * Getters and setters must be present
    * Always have to be serialized
    
* POJO - Plain Old Java Objects :
    * These are ordinary java objects that do not require any framework to use
    * We do not need to run them in an application server environment (don't need any special environment settings)
    * These are lightweight, as compared to EJB (Enterprise Java Beans)