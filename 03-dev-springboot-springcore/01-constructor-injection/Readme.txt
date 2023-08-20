##Spring Boot With Spring core
   - Dependency Injection
   -    Constructor Injection
   -    Created a Trainer Interface
   -    CricketTrainer will impliment the Interface
   -    Used that in Demo Rest Controller and Seen the Implimentation has been went to the controller via Constructor Injection

@SpringBootApplication
    @EnableAutoConfiguration
    @Componentscan
    @Configuration

-Explicitly list packages to scan
@SpringBootApplication(scanPackages("come.package1.sid","com.packcjage2.sid","org.package.sid"))