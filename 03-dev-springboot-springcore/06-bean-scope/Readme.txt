Bean Scope
    Referes lifecylcle of a Bean
    How long it live
    How many instances
    How beans shared
##Singleton
    Spring Container Creates only one instance of a bean by Default
    Its chached in Memory
    All DI will refer the same bean
   @Component
   @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON
#
Singleton - Create Single Instance
Prototype - New Bean for each Request for DI
            @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE
Request -   Scoped to an http web request (web app)
Session -   Scoped for http session (web app)
Global-session  -   Scoped for Global- http session (web app)


Endpoint : http://localhost:8080/sidhardh/checkBeanScope

