Lazy Initialization
    Instead of creating all beans upfront we can specify lazy Initialization
  A Bean will only be initialized in the following cases
    Its Required for dependency injection
    Or Explicitly requested
    Add @Lazy Annotation to a class
--When large no of classes its a hectic task to add lazy to all classes.
Instead we can configure globally

    spring.main.lazy-initialization=true


 Only creates beans that are really needed
 may help with faster startup time if large component

